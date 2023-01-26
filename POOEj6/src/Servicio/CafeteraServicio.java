/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class CafeteraServicio {
    
    public void llenarCafetera(Cafetera c1){
        c1.setCantidadActual(c1.getCapacidadMax());
                
    }
           
    public void servirTaza(Cafetera c1){
        Scanner leer=new Scanner(System.in);
        System.out.println("si desea servir una taza de cafe coloque el tamaño de la taza a continuacion");
        int taza=leer.nextInt();
        if (taza<c1.getCantidadActual()) {
            System.out.println("disfrute su taza de cafe");
            c1.setCantidadActual(c1.getCantidadActual()-taza);
        }else{
            System.out.println("su taza no se lleno por completo");
            System.out.println("el contenido es de " + c1.getCantidadActual());
            
            c1.setCantidadActual(0);
        }
        
        
    }
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
        System.out.println("se vacio la cafetera");
    }
    
    public void agregarCafe(Cafetera c1){
        Scanner leer=new Scanner(System.in);
        System.out.println("cuanto cafe desea agregar?");
        int agregar=leer.nextInt();
        c1.setCantidadActual(agregar);
        
    }
            
            
            
    
}
