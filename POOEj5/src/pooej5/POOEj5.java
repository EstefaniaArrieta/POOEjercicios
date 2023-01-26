/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Entidades.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class POOEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        CuentaServicio sv=new CuentaServicio();
        
        
        Cuenta c1=sv.crearCuenta();
        int op;
        boolean bandera=false;
        
        System.out.println("bienvenido a TuBank");
        
        do {            
            
            System.out.println("coloque 1 para ingresar dinero");
            System.out.println("coloque 2 para extraer dinero");
            System.out.println("coloque 3 para una extraccion rapida");
            System.out.println("coloque 4 para saber el saldo actual");
            System.out.println("coloque 5 para saber los datos de su cuenta");
            System.out.println("coloque 6 para salir");
            op=leer.nextInt();
            
             switch (op) {
            case 1:
                sv.ingresarDinero(c1);
                break;
            case 2:
                sv.retirarDinero(c1);
                break;
            case 3:
                sv.extraccionRapida(c1);
                break;
            case 4:
                sv.mostrarSaldo(c1);
                break;
            case 5:
                sv.mostrarDato(c1);
                break;
            case 6:
                bandera=true;
                break;
            default:
                throw new AssertionError();
        }
            
            
        } while (bandera==false);
        
        
        
        
        
       
    }
    
}
