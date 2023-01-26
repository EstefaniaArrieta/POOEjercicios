/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejtres;

import Entidades.Operacion;
import Servicio.ServicioOperacion;

/**
 *
 * @author Martin
 */
public class PooEjTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioOperacion sv = new ServicioOperacion();
        Operacion op1=new Operacion();
        
        op1=sv.crearOperacion();
        
        System.out.println(sv.sumar(op1.getNum1(), op1.getNum2()));
        
        System.out.println(sv.restar(op1.getNum1(), op1.getNum2()));
        
        System.out.println(sv.multiplicar(op1.getNum1(), op1.getNum2()));
        
        System.out.println(sv.dividir(op1.getNum1(), op1.getNum2()));
        
        
        
        
    }
    
}
