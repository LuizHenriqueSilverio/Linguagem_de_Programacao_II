/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author luizh
 */
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca() {
        super();
    }
    
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo() * (taxa * 3));
    }
    
    public void deposita(double deposito) {
        super.deposita(deposito);
    }
}
