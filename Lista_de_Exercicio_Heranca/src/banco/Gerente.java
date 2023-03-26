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
public class Gerente extends Funcionario{
    private String senha;
    private int funcGerenciados;
    
    public Gerente() {
        super();
    }
    
    public boolean autentica(String senha) {
        if(this.getSenha().equals(senha)) {
            System.out.println("Acesso permitido.");
            return true;
        }else {
            System.out.println("Acesso negado.");
            return false;
        }
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the funcGerenciados
     */
    public int getFuncGerenciados() {
        return funcGerenciados;
    }

    /**
     * @param funcGerenciados the funcGerenciados to set
     */
    public void setFuncGerenciados(int funcGerenciados) {
        this.funcGerenciados = funcGerenciados;
    }
    
    public double getBonificacao() {
        return this.getSalario() * 0.10;
    }
}
