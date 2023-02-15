/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class EntradaPadrao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in, "iso-8859-1");
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.println("Olá, " + nome + "!");
        System.out.println("Você possui " + idade + " anos.");
    }
}