/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cev.java.basico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import java.util.Locale;

/**
 *
 * @author diego
 */
public class HoraSistema {
    
    public void datasistema(){
LocalDateTime agora = LocalDateTime.now();
DateTimeFormatter formatador = DateTimeFormatter
  .ofLocalizedDateTime(FormatStyle.MEDIUM)
  .withLocale(new Locale("pt", "br"));
        System.out.println("A data e hora atual é: " + agora.format(formatador));
    }
}
