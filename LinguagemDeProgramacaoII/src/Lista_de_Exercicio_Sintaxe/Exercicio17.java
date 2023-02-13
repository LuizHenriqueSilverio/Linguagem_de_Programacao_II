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
public class Exercicio17 {
    public static void main(String[] args) {
        int num;
        String letra;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira a quantidade: ");
        num = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Insira a letra: ");
        letra = entrada.nextLine();
        
        for(int i = 0; i < num; i++) {
            System.out.print(letra);
        }
    }
}
