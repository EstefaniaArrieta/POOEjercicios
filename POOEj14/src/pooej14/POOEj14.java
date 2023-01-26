/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14;

import Entidad.Movil;
import Servicio.ServicioMovil;

/**
 *
 * @author Martin
 */
public class POOEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movil c1=new Movil();
        ServicioMovil sv=new ServicioMovil();
        
        c1=sv.cargarCelular();
        
        sv.mostrar(c1);
        // TODO code application logic here
    }
    
}
