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
abstract public class Aparelho {
    String marca;
    String modelo;
    String cor;
    double peso;
    Data dataGarantia;
    
    public Aparelho(String marca, String modelo, String cor, double peso, Data dataGarantia){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.peso = peso;
        this.dataGarantia = dataGarantia;
    }
    
    abstract public void ligar() ;
    abstract public void desligar();
    abstract public void dadosAparelho();
    
    abstract public void setMarca(String marca);
    abstract public void setModelo(String modelo);
    abstract public void setCor(String cor);
    abstract public void setPeso(double peso);
    abstract public void setDataGarantia(Data dataGarantia);
    
    abstract public String getMarca();
    abstract public String getModelo();
    abstract public String getCor();
    abstract public double getPeso();
    abstract public Data getDataGarantia();
}
