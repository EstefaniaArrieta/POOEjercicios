/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class CursoServicio {
    
    
    
    public String[] cargarAlumnos(){
        
        Scanner leer=new Scanner(System.in);
        String [] nombre=new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("a continuacion coloque el nombre de la persona numero "+ (i+1));
            nombre[i]=leer.nextLine();
        
        }
         return nombre;
    }
    
    public Curso crearCurso(){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("coloque el nombre del curso");
        String nombreC=leer.nextLine();
        System.out.println("coloque la cantidad de horas que cursa por dia");
        int horasD=leer.nextInt();
        System.out.println("coloque la cantidad dias que cursa por semana");
        int diaS=leer.nextInt();
        System.out.println("coloque el precio por hora");
        float precio=leer.nextFloat();
        System.out.println("coloque el turno:mañana/tarde");
        
        String turno=leer.next();
        
        return new Curso(nombreC,horasD, diaS, precio, turno, cargarAlumnos() );
        
        
        
    }
    
    
    public double calcularGananciaSemanal(Curso c1){
        double ganancia;
        
        ganancia=c1.getDiasSemana()*c1.getHorasDia()*c1.getPrecioHora()*5;
        
        return ganancia;
    }
    
}

