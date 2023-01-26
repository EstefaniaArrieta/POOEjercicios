/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Martin
 */
public class Curso {
    
    private String nombreCurso;
    private int horasDia;
    private int diasSemana;
    private float precioHora;
    private String turno;
    private  String[] alumno;

    public Curso() {
    }

    public Curso(String nombreCurso, int horasDia, int diasSemana, float precioHora, String turno, String[] alumno) {
        this.nombreCurso = nombreCurso;
        this.horasDia = horasDia;
        this.diasSemana = diasSemana;
        this.precioHora = precioHora;
        this.turno = turno;
        this.alumno = alumno;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(int diasSemana) {
        this.diasSemana = diasSemana;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getAlumno() {
        return alumno;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", horasDia=" + horasDia + ", diasSemana=" + diasSemana + ", precioHora=" + precioHora + ", turno=" + turno + ", alumno=" + alumno + '}';
    }

    
    
  
}