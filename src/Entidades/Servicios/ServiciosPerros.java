package Entidades.Servicios;

import Entidades.Perros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosPerros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarLista(Perros p) {
        boolean llave = false;
        while (llave == false) {
            System.out.println("Ingrese la raza del perro");
            p.getRaza().add(leer.next());
            System.out.println("Quiere guardar otro perro?\n(S)i\n(N)o");
            char seleccion = leer.next().charAt(0);
            if (seleccion == 'n' || seleccion == 'N') {
                llave = true;
                System.out.println("Los perros ingresados son:");
                ArrayList<String> a = p.getRaza();
                for (String g : a) {
                    System.out.println(g);
                }
            }
        }
    }
    
    public void quitarPerro(Perros p){
        Iterator it = p.getRaza().iterator();
        System.out.println("Que perro desea sacar?");
        String saca = leer.next();
        int cant = p.getRaza().size();
        while(it.hasNext()){
            String este = (String)it.next();
            if(este.equals(saca)){
                it.remove();
            }
        }
        if(cant == p.getRaza().size()){
            System.out.println("El perro ingresado no esta en la lista");
            mostrarPerros(p);
        }else{
            System.out.println("Perro eliminado");
            mostrarPerros(p);
        }
    }
    
    public void mostrarPerros(Perros p){
        ArrayList <String> a = p.getRaza();
        for(String aux:a){
            System.out.println(aux);
        }
    }
    
}
