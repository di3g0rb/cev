/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cev.java.basico;

/**
 *
 * 
 * @author diego
 */
public class Principal {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OlaMundo om = new OlaMundo();
        om.olamundo();
        
        HoraSistema hs = new HoraSistema();
        hs.datasistema();
        
        IdiomaSistema is = new IdiomaSistema();
        is.mostrarIdioma();
        
       ResolucaoTela rt = new ResolucaoTela();
        rt.mostrarResolucao();
    }
    
}
