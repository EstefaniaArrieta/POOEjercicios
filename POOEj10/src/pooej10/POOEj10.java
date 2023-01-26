/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import java.util.Arrays;

/**
 *
 * @author Martin
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] arr1= new double[50];
        double [] arr2= new double[20];
        
        
        llenarArray(arr1);
        
        mostrarArray(arr1);
        
        acomodarArray(arr1);
        System.out.println(" ");
        
        mostrarArray(arr1);
        
        segundoArray(arr1,arr2);
        
    }
    
    public static void llenarArray(double [] arr1){
        
        for (int i = 0; i < 50; i++) {
            arr1[i]=(Math.random()*10);
           
            
        }
    }
    
    public static void mostrarArray(double [] arr1){
        
        for (int i = 0; i < 50; i++) {
            
            System.out.print(arr1[i]);
            System.out.println(" ");
            
        }
    }
    
    public static void acomodarArray(double [] arr1){
        
        Arrays.sort(arr1);
        Arrays.toString(arr1);
        
    }
    
    public static void segundoArray(double [] arr1, double [] arr2){
        
        for (int i = 0; i < 20; i++) {
            
            if (i<=10) {
                arr2[i]=arr1[i];
            }else{
                arr2[i]=0.5;
            }
            
            
            System.out.println(arr2[i]);
           
        }
        
    }
    
}
