/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class MovilServicio {
    
    public Movil crearM(){
        Scanner leer=new Scanner(System.in);
        int [] codigo=new int[7];
        
        
        
        System.out.println("coloque la marca");
        String marca=leer.nextLine();
        System.out.println("coloque el precio");
        int precio=leer.nextInt();
        System.out.println("coloque el modelo");
        String modelo=leer.next();
        System.out.println("coloque la memoria RAM ");
        double memoriaR=leer.nextDouble();
        System.out.println("coloque el almacenamiento");
        double almacenamiento=leer.nextDouble();
       
        
       
     return new Movil(marca, memoriaR, modelo, memoriaR, almacenamiento, codigo);
    }
    
    public int[] leerCod(Movil m1){
        int[] codigo=new int[7];
        Scanner leer=new Scanner(System.in);
        
         System.out.println("ingrese el codigo de 7 digitos de uno en uno");
        
        for (int i = 0; i < 7; i++) {
            
            codigo[i]=leer.nextInt();
            
            
        }
        System.out.println("el codigo es ");
        for (int i = 0; i < 7; i++) {
            
            System.out.print(codigo[i]);
 
        }
        
        
        return codigo;
        
    }
    
    
    
}
