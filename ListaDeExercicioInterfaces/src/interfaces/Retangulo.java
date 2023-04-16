/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author luizh
 */
public class Retangulo implements AreaCalculavel{
    private int largura;
    private int altura;
    
    public Retangulo(int largura, int altura) {
        this.setLargura(largura);
        this.setAltura(altura);
    }
    
    public double calculaArea() {
        return this.getLargura() * this.getAltura();
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
