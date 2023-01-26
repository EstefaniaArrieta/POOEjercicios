/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioRectangulo {
    
    public Rectangulo crearRectangulo(){
        Scanner leer= new Scanner(System.in);
        
        System.out.println("coloque el tamaño de la base del rectangulo");
        int base=leer.nextInt();
        System.out.println("coloque la altura");
        int altura=leer.nextInt();
        
        
        return new Rectangulo(base,altura);
        
       
    }
    
    public int calcularSuperficie(Rectangulo r1){
        int superficie;
        
        superficie=r1.getBase()*r1.getAltura();
        
        return superficie;
        
    }
    public int calcularPerimetro(Rectangulo r1){
        int perimetro;
        
        perimetro=(r1.getBase()+r1.getAltura())*2;
        
        return perimetro;
        
    }
    
    public void crearDibujo(Rectangulo r1){
        String[][] matriz= new String[r1.getBase()][r1.getAltura()];
        
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
                if (i==0||j==0||i==r1.getBase()-1|| j==r1.getAltura()-1) {
                    matriz[i][j]="*";
                    
                }else{
                    matriz[i][j]=" ";
                }
            }
   
        }
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
   
        }
        
        
        
        
    }
    
    
}
