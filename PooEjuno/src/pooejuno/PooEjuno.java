/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejuno;

import Entidades.Libro;
import Servicio.ServicioLibro;

/**
 *
 * @author Martin
 */
public class PooEjuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioLibro sv= new ServicioLibro();
        Libro l1=new Libro();
        
        l1=sv.crearLibro();
        
        System.out.println(l1.toString());
        
        
    }
    
}
