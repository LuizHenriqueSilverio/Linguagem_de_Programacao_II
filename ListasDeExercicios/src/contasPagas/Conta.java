/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contasPagas;

/**
 *
 * @author luizh
 */
public class Conta {
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    private Produto pro;
    private Cliente cli;

    /**
     * @return the idConta
     */
    public int getIdConta() {
        return idConta;
    }

    /**
     * @param idConta the idConta to set
     */
    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    /**
     * @return the dataVencimento
     */
    public String getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento the dataVencimento to set
     */
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return the dataPagamento
     */
    public String getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    /**
     * @return the pro
     */
    public Produto getPro() {
        return pro;
    }

    /**
     * @param pro the pro to set
     */
    public void setPro(Produto pro) {
        this.pro = pro;
    }

    /**
     * @return the cli
     */
    public Cliente getCli() {
        return cli;
    }

    /**
     * @param cli the cli to set
     */
    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    public void visualizarConta() {
        System.out.println("IDENTIFICADOR: " + this.getIdConta());
        System.out.println("PRODUTO: " + this.getPro().getDescricaoProduto());
        System.out.println("CLIENTE: " + this.getCli().getNomeCliente() + "   CPF: " + this.getCli().getCpf());
        System.out.println("VALOR: " + this.getPro().getValorProduto());
        System.out.println("DATA VENCIMENTO: " + this.getDataVencimento());
        System.out.println("DATA PAGAMENTO: " + this.getDataPagamento());
    }
}
