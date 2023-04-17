/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author luizh
 */
public class GerenciadorDeImpostoDeRenda {
    private double total;
    
    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.calculaTributos();
    }
    
    public double getTotal() {
        return this.total;
    }
}
