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
public class Exercicio11 {
    public static void main(String[] args) {
        int km, dias, cortesia;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de dias: ");
        dias = entrada.nextInt();
        cortesia = dias * 60;
        
        System.out.println("Insira a quantidade de quilometros rodados");
        km = entrada.nextInt();
        km = km - cortesia;
        
        System.out.println("Valor total a ser pago: R$" + ((dias * 45) + (km * 0.5)));
    }
}
