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
public class Exercicio08 {
    public static void main(String[] args) {
        int hp, lp;
        int ha, la, qtd;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira a altura da parede(em cm): ");
        hp = entrada.nextInt();
        System.out.println("Insira a largura da parede(em cm): ");
        lp = entrada.nextInt();
        System.out.println("Insira a altura do azulejo(em cm): ");
        ha = entrada.nextInt();
        System.out.println("Insira a largura do azulejo(em cm): ");
        la = entrada.nextInt();
        
        qtd = (hp * lp) / (ha * la);
        
        System.out.println("Quantidade de azulejos necessarios para cobrir a parede = " + qtd);
    }
}