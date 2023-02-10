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
public class Exercicio07 {
    public static void main(String[] args) {
        double[] nota;
        nota = new double[4];
        double media = 0.0;
        
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < 4; i++) {
            System.out.print("Insira a nota " + (i+1) + ": ");
            nota[i] = entrada.nextDouble();
            media += nota[i];
        }
        
        media = media / 4;
        
        if(media <= 3.49) {
            System.out.println("O aluno esta reprovado.");
        }else if(media >= 3.5 && media <= 6.49) {
            System.out.println("O aluno esta em recuperacao.");
        }else {
            System.out.println("O aluno esta aprovado.");
        }
    }
}
