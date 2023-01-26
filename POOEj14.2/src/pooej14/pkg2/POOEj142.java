/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14.pkg2;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author Martin
 */
public class POOEj142 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movil m1=new Movil();
        MovilServicio sv=new MovilServicio();
        
        m1=sv.crearM();
        
        m1.setCodigo(sv.leerCod(m1));
        
        
        
        
        
        // TODO code application logic here
    }
    
}
