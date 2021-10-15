package Entidades;
import java.util.Scanner;
public class Matematica {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double num1 , num2;
    public void setNumero1(double n1){
        num1 = n1;
    }
    public double getNumero1(){
        return num1;
    }
    public void setNumero2(double n2){
        num2 = n2;
    }
    public double getNumero2(){
        return num2;
    }
    public Matematica(){
        
    }
    public Matematica(double n1 , double n2){
        num1 = n1;
        num2 = n2;
    }
}
    