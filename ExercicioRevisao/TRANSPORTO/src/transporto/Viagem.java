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
public class Viagem {
    private String destino;
    private double valorKM;
    private double valorViagem;
    private double distancia;
    
    public Viagem(double km, double valor, double dist) {
        this.valorKM = km;
        this.valorViagem = valor;
        this.distancia = dist;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the valorKM
     */
    public double getValorKM() {
        return valorKM;
    }

    /**
     * @param valorKM the valorKM to set
     */
    public void setValorKM(double valorKM) {
        this.valorKM = valorKM;
    }

    /**
     * @return the valorViagem
     */
    public double getValorViagem() {
        return valorViagem;
    }

    /**
     * @param valorViagem the valorViagem to set
     */
    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public void calcularViagem() {
        this.setValorViagem(this.getValorKM() * this.getDistancia());
    }
}
