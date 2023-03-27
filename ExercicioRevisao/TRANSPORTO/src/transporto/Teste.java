/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporto;

/**
 *
 * @author luizh
 */
public class Teste {
    public static void main(String[] args) {
        Carreta c1 = new Carreta("Carreta CT-7000");
        Caminhoneiro cam1 = new Caminhoneiro("Joao Alves", "12.345.789/0001-10", "123.456.789-10", 2500.00);
        Viagem v1 = new Viagem(4.5, .0, 350.0);
        Cliente cli1 = new Cliente("Pedro", cam1, v1, c1);
        
        v1.setDestino("Sao Paulo");
        v1.calcularViagem();
        cli1.visualizarViagem();
    }
}
