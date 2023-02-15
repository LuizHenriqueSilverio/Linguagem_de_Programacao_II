/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class App {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        
        Scanner entrada = new Scanner(System.in);
        
        minhaConta.saldo = 1000.0;
        System.out.println("Saldo na conta: R$" + minhaConta.saldo);
        
        System.out.println("Digite um valor para depositar: ");
        minhaConta.deposita(entrada.nextDouble());
        System.out.println("Saldo na conta: R$" + minhaConta.saldo);
        
        System.out.println("Digite um valor para sacar: ");
        boolean saque = minhaConta.saca(entrada.nextDouble());
        
        if(saque) {
            System.out.println("Saldo na conta: R$" + minhaConta.saldo);
        }else {
            System.out.println("Valor de saque maior que o de saldo na conta. Saque nao efetuado.");
        }
        
        Conta outraConta = new Conta();
        
        System.out.println("Digite um valor para transferir: ");
        boolean transf = minhaConta.transferir(outraConta, entrada.nextDouble());
        
        if(transf) {
            System.out.println("Saldo na conta debitada: R$" + minhaConta.saldo);
            System.out.println("Saldo na conta creditada: R$" + outraConta.saldo);
        }else {
            System.out.println("Valor de transferencia maior que o de saldo na conta. Transferencia nao efetuada.");
        }
        
    }
}
