/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luizhenrique29032023;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luizh
 */
public class Funcionario {
    private String nome;
    private Animal animal;
    private Cliente cliente;
    private List<Servico> listaServico = new ArrayList<>();
    private List<Produto> listaProduto = new ArrayList<>();
    

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
     * @return the animal
     */
    public Animal getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the listaServico
     */
    public List<Servico> getListaServico() {
        return listaServico;
    }

    /**
     * @return the listaProduto
     */
    public List<Produto> getListaProduto() {
        return listaProduto;
    }
    
    public void insereProduto(Produto p) {
        this.getListaProduto().add(p);
    }
    
    public void insereServico(Servico s) {
        this.getListaServico().add(s);
    }
  
    public void calcula() {
        double valorT = 0.0;
        
        for(Produto p : listaProduto){
            valorT += p.getValorProduto();
        }
        
        for(Servico s : listaServico) {
            valorT += s.getValorServico();
        }
        
        this.getCliente().setValorTotal(valorT);
    }
}
