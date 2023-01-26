/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;


import java.util.Date;
import java.util.Scanner;




/**
 *
 * @author Martin
 */
public class POOEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
                
        System.out.println("a continuacion colocaremos una fecha especial en tu vida");
        System.out.println("indique el dia");
        int dia=leer.nextInt();
        System.out.println("indique el mes");
        int mes=leer.nextInt();
        System.out.println("indique el año");
        int anio=(leer.nextInt())-1900;
        
        
        
        Date fecha= new Date(anio,mes-1,dia);
        Date fechaActual=new Date();
        

        System.out.println(fecha);
        System.out.println(fechaActual);
        
        int difanio=fechaActual.getYear()-fecha.getYear();
        
        
        System.out.println("han pasado " + difanio+ " desde tu fecha especial");
        
       
        
    }
    
}
