/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private int imc;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    

    
    public double IMC(){
        
        double numIMC;
        double IMC= (peso*(altura*altura));
        
        if (IMC>20) {
            numIMC=0;
        }else if (IMC>25) {
            numIMC=1;
        }else{
            numIMC=-1;
        }
        
        return numIMC;
    }   
    
    public void promedio(int flaco,int medio, int sobre){
        System.out.println("el porcentaje de personas bajas de peso es" +(flaco*100)/4);
        System.out.println("el porcentaje de personas de peso normal es" +(medio*100)/4);
        System.out.println("el porcentaje de personas con sobrepeso es" +(sobre*100)/4);
    }
    
}
