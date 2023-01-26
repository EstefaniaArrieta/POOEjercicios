/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioOperacion {
    
    Scanner leer=new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        System.out.println("coloque dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        return new Operacion(num1, num2);
    }
    
    public int sumar(int num1, int num2){
        int suma;
        suma=num1+num2;
        return suma;
        
    }
    
    public int restar(int num1, int num2){
        int resta;
        resta=num1-num2;
        return resta;
        
    }
    
    public int multiplicar(int num1, int num2){
        int mul=0;
        if (num1==0 || num2==0) {
            System.out.println("Todo numero multiplicado por 0 es igual a 0");
            
        }else{
            mul=num1*num2;
        }
        return mul;
        
    }
    public double dividir(int num1, int num2){
        double a=num1;
        double b=num2;
        
        double div;
        
        div=a/b;
        
        if (num1==0 || num2==0) {
            System.out.println("Hubo un error, no debe colocar 0");
        }
        return div;
        
    }
    
    
}
