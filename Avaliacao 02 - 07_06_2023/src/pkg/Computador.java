/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

/**
 *
 * @author luizh
 */
abstract public class Computador extends Aparelho {
    
    public Computador(String marca, String modelo, String cor, double peso, Data dataGarantia) {
        super(marca, modelo, cor, peso, dataGarantia);
    }
    
}
