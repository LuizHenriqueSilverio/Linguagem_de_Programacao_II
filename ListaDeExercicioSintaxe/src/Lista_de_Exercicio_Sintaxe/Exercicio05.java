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
public class Exercicio05 {
    
    public static void main(String[] args) {
        double altura;
        double peso;
        double imc;
        int sexo;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o sexo: 0-Masculino 1-Feminino");
        sexo = entrada.nextInt();
        System.out.println("Insira a altura: ");
        altura = entrada.nextDouble();
        System.out.println("Insira o peso: ");
        peso = entrada.nextDouble();
        
        imc = peso / (altura * altura);
        
        switch(sexo){
            case 0:
                if(imc < 20.7){
                    System.out.println("Você está abaixo do peso!");
                }else if(imc >= 20.7 && imc <= 26.4){
                    System.out.println("Você está no peso ideal!");
                }else{
                    System.out.println("Você está obeso!");
                }
                break;
            case 1:
                if(imc < 19.1){
                    System.out.println("Você está abaixo do peso!");
                }else if(imc >= 19.1 && imc <= 25.8){
                    System.out.println("Você está no peso ideal!");
                }else{
                    System.out.println("Você está obesa!");
                }
                break;
            default:
                System.out.println("Insira um sexo válido!");
                break;
        }
    } 
}
