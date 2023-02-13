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
        minhaConta.deposita(entrada.nextDouble());
        System.out.println("Saldo na conta: R$" + minhaConta.saldo);
    }
}
