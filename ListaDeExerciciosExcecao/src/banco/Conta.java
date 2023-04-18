package banco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author luizh
 */
abstract class Conta {

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private double saldo = 0;
    private double limite;
    private int numero;
    private static int totalDeContas;
    private Cliente titular;
    
    public Conta() {
        System.out.println("Conta criada com sucesso.");
        Conta.totalDeContas += 1;
    }
    
    public Conta(double saldo) {
        this(); //invoca o construtor padrão
        this.saldo = saldo;
    }
    
    public Conta(double saldo, int numero) {
        this(saldo);
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public int getTotal() {
        return Conta.totalDeContas;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setCliente(Cliente cliente){ 
        this.titular = cliente;
    }
    
    public void deposita(double deposito) throws ValorInvalidoException {
        if(deposito < 0) {
            // throw new IllegalArgumentException("Voce tentou depositar um valor negativo!");
            throw new ValorInvalidoException(deposito);
        }else {
            this.setSaldo(this.getSaldo() + deposito);
        }
    }
    
    public boolean saca(double saque) {
        if(this.saldo < saque) {
            return false;
        }
        this.setSaldo(this.saldo - saque);
        return true;
    }
    
    public boolean transferir(Conta conta, double valor) {
        if(this.saldo < valor) {
            return false;
        }
        this.setSaldo(this.saldo - valor);
        conta.setSaldo(conta.saldo + valor);
        return true;
    }
    
    abstract void atualiza(double taxa);
    
}
