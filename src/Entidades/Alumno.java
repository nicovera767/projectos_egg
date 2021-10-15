package Entidades;

import Entidades.Servicios.ServiciosAlumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;
    
    public Alumno(){
    notas = new ArrayList();
    }
    
    public Alumno(String nombre, ArrayList<Integer> notas){
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNotas(ArrayList<Integer> notas){
        this.notas = notas;
    }
    
    public ArrayList<Integer> getNotas(){
        return notas;
    }
    
    public double notaFinal(){
        int aux = 0;
        for(int i = 0 ; i < 3 ; i++){
            aux += notas.get(i);
        }
        return aux/3;
    }
}
