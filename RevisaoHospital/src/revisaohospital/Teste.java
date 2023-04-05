/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaohospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Paciente pac = new Paciente();
        Medico med = new Medico();
        Enfermeiro enf = new Enfermeiro();
        
        System.out.println("Insira o nome do paciente: ");
        pac.setNome(entrada.nextLine());
        System.out.println("Insira o nome do medico: ");
        med.setNome(entrada.next());
        System.out.println("Insira o nome do enfermeiro: ");
        enf.setNome(entrada.next());        
        
        Internacao internacao = new Internacao(pac, enf, med);
        
        System.out.println("Insira o motivo da internação: ");
        internacao.setMotivo(entrada.next());
        System.out.println("Insira o custo por dia: ");
        internacao.setValorDia(entrada.nextDouble());
        System.out.println("Insira a quantidade de dias: ");
        internacao.setDias(entrada.nextInt());
        
        List<Internacao> listaInternacao = new ArrayList<>();
        
        listaInternacao.add(internacao);
        
        for(Internacao i : listaInternacao) {
            System.out.println("Paciente: " + i.getPac().getNome());
            System.out.println("Medico: " + i.getMed().getNome());
            System.out.println("Enfermeiro: " + i.getEnf().getNome());
            System.out.println("Nº da Internacao: " + i.getIdentificador());
            System.out.println("Motivo: " + i.getMotivo());
            System.out.println("Valor do dia de internação: R$" + i.getValorDia());
            System.out.println("Dias de internacao: " + i.getDias());
            System.out.println("Valor total de internacao: " + (i.getDias() * i.getValorDia()));
        }
        
        
        
        
    }
}
