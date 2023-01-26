/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Persona {
    
    private String nombre;
    private Date fechanac;

    public Persona(String nombre, Date fechanac) {
        this.nombre = nombre;
        this.fechanac = fechanac;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechanac=" + fechanac + '}';
    }
    
 
    public void PedirFecha(){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Cual es tu nombre?");
        nombre=leer.nextLine();
        System.out.println("a continuacion coloque su fecha de nacimiento");
        System.out.println("indique el dia");
        int dia = leer.nextInt();
        System.out.println("indique el mes");
        int mes = leer.nextInt();
        System.out.println("indique el año");
        int anio = leer.nextInt();
        
        Date fechaNac=new Date(anio-1900,mes-1,dia);
        fechanac=fechaNac;
        
    }
    
    public int edad(){
        Date fechahoy=new Date();
        int edades;
        edades=fechahoy.getYear()-fechanac.getYear();
        return edades;
    }
    
    public boolean menorQue(int edades){
        boolean bandera= true;
        if (edades<18) {
            bandera= false;
        }
        return bandera;
    }
    
}
