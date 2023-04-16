/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author luizh
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        System.out.println("Area: " + a.calculaArea());
        
        AreaCalculavel b = new Circulo(6);
        System.out.println("Area: " + b.calculaArea());
        
        AreaCalculavel c = new Quadrado(5);
        System.out.println("Area: " + c.calculaArea());
    }
    
}
