package Entidades.Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumnos;

    public ArrayList<Alumno> getListaAl() {
        return alumnos;
    }

    public ServiciosAlumno() {
        alumnos = new ArrayList();
    }

    public void crearAlumno() {
        
        System.out.println("Ingrese nombre del alumno");
        String nombre = leer.next();
        ArrayList<Integer> aux = cargarNotas();
        alumnos.add(new Alumno(nombre,aux));
        
    }

    public ArrayList<Integer> cargarNotas() {
        ArrayList<Integer> notas = new ArrayList(); 
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota " + (i + 1));
            notas.add(leer.nextInt());
        }
        return notas;
    }

    public void mostrarAlumno(Alumno a) {
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Notas: ");
        for (Integer aux : a.getNotas()) {
            System.out.print(aux + ",");
        }
        System.out.println("");
    }
    
    public void mostrarAlumnos (){
        System.out.println("Los alumnos son:");
        for(Alumno a : alumnos){
            System.out.println(a.getNombre());
        }
    }
    
}
