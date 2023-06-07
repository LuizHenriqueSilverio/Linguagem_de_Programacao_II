/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

/**
 *
 * @author luizh
 */
public class Portatil extends Computador implements Comunicacao{
    
    public Portatil(String marca, String modelo, String cor, double peso, Data dataGarantia) {
        super(marca, modelo, cor, peso, dataGarantia);
    }

    @Override
    public void ligar() {
        System.out.println("Aparelho ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Aparelho desligado.");
    }

    @Override
    public void dadosAparelho() {
        System.out.println("Tipo de Aparelho: Computador Portátil/Notebook");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Data de Garantia: " + 
                            this.getDataGarantia().getDia() + "/" + 
                            this.getDataGarantia().getMes() + "/" +
                            this.getDataGarantia().getAno());
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void setDataGarantia(Data dataGarantia) {
        this.dataGarantia = dataGarantia;
    }

    @Override
    public void autenticaRede() {
        System.out.println("Notebook autenticado na rede com sucesso!");
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public Data getDataGarantia() {
        return this.dataGarantia;
    }
}
