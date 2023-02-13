/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_de_Exercicio_Sintaxe;

/**
 *
 * @author luizh
 */
public class Exercicio10 {
    public static void main(String[] args) {
        int x = 4;
        
        System.out.println("O valor e " + ((x > 4) ? 99.99 : 9));
        
        // O código acima é um teste condicional
        // A saída é 9, pois x não é maior que 4
        // Se o teste fosse x >= 4 ou x fosse maior que 4, a saída seria 99.99
    }
}
