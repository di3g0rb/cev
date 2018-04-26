/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cev.java.basico;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

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
        System.out.println("A data e hora atual é (agora): " + agora);
        System.out.println("A data e hora atual é (formatador): " + agora.format(formatador));
    }
   
   public void dataSistema2(){
       		Date d = new Date();
		System.out.println("A data (DATE) é: " + d);
   
   }
   
      public void dataSistema3(){
       		Date d = Calendar.getInstance().getTime();
		System.out.println("A data (Calendar) é: " + d);
   
   }
      
    public void dataSistema4(){
    SimpleDateFormat df = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT);
    System.out.println("1 - The short date format is  " + df.toPattern());
    Locale loc = Locale.ITALY;
    df = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT, loc);
    System.out.println("2 - The short date format is  " + df.toPattern());
   
   }


    
    
}
