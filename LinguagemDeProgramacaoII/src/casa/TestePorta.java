/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author luizh
 */
public class TestePorta {
    public static void main(String[] args) {
        Porta p1 = new Porta("Vermelho", 120, 250, 50);
        
        p1.fecha();
        p1.abre();
        p1.fecha();
        
        p1.getCor();
        p1.setCor("Azul");
        p1.getCor();
        p1.setCor("Amarelo");
        p1.getCor();
        
        System.out.println("Dimensao Y da porta: " + p1.getDimensaoY());
        p1.setDimensaoY(300);
        System.out.println("Dimensao Y da porta: " + p1.getDimensaoY());
        System.out.println("Dimensao X da porta: " + p1.getDimensaoX());
        p1.setDimensaoX(150);
        System.out.println("Dimensao Y da porta: " + p1.getDimensaoX());
        
        p1.estaAberta();
    }
}
