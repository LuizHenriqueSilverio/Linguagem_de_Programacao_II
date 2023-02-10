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
public class Exercicio06 {
    public static void main(String[] args) {
        int comprimento;
        int largura;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o comprimento: ");
        comprimento = entrada.nextInt();
        System.out.println("Insira a largura: ");
        largura = entrada.nextInt();
        
        System.out.println("Area do retangulo: " + (comprimento * largura));
        System.out.println("Perimetro do retangulo: " + (comprimento * 2) * (largura * 2));
    }
}
