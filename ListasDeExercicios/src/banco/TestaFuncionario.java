/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author luizh
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Fiodor");
        f1.setSalario(2500.00);
        f1.bonifica(150.00);
        f1.setDataEntrada("25-10-2008");
        f1.setDepartamento("TI");
        f1.setRg("12.345-28");
        
        f1.mostra();
        
        f1.demite();
        
        f1.mostra();
        
    }
}
