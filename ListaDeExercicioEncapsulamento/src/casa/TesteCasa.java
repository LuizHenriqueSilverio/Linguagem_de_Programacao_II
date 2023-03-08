/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author luizh
 */
public class TesteCasa {
    public static void main(String[] args) {
        Casa c1 = new Casa();
        
        c1.pinta("Bege");
        
        Porta p1 = new Porta("Vermelho", 120, 250, 50);
        Porta p2 = new Porta("Azul", 120, 250, 50);
        Porta p3 = new Porta("Amarelo", 120, 250, 50);
        
        c1.setPorta1(p1);
        c1.setPorta2(p2);
        c1.setPorta3(p3);
        
        c1.getPorta1().abre();
        c1.getPorta2().fecha();
        c1.getPorta3().abre();
        
        System.out.println("Cor da casa: " + c1.getCor());
        System.out.println("Qtd de portas abertas: " + c1.qtdPortasAbertas());
    }
}
