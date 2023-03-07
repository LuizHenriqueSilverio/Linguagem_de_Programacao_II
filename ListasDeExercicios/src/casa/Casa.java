/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author luizh
 */
public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void pinta(String cor) {
        this.cor = cor;
    }

    /**
     * @return the porta1
     */
    public Porta getPorta1() {
        return porta1;
    }

    /**
     * @param porta1 the porta1 to set
     */
    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    /**
     * @return the porta2
     */
    public Porta getPorta2() {
        return porta2;
    }

    /**
     * @param porta2 the porta2 to set
     */
    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    /**
     * @return the porta3
     */
    public Porta getPorta3() {
        return porta3;
    }

    /**
     * @param porta3 the porta3 to set
     */
    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    public int qtdPortasAbertas() {
        int qtd = 0;
        if(porta1.estaAberta()) {
            qtd++;
        }
        if(porta2.estaAberta()) {
            qtd++;
        }
        if(porta3.estaAberta()) {
            qtd++;
        }
        
        return qtd;
    }
}
