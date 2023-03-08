/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_de_Exercicio_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double real;
        double dolar;
        
        System.out.println("Insira a quantidade em dólar: ");
        dolar = entrada.nextDouble();
        
        real = dolar * 5.10;
        System.out.printf("Conversão para reais: %.2f", real);
    }
}
