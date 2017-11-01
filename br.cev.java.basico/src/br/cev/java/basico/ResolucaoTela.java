/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cev.java.basico;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author diego
 */
public class ResolucaoTela {
    
    public static void mostrarResolucao() {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Sua tela tem resolução " + lar + " x " + alt);
     
    }
    
}
