/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luizhenrique29032023;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class Teste {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Cliente cli1 = new Cliente();
        System.out.println("Insira o nome do cliente: ");
        String nome = entrada.nextLine();
        Cliente cli2 = new Cliente(nome);
        
        System.out.println("Insira o nome e o valor do produto: ");
        String nomeProd = entrada.next();
        double valorProd = entrada.nextDouble();
        Produto p1 = new Produto(nomeProd, valorProd);
        
        Servico s1 = new Servico();
        System.out.println("Insira a descricao do servico: ");
        String desc = entrada.next();
        System.out.println("Insira o valor do servico: ");
        double valorServ = entrada.nextDouble();
        s1.setDescricao(desc);
        s1.setValorServico(valorServ);
        
        Animal a1 = new Animal();
        System.out.println("Insira o nome do animal: ");
        String nomeAnimal = entrada.next();
        a1.setNome(nomeAnimal);
        
        Funcionario f1 = new Funcionario();
        System.out.println("Insira o nome do funcionario: ");
        f1.setNome(entrada.next());
        f1.setAnimal(a1);
        f1.setCliente(cli2);
        f1.insereProduto(p1);
        f1.insereServico(s1);
        f1.calcula();
        
        System.out.println("Nome do cliente: " + cli2.getNome());
        System.out.println("Nome do animal: " + a1.getNome());
        System.out.println("Identificador do servico: " + s1.getIdServico());
        System.out.println("Servico prestado: " + s1.getDescricao());
        System.out.println("Valor do servico: " + s1.getValorServico());
        System.out.println("Produto vendido: " + p1.getNome());
        System.out.println("Valor do produto: " + p1.getValorProduto());
        System.out.println("Total a pagar: " + cli2.getValorTotal());
    }
}
