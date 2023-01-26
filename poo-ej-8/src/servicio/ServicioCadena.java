/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cadena;

/**
 *
 * @author Martin
 */
public class ServicioCadena {
    
    
    public int contarVocal(Cadena c1){
        int cantidad=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            String letra=c1.getFrase().substring(i, i+1);
            
            if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
                cantidad++;
            }
            
        }
        return cantidad;
    }
    
    public void invertirFrase(Cadena c1){
        
        int longitud=c1.getLongitud();
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            System.out.print(c1.getFrase().substring(longitud-1, longitud));
            longitud--;
        }
        System.out.println("");
        
        
    }
    
    
    public void vecesRepetida(Cadena c1, String letra){
        int cantidad=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equals(c1.getFrase().substring(i, i+1))) {
                cantidad++;
            }
        }
        System.out.println("la letra "+ letra + " fue repetida "+ cantidad + " veces");
    }
    
    public void unirFrase(Cadena c1, String nueva){
        
        System.out.println(c1.getFrase().concat(nueva));
        
        c1.setFrase(c1.getFrase().concat(nueva));
        
        
    }
    
    public void reemplazo(Cadena c1,String caracter){
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            if ((c1.getFrase().substring(i, i+1)).equalsIgnoreCase("a")) {
                System.out.print(caracter);
            }else{
                System.out.print(c1.getFrase().substring(i, i+1));
            }
        }
        System.out.println("");
    }
    
}
