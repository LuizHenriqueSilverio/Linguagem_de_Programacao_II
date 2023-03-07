/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o nome: ");
        p1.setNome(entrada.nextLine());
        System.out.println("Insira a idade: ");
        p1.setIdade(entrada.nextInt());
        
        p1.fazAniversario();
        System.out.println("Feliz aniversario, " + p1.getNome() + "!");
        p1.fazAniversario();
        System.out.println("Feliz aniversario, " + p1.getNome() + "!");
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}
