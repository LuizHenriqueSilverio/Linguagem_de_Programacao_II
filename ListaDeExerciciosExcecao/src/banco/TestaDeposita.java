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
public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        
        try {
            cp.deposita(-100);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
