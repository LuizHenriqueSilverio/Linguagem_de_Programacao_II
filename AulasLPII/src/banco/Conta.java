/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author luizh
 */
public class Conta {
    private double saldo = 0;
    private double limite;
    private int numero;
    private static int totalDeContas;
    private Cliente titular;
    
    public Conta() {
        System.out.println("Construindo uma conta");
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
    
    public void deposita(double deposito) {
        this.saldo += deposito;
        System.out.println("Deposito efetuado para " + titular.getNome() +  " com sucesso.");
    }
    
    public boolean saca(double saque) {
        if(this.saldo < saque) {
            return false;
        }
        this.saldo -= saque;
        return true;
    }
    
    public boolean transferir(Conta conta, double valor) {
        if(this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        conta.saldo += valor;
        return true;
    }
    
}
