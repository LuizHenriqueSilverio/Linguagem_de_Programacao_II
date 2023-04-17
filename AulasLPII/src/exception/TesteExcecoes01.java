/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class TesteExcecoes01 {
    public static void main(String[] args) {
        Scanner entrada = null;
        //File c = new File("./");
        //System.out.println(c.getAbsolutePath());
        try{
            entrada = new Scanner(new File("./src/exception/teste.txt"));
            while(entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }
        }catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir o arquivo teste: " + ex.getMessage());
        }
    }
}
