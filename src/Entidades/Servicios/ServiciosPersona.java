package Entidades.Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServiciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nom = leer.next();
        System.out.println("Ingrese letra correspondiente:\n(H)ombre\n(M)ujer\n(O)tro");
        String s = leer.next();
        System.out.println("Ingrese año de nacimiento");
        int año = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su altura");
        double alt = leer.nextDouble();
        System.out.println("Ingrese su peso");
        double pe = leer.nextDouble();
        Persona p = new Persona(nom,s,alt,pe,año,mes,dia);
        p.setEdad(calcularEdad(p));
        return p;
    }
    public int calcularIMC(Persona p){
        p.setImc(p.getPeso()/p.getAltura()*p.getAltura());
        if(p.getImc() < 20){
            return p.getm20();
        }else if(p.getImc() >= 20 && p.getImc() <= 25){
            return p.get20Y25();
        }else {
            return p.getM25();
        }
    }
    public boolean esMayorDeEdad(Persona p){
        if (p.getEdad() >= 18){
            return true;
        }else{
            return false;
        }
    }
    public int calcularEdad(Persona p){
        if(p.getFechaNac().getMonth() == new Date().getMonth()){
            if(p.getFechaNac().getDay() >= new Date().getDay()){
                return new Date().getYear()-p.getFechaNac().getYear();
            }else{
                return (new Date().getYear()-p.getFechaNac().getYear())-1;
            }
        }else if(p.getFechaNac().getMonth()<new Date().getMonth()){
            return (new Date().getYear()-p.getFechaNac().getYear())-1;
        }else{
            return new Date().getYear()-p.getFechaNac().getYear();
        }
    }
    public boolean menorQue(Persona p, int edad){
        return calcularEdad(p)<edad;
    }
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Sexo: "+p.getSexo());
        System.out.println("Fecha Nacimiento: "+p.getFechaNac().toString());
        System.out.println("Altura: "+p.getAltura()+" metros");
        System.out.println("Peso: "+p.getPeso()+" kilos");
        System.out.println("Edad: "+p.getEdad()+" años");
    }
}
