/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej13;

import Entidad.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author Martin
 */
public class POOEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso c1=new Curso();
        CursoServicio sv=new CursoServicio();
        
        c1=sv.crearCurso();
        
        System.out.println("la ganancia semanal es $"+ sv.calcularGananciaSemanal(c1));
        
        System.out.println(c1.getAlumno());
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
