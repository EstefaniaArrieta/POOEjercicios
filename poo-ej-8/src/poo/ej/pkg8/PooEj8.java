/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej.pkg8;

import entidad.Cadena;
import java.util.Scanner;
import servicio.ServicioCadena;

/**
 *
 * @author Martin
 */
public class PooEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        ServicioCadena sv= new ServicioCadena();
        
        System.out.println("a continuacion coloque una frase");
        Cadena c1=new Cadena(leer.nextLine());
        
        System.out.println("la cantidad de vocales que tiene es "+ sv.contarVocal(c1) );
        
        sv.invertirFrase(c1);
     
        //System.out.println(c1.toString());
        
        System.out.println("Digame una letra y le dire cuantas veces se repite en la frase");
        String letra=leer.next();
        
        sv.vecesRepetida(c1, letra);
        
        System.out.println("a continuacion coloqe una frase nueva y la unire con la anterior");
        
        
        leer.nextLine();
        String nueva;
        nueva = leer.nextLine();

        

        sv.unirFrase(c1,nueva);
       
        System.out.println("a continuacion reemplazaremos las 'a' por el caracter que desee, cual es?");
        String caracter=leer.next();
        
        sv.reemplazo(c1, caracter);
    
    
    
    }
    
}
