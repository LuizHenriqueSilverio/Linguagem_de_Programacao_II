/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luizhenrique29032023;

/**
 *
 * @author luizh
 */
public class Servico {
    private static int qtd = 0;
    private int idServico;
    private double valorServico;
    private String descricao;
    
    public Servico() {
        Servico.qtd++;
        this.setIdServico(Servico.getQtd());
    }

    /**
     * @return the idServico
     */
    public int getIdServico() {
        return idServico;
    }

    /**
     * @param idServico the idServico to set
     */
    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    /**
     * @return the valorServico
     */
    public double getValorServico() {
        return valorServico;
    }

    /**
     * @param valorServico the valorServico to set
     */
    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    /**
     * @return the qtd
     */
    public static int getQtd() {
        return qtd;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
