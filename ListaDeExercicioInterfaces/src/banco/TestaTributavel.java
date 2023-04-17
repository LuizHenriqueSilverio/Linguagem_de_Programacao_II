/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author luizh
 */
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        
        cc.deposita(100);
        
        System.out.println(cc.calculaTributos());
        
        //testando polimorfismo
        
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}
