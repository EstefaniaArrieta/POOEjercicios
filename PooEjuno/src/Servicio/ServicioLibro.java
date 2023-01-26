/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioLibro {
    
    private Scanner leer = new Scanner(System.in);
    
    public Libro crearLibro(){
     
        System.out.println("introducir numero ISBN");
        int isbn=leer.nextInt();
    
        System.out.println("introducir el titulo del libro");
        String titulo=leer.next();
        
        System.out.println("introducir el autor");
        String autor=leer.next();
        
        System.out.println("introducir numero de paginas");
        int paginas=leer.nextInt();
        
        return new Libro(isbn, titulo, autor, paginas);
}
}
