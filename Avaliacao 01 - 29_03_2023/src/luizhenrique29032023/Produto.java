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
public class Produto {
    private String nome;
    private double valorProduto;

    public Produto(String nome, double valor) {
        this.setNome(nome);
        this.setValorProduto(valor);
    }
    
    /**
     * 
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
     * @return the valorProduto
     */
    public double getValorProduto() {
        return valorProduto;
    }

    /**
     * @param valorProduto the valorProduto to set
     */
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
}
