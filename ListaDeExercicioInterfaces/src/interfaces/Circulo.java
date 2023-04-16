/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author luizh
 */
public class Circulo implements AreaCalculavel {
    private int raio;
    
    public Circulo(int raio) {
        this.setRaio(raio);
    }
    
    public double calculaArea() {
        return Math.PI * this.getRaio() * this.getRaio();
    }

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }
}
