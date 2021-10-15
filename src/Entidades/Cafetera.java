package Entidades;
import java.util.Scanner;
public class Cafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double capacidadMaxima , cantActual;
    //Constructores
    public Cafetera(){
        
    }
    public Cafetera(double capMax , double cantAct){
        capacidadMaxima = capMax;
        cantActual = cantAct;
    }
    //Getters y Setters
    public void setCapMax(double capMax){
        capacidadMaxima = capMax;
    }
    public double getCapMax(){
        return capacidadMaxima;
    }
    public void setCantActual(double cantAct){
        cantActual = cantAct;
    }
    public double getCantAct(){
        return cantActual;
    }
}
