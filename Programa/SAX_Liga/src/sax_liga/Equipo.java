/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sax_liga;

/**
 *
 * @author yaiza
 */
public class Equipo {
    private String nombre, comentario;
    private boolean visitante;
    private int puntuacion, idEquipo;

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isVisitante() {
        return visitante;
    }

    public void setVisitante(boolean visitante) {
        this.visitante = visitante;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    
    

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", comentario=" + comentario + ", visitante=" + visitante + ", puntuacion=" + puntuacion + '}';
    }
    
    
}
