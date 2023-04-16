/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author luizh
 */
public class Quadrado implements AreaCalculavel {
    private int lado;
    
    public Quadrado(int lado) {
        this.setLado(lado);
    }
    
    public double calculaArea() {
        return this.getLado() * this.getLado();
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
}
