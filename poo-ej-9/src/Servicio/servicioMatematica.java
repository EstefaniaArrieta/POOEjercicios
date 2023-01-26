/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Matematica;
import static java.lang.Math.abs;

/**
 *
 * @author Martin
 */
public class servicioMatematica {
    
    public boolean devolverMayor(Matematica m1){
        
        boolean bandera=false;
        if (m1.getNumero1()>m1.getNumero2()) {
            
            bandera= true;
             
        }
        return bandera;
    }
    
    public void calcularPotencia(Matematica m1,boolean devolverMayor ){
        double num1=Math.floor(m1.getNumero1());
        double num2=Math.floor(m1.getNumero2());
        
        double num3=Math.pow(num1, num2);
        double num4=Math.pow(num2, num1);
        
        if (devolverMayor==true) {
            System.out.println("el valor de  "+num1+ " elevado a "+num2+ " es " + num3);
        }else{
            System.out.println("el valor de  "+num2+ " elevado a "+num1+ " es " + num4);
        }
       
       
    }
    
    public void calcularRaiz(Matematica m1, boolean devolverMayor){
        
        double num1=m1.getNumero1();
        double num2=m1.getNumero2();
        
        
        if (devolverMayor==false) {
            System.out.println("la raiz cuadrada  de  "+num1+ " es "+ Math.sqrt(num1));
        }else{
            System.out.println("la raiz cuadrada  de  "+num2+ " es "+ Math.sqrt(num2));;
        }
        
    }
    
}
