/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author luizh
 */
public class TesteConstrutor {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(6000.00);
        Conta conta3 = new Conta(5000.00, 78285);
        System.out.println("Total de Contas: " + conta1.getTotal());
    }
}
