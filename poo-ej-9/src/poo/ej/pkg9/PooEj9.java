/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej.pkg9;

import Entidades.Matematica;
import Servicio.servicioMatematica;

/**
 *
 * @author Martin
 */
public class PooEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica m1=new Matematica();
        servicioMatematica sv = new servicioMatematica();
        
        m1.setNumero1(Math.random() * 50);
        m1.setNumero2(Math.random() * 50);
        
        System.out.println(""+m1.toString());
        
        if (sv.devolverMayor(m1)==true) {
            System.out.println("el numero 1 es mayor al 2");
        }else{
            System.out.println("el numero 2 es mayor al 1");
        }
         
        sv.calcularPotencia(m1, sv.devolverMayor(m1));
        
        sv.calcularRaiz(m1, sv.devolverMayor(m1));
        
        
    }
    
}
