/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class Exercicio15 {
    public static void main(String[] args) {
        String num, teste = "";
        int tam;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira um numero: ");
        num = entrada.nextLine();
        tam = num.length();
        
        for(int i = (tam - 1); i >= 0; i--) {
            teste = teste + num.charAt(i);
        }
        
        if(teste.equals(num)) {
            System.out.println("O numero e uma capicua!");
        }else {
            System.out.println("O numero nao e uma capicua!");
        }
    }
}
