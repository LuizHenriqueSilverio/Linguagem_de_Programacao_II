/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaohospital;

/**
 *
 * @author luizh
 */
public class Internacao {
    private Paciente pac;
    private Enfermeiro enf;
    private Medico med;
    private String motivo;
    private double valorDia;
    private int dias;
    
    private static int id = 0;
    
    public Internacao(Paciente p, Enfermeiro e, Medico m) {
        this.pac = p;
        this.enf = e;
        this.med = m;
        id++;
    }

    /**
     * @return the pac
     */
    public Paciente getPac() {
        return pac;
    }

    /**
     * @param pac the pac to set
     */
    public void setPac(Paciente pac) {
        this.pac = pac;
    }

    /**
     * @return the enf
     */
    public Enfermeiro getEnf() {
        return enf;
    }

    /**
     * @param enf the enf to set
     */
    public void setEnf(Enfermeiro enf) {
        this.enf = enf;
    }

    /**
     * @return the med
     */
    public Medico getMed() {
        return med;
    }

    /**
     * @param med the med to set
     */
    public void setMed(Medico med) {
        this.med = med;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the valorDia
     */
    public double getValorDia() {
        return valorDia;
    }

    /**
     * @param valorDia the valorDia to set
     */
    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(int aId) {
        id = aId;
    }
    
    
}
