/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

import Entidades.Rectangulo;
import Servicio.ServicioRectangulo;

/**
 *
 * @author Martin
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioRectangulo sv=new ServicioRectangulo();
       
        
        Rectangulo r1=sv.crearRectangulo();
        
        System.out.println(r1.toString());
        
        System.out.println("la superficie es"+ sv.calcularSuperficie(r1));
        System.out.println("El perimetro es"+ sv.calcularPerimetro(r1));
        
        sv.crearDibujo(r1);
        // TODO code application logic here
    }
    
}
