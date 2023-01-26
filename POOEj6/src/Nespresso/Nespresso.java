/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nespresso;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author Martin
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraServicio sv=new CafeteraServicio();
        Cafetera c1=new Cafetera();
        
        sv.llenarCafetera(c1);
        
        sv.servirTaza(c1);
        
        sv.vaciarCafetera(c1);
        
        System.out.println(c1.toString());
        
        sv.agregarCafe(c1);
                
        System.out.println(c1.toString());

        
        // TODO code application logic here
    }
    
}
