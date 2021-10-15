package Entidades;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Circunferencia {
    private double radio;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //COnstructor
    public Circunferencia(double radio){
        this.radio = radio;
    }
    //get y set
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    //COnstructor que pide radio
    public Circunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
    }
    public double area(){
        return (radio*radio)*PI;
    }
    public double perimetro(){
        return 2*PI*radio;
    }
}
