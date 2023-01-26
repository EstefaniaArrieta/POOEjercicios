/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioPersona {
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre=leer.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad=leer.nextInt();
        System.out.print("Indique su sexo H/M ");
        String sexo=leer.next();
        boolean op=false;
        if ((sexo=="h") || (sexo=="m")) {
            op=true;
        }
        while(op){
            System.out.println("Opción inválida, intente nuevamente");
            sexo=leer.next();
            if ((sexo=="h") || (sexo=="m")) {
            op=true;
            }
        }
        System.out.print("Indique su peso: ");
        int peso=leer.nextInt();
        System.out.print("Indique su altura: ");
        double altura=leer.nextDouble();
    return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int sacarimc(double peso, double altura) {
        double c = peso / (altura * altura);
        int imc;
        if (c < 20) {
            imc = -1;
        } else if (c >= 20 || c <= 25) {
            imc = 0;
        } else {
            imc = 1;
        }
        return imc;
    }

    public boolean sacarMayor(int edad){
        boolean mayor;
        if (edad>17) {
            mayor=true;
        }else{
            mayor=false;
        }
        return mayor;
    }
}
