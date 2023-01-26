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
public class ServicioMovil {
    
    public Movil cargarCelular(){
        Scanner leer=new Scanner(System.in);
        int[]codigo=new int[7];
        
        System.out.println("Coloque la marca");
        String marca=leer.nextLine();
        System.out.println("coloque el precio");
        double precio=leer.nextDouble();
        System.out.println("coloque el modelo");
        String modelo=leer.next();
        System.out.println("coloque la memoria ram");
        double memoriaR=leer.nextDouble();
        System.out.println("coloque el almacenamiento interno");
        double almac=leer.nextDouble();
        
        for (int i = 0; i < 7; i++) {
            System.out.println("coloque el codigo en orden numero por numero");
            codigo[i]=leer.nextInt();
        }
       
        
        return new Movil(marca, precio, modelo, memoriaR, almac, codigo);
    }
    
    public void mostrar(Movil c1){
        System.out.println(c1.toString());
        
    }
    
}
