package Entidades;

import Entidades.Alumno;
import Entidades.Servicios.ServiciosAhorcado;
import Entidades.Servicios.ServiciosAlumno;
import Entidades.Servicios.ServiciosArray;
import Entidades.Servicios.ServiciosJuegoMeses;
import Entidades.Servicios.ServiciosNIF;
import Entidades.Servicios.ServiciosPelicula_Cine;
import Entidades.Servicios.ServiciosPerros;
import Entidades.Servicios.ServiciosPersona;
import Entidades.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Ejercicio 10
//        ServiciosArray sa = new ServiciosArray();
//        Arrays a = new Arrays(50);
//        sa.inicializarA(a);
//        sa.ordenarArreglo(a);
//        System.out.println("----------------------------");
//        Arrays b = new Arrays(20);
//        sa.copiarEinicializar(10,a, b);
//        System.out.println("A ordenado");
//        sa.mostrarArreglo(a);
//        System.out.println("B");
//        sa.mostrarArreglo(b);
        //Ejercicio 11
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese año de nacimiento");
//        int anio = leer.nextInt();
//        System.out.println("Ingrese dia de nacimiemto");
//        int dia = leer.nextInt();
//        System.out.println("Ingrese mes de nacimiento");
//        int mes = leer.nextInt();
//        Date fecha = new Date(anio,mes,dia);
//        Date fechaActual = new Date();
//        System.out.println(fecha.getYear()+1900);
//        System.out.print("Entre esta fecha y la actual hay ");
//        if(fechaActual.getMonth()<fecha.getMonth()){
//            System.out.print((fechaActual.getYear()-fecha.getYear())-1);
//            System.out.println(" años");
//        }else if (fechaActual.getMonth()==fecha.getMonth()){
//            System.out.print((fechaActual.getYear()-fecha.getYear()));
//        }
        //Ejercicio 12
//        ServiciosPersona sp = new ServiciosPersona();
//        Persona p1 = sp.crearPersona();
//        Date fechaActual = new Date();
//        sp.mostrarPersona(p1);
        //Extra 4
//        ServiciosNIF sN = new ServiciosNIF();
//        NIF n1 = sN.crearNif();
//        sN.mostrar(n1);
        //Extra 5
//        ServiciosJuegoMeses sJm = new ServiciosJuegoMeses();
//        JuegoMeses jM = sJm.crearJuego();
//        sJm.jugar(jM);
        //Extra 6
//        ServiciosAhorcado sA = new ServiciosAhorcado();
//        Ahorcado a = sA.crearAhorcado();
//        sA.jugar(a);
//        HashMap estudiantes = new HashMap();
//        
//        estudiantes.put(34747376, "Nicolas");
//        estudiantes.put(34068825, "Sebastian");
//        
//        Set set = estudiantes.entrySet();
//        Iterator i = set.iterator();
//        while(i.hasNext()){
//            Map.Entry me = (Map.Entry)i.next();
//            System.out.println(me.getKey()+":"+me.getValue());
//        }
//        System.out.println();
//        double balance = ((Double)estudiantes.get(34747376));
//        
//        ArrayList<Integer> numeros = new ArrayList();
//       
//        numeros.add(34747376);
//        numeros.add(34068835);
//        for(Integer a:numeros){
//            System.out.println(a.intValue());
//        }

        // LinkedList<Integer> num = new LinkedList();
//       //Ejercicio 3 Colecciones
//       ServiciosAlumno sA = new ServiciosAlumno();
//        boolean sigue = false;
//        while(sigue == false){
//            sA.crearAlumno();
//            System.out.println("Desea crear mas Alumnos?\n(S)i\n(N)o");
//            char seleccion = leer.next().charAt(0);
//            if(seleccion == 'n'|| seleccion == 'N'){
//                sigue = true;
//            }
//        }
//        System.out.println("Ingrese el nombre de Alumno para calcular promedio");
//        String nom = leer.next();
//        boolean esta = false;
//        double promedio = 0;
//        Alumno b = new Alumno();
//        for(Alumno a : sA.getListaAl()){
//            if(a.getNombre().equals(nom)){
//                b = a;
//                promedio = a.notaFinal();
//                esta = true;
//            }
//        }
//        if(esta==false){
//            System.out.println("El Alumno ingresado no esta en la lista");
//        }else{
//            System.out.println("Alumno "+b.getNombre()+"\nPromedio de "+promedio);
//        }
        //Ejercicio 4 Colecciones
//        System.out.println("Bienvenido, vamos a cargar peliculas...!");
//        boolean seguir = false;
//        ServiciosPelicula_Cine cine = new ServiciosPelicula_Cine();
//        while (seguir == false) {
//            System.out.println("Ingrese el titulo de la pelicula");
//            String t = leer.next();
//            System.out.println("Ingrese nombre del Director");
//            String dir = leer.next();
//            System.out.println("Ingrese la Duracion de la pelicula en horas");
//            double dur = leer.nextDouble();
//            cine.getCartelera().add(new Pelicula(t, dir, dur));
//
//            System.out.println("Desea cargar mas Peliculas?\n(S)i\n(N)o");
//            char seleccion = leer.next().charAt(0);
//            if (seleccion == 'n' || seleccion == 'N') {
//                seguir = true;
//            }
//        }
//        System.out.println("Todas las peliculas");
//        cine.mostrarPeliculasTodas();
//        System.out.println("");
//
//        System.out.println("Orden por Duracion Descendente");
//        Collections.sort(cine.getCartelera(), Comparadores.compararDuracionDesc);
//        cine.mostrarPeliculasTodas();
//
//        System.out.println("Orden por Duracion Ascendente");
//        Collections.sort(cine.getCartelera(), Comparadores.compararDuracionAsc);
//        cine.mostrarPeliculasTodas();
//
//        System.out.println("Orden por titulo");
//        Collections.sort(cine.getCartelera(), Comparadores.compararTitulo);
//        cine.mostrarPeliculasTodas();
//
//        System.out.println("Orden por Director");
//        Collections.sort(cine.getCartelera(), Comparadores.compararDirector);
//        cine.mostrarPeliculasTodas();

    }
}
