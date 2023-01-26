/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class CuentaServicio {
    
    public Cuenta crearCuenta(){
        Cuenta c1=new Cuenta();
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Bienvenido");
        System.out.println("coloque el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("coloque su dni");
        c1.setDni(leer.nextLong());
        System.out.println("coloque la cantidad de dinero que posee actualmente");
        c1.setSaldoActual(leer.nextInt());
        
        return c1;
        
    }
    
    public void ingresarDinero(Cuenta c1){
        Scanner leer=new Scanner(System.in);
        int ingreso;
        System.out.println("cuanto dinero desea ingresar?");
        ingreso=leer.nextInt();
        c1.setSaldoActual(c1.getSaldoActual()+ingreso);
        System.out.println("se han ingresado $"+ingreso);
    }
    
    
    public void retirarDinero(Cuenta c1){
        Scanner leer=new Scanner(System.in);
        int retiro;
        System.out.println("cuanto dinero desea retirar?");
        retiro=leer.nextInt();
        
        if (c1.getSaldoActual()<retiro) {
            
            System.out.println("se pudieron retirar $"+ c1.getSaldoActual()+"su saldo actual es 0" );
            c1.setSaldoActual(0);
        }else if (c1.getSaldoActual()>retiro) {
            c1.setSaldoActual(c1.getSaldoActual()-retiro);
            System.out.println("se retiraron $"+retiro+ " Su saldo actual es $"+c1.getSaldoActual());

        }
        
    }
    
    public void extraccionRapida(Cuenta c1){
        Scanner leer=new Scanner(System.in);
        int retiro;
        boolean bandera=false;
        System.out.println("solo puede extraer el 20% del dinero actual");
       
        
        do {            
            
            System.out.println("cuanto desea retirar?");
            retiro = leer.nextInt();
            if (retiro <= (c1.getSaldoActual() * 0.20)) {
                c1.setSaldoActual(c1.getSaldoActual() - retiro);
                System.out.println("se retiraron $"+retiro);
                bandera=true;
            } else {
                System.out.println("el retiro es demaciado grande intente de nuevo");
            }
        } while (bandera==false);

    }
    
    public void mostrarSaldo(Cuenta c1){
        System.out.println("su saldo actual es " +c1.getSaldoActual()); 
    }
    
    
    public void mostrarDato(Cuenta c1){
        System.out.println(c1.toString()); 
    }
    

    
}
