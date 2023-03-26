/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author luizh
 */
public class TestaContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(1000.00);
        cc.deposita(1000.00);
        cp.deposita(1000.00);
        
        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        
        System.out.println("Conta: " + c.getSaldo());
        System.out.println("Conta corrente: " + cc.getSaldo());
        System.out.println("Conta poupanca: " + cp.getSaldo());
        
        /*
            A Conta "c" possui como saldo "1100.00", pois foi efetuado um depósito
            de "1000.00" e atualizado com uma taxa de "0.10", ou seja, foram depositados
            mais "100.00" no saldo.
        
            A Conta Corrente "cc" possui como saldo "1197.80", pois foi efetuado um depósito
            de "1000.00" subtraindo 1 real por se tratar de uma conta corrente, 
            e atualizado com uma taxa de "0.10" vezes 2(pois contas correntes tem a taxa dobrada), 
            ou seja, um valor de "199,80", do qual também foi subtraido 1 real ao depositar.
        
            A Conta "c" possui como saldo "1300.00", pois foi efetuado um depósito
            de "1000.00" e atualizado com uma taxa de "0.10" vezes 3(pois contas correntes tem a taxa triplicada), 
            ou seja, foram depositados mais "300.00" no saldo.
        */
    }
}
