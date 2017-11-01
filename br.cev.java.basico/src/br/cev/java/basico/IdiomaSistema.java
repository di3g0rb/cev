/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cev.java.basico;

import java.util.Locale;

/**
 *
 * @author diego
 */
public class IdiomaSistema {
    public void mostrarIdioma() {
        Locale loc;
        loc = Locale.getDefault();
        System.out.println("O idioma do SO é " + loc.toString());
    }
    
}
