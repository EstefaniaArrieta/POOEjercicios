/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej.pkg7;

import entidad.Persona;
import servicio.ServicioPersona;

/**
 *
 * @author Martin
 */
public class PooEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int normal=0;
        int sobrepeso=0;
        int flaco=0;
        int mayor=0;
        int menor=0;
        
        
        Persona[] p1=new Persona[4];
        ServicioPersona sv=new ServicioPersona();
        
        
        for (int i = 0; i < 4; i++) {
             p1[i]=sv.crearPersona();
             p1[i].setImc(sv.sacarimc(p1[i].getPeso(), p1[i].getAltura()));
             
             if ((sv.sacarMayor(p1[i].getEdad())==true)) {
                mayor++;
                 System.out.println("es mayor de edad");

            } else {
                menor++;
                 System.out.println("es menor de edad");
            }
             
             
             if (p1[i].getImc()==0) {
                normal++;
                 System.out.println("esta en su peso ideal");
            }else if (p1[i].getImc()==1) {
                sobrepeso++;
                 System.out.println("tiene sobrepeso");
            }else{
                flaco++;
                 System.out.println("esta debajo de su peso ideal");
            }
             
        }
        
       
        
        
        
        
    
    
}
}
