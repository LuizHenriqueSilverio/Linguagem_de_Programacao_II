/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author luizh
 */
public class Porta {
    private boolean aberta = false;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;
    
    public Porta(String cor, int dimX, int dimY, int dimZ) {
        this.cor = cor;
        this.dimensaoX = dimX;
        this.dimensaoY = dimY;
        this.dimensaoZ = dimZ;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the dimensaoX
     */
    public int getDimensaoX() {
        return dimensaoX;
    }

    /**
     * @param dimensaoX the dimensaoX to set
     */
    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    /**
     * @return the dimensaoY
     */
    public int getDimensaoY() {
        return dimensaoY;
    }

    /**
     * @param dimensaoY the dimensaoY to set
     */
    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    /**
     * @return the dimensaoZ
     */
    public int getDimensaoZ() {
        return dimensaoZ;
    }

    /**
     * @param dimensaoZ the dimensaoZ to set
     */
    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    /**
     * @return the aberta
     */
    public boolean estaAberta() {
        return aberta;
    }

    /**
     * @param aberta the aberta to set
     */
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    public void abre() {
        if(this.estaAberta()) {
            System.out.println("A porta ja esta aberta!!!");
            return;
        }
        
        this.setAberta(true);
        System.out.println("Porta aberta.");
    }
    
    public void fecha() {
        if(!this.estaAberta()) {
            System.out.println("A porta ja esta fechada!!!");
            return;
        }
        
        this.setAberta(false);
        System.out.println("Porta fechada.");
    }
    
    public void pinta(String cor) {
        this.setCor(cor);
    }
}
