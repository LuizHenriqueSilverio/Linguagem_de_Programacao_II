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
public class Exercicio09 {
    public static void main(String[] args) {
        int areaTotal, areaCons, areaCalc;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira a area total do terreno: ");
        areaTotal = entrada.nextInt();
        System.out.println("Insira a area construida do terreno: ");
        areaCons = entrada.nextInt();
        
        areaCalc = areaTotal - areaCons;
        
        System.out.println("Valor total a ser pago: R$" + ((areaCalc * 3.8) + (areaCons * 5.0)));
        
    }
}
