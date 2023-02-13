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
public class Exercicio12 {
    public static void main(String[] args) {
        double renda;
        double total;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira a sua renda anual: ");
        renda = entrada.nextDouble();
        
        if(renda <= 10800.00) {
            System.out.println("Valor a pagar: isento");
        }else if(renda > 10800.00 && renda <= 21600.00) {
            total = (renda * 0.15) - 1620.0;
            System.out.printf("Valor a pagar: R$%.2f \n", total);
        }else{ 
            total = (renda * 0.275) - 4320.0;
            System.out.printf("Valor a pagar: R$%.2f \n", total);
        }
    }
}
