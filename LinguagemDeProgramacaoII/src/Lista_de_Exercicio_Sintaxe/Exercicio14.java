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
public class Exercicio14 {
    public static void main(String[] args) {
        String palavra, letra;
        int tam;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira a palavra: ");
        palavra = entrada.nextLine();
        
        tam = palavra.length();
        
        for(int i = 0; i < tam; i++) {
            letra = palavra.substring(i, i+1);
            if(letra.equals("a") || letra.equals("A")) {
                System.out.println("A palavra contem a letra 'a'!");
                return;
            }
        }
        
        System.out.println("A palavra nao contem a letra 'a'!");
    }
}
