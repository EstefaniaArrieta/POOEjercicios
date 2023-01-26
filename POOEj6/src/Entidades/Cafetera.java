/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Martin
 */
public class Cafetera {
    
    private int capacidadMax;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMax=2000;
    }

    public Cafetera( int cantidadActual) {
        this.capacidadMax = 2000;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMax=" + capacidadMax + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
    
}
