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
public class Exercicio16 {
    public static void main(String[] args) {
        String palavra, letra;
        int tam, i = 0, qtd = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira uma palavra: ");
        palavra = entrada.nextLine();
        tam = palavra.length();
        
        while(i < tam) {
            letra = palavra.substring(i, i + 1);
            if(letra.equals("a") || letra.equals("A")) {
                qtd++;
            }
            i++;
        }
        
        System.out.println("A palavra contem " + qtd + " letra(s) 'a'.");
    }
}
