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
public class Exercicio13 {
    public static void main(String[] args) {
        int pessoas, dias, valor;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o numero de pessoas inclusas no pacote: ");
        pessoas = entrada.nextInt();
        System.out.println("Insira a quantidade de dias do pacote: ");
        dias = entrada.nextInt();
        
        if(pessoas < 4) {
            valor = (pessoas * 160);
            valor *= dias;
            System.out.println("Valor a ser pago: R$" + valor);
        }else if(pessoas >= 5 && pessoas <= 8) {
            valor = (pessoas * 120);
            valor *= dias;
            System.out.println("Valor a ser pago: R$" + valor);
        }else {
            valor = (pessoas * 80);
            valor *= dias;
            System.out.println("Valor a ser pago: R$" + valor);
        }
    }
}
