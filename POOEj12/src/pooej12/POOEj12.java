/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import Entidad.Persona;
import java.util.Date;

/**
 *
 * @author Martin
 */
public class POOEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1=new Persona();
        
        
        p1.PedirFecha();
        
        System.out.println(p1.toString());
        
        System.out.println("");
        
        
        System.out.println("la persona tiene " + p1.edad()+" años");
        
        System.out.println("la persona es mayor de edad?");
        System.out.println(p1.menorQue(p1.edad()));
        
    }
    
}
