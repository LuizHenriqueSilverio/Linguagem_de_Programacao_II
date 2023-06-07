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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            O polimorfismo é aplicado nos métodos dadosAparelho() e
            autenticaRede(), que mostram uma mensagem diferente para cada
            tipo de aparelho.
        
        */
        
        Data garantiaFixo = new Data("15", "10", "2025");
        Fixo telFixo = new Fixo("Intelbras", "ZX-01", "Preto", 0.25, garantiaFixo);
        
        Data garantiaMovel = new Data("25", "11", "2024");
        Movel telCelular = new Movel("Xiaomi", "Redmi 9T", "Prata", 0.500, garantiaMovel);
        
        Data garantiaPortatil = new Data("11", "08", "2023");
        Portatil notebook = new Portatil("Asus", "Core i5", "Branco", 1.500, garantiaPortatil);
        
        Data garantiaMesa = new Data("17", "05", "2026");
        Mesa desktop = new Mesa("Dell", "Ryzen 5", "Preto", 2.500, garantiaMesa);
        
        Data garantiaMesa2 = new Data("25", "04", "2023");
        Aparelho desktop2 = new Mesa("Positivo", "Core i3", "Preto", 1.250, garantiaMesa2);
        
        telFixo.autenticaRede();
        telCelular.autenticaRede();
        notebook.autenticaRede();
        desktop.autenticaRede();
        
        telFixo.dadosAparelho();
        System.out.println("");
        
        telCelular.dadosAparelho();
        System.out.println("");
        
        notebook.dadosAparelho();
        System.out.println("");
        
        desktop.dadosAparelho();
        System.out.println("");
        
        desktop2.dadosAparelho();
        
    }
    
}
