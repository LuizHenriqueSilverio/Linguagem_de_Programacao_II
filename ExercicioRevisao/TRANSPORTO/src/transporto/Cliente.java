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
public class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    private Caminhoneiro c1;
    private Viagem viagem1;
    private Carreta carreta1;
    
    public Cliente(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the c1
     */
    public Caminhoneiro getC1() {
        return c1;
    }

    /**
     * @param c1 the c1 to set
     */
    public void setC1(Caminhoneiro c1) {
        this.c1 = c1;
    }

    /**
     * @return the viagem1
     */
    public Viagem getViagem1() {
        return viagem1;
    }

    /**
     * @param viagem1 the viagem1 to set
     */
    public void setViagem1(Viagem viagem1) {
        this.viagem1 = viagem1;
    }

    /**
     * @return the carreta1
     */
    public Carreta getCarreta1() {
        return carreta1;
    }

    /**
     * @param carreta1 the carreta1 to set
     */
    public void setCarreta1(Carreta carreta1) {
        this.carreta1 = carreta1;
    }
    
    public void visualizarViagem() {
        System.out.println("Cliente: " + this.getNome());
        System.out.println("Motorista: " + this.getC1().getNome());
        System.out.println("Veiculo: " + this.getCarreta1().getModeloCarreta());
        System.out.println("Destino: " + this.getViagem1().getDestino());
        System.out.print("Valor KM: " + this.getViagem1().getValorKM() + " ");
        System.out.println("Distancia: " + this.getViagem1().getDistancia());
        System.out.println("Valor total viagem: " + this.getViagem1().getValorViagem());
    }
    
}
