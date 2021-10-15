package Entidades;

import java.util.Comparator;
import java.util.Objects;

public class Pelicula {

    private String titulo, director;
    private double duracion;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Double getDuracion() {
        return duracion;
    }
    
    public Pelicula(){
        
    }
    
    public Pelicula(String t, String d , double du){
        titulo = t;
        director = d;
        duracion = du;
    }
    
  
    @Override
    public String toString() {
        return "Pelicula\n" + "Titulo " + titulo + "\nDirector: " + director + "\nDuracion: " + duracion + "hs";
    }
    
    
    
}
