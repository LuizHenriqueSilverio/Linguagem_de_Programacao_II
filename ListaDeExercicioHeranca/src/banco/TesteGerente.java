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
public class TesteGerente {
    public static void main(String[] args) {
        Gerente objGerente = new Gerente();
        
        objGerente.setNome("Luiz");
        objGerente.setSenha("123456789");
        objGerente.autentica("1234");
        objGerente.autentica("123456789");
        
        objGerente.setSalario(5000.00);
        objGerente.mostra();
        
        System.out.println("Bonificacao: " + objGerente.getBonificacao());
    }
}
