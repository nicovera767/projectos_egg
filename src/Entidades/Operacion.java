package Entidades;

import java.util.Scanner;

public class Operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numero1 , numero2;
    public Operacion(){
        
    }
    public Operacion(int n1, int n2){
        numero1 = n1;
        numero2 = n2;
    }
    public int getNumero1(){
        return numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    public void setNumero1(int n1){
        numero1 = n1;
    }
    public void setNumero2(int n2){
        numero2 = n2;
    }
    public Operacion crearOperacion(){
        System.out.println("Ingrese numero 1");
        int n1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        int n2 = leer.nextInt();
        Operacion oper = new Operacion(n1,n2);
        return oper;
    }
    public int sumar(){
        return numero1 + numero2;
    }
    public int restar(){
        return numero1 - numero2;
    }
    public int multiplicar(){
        if(numero1 == 0 || numero2 == 0){
            System.out.println("Se multiplico por 0");
            return 0;
        }else{
            return numero1*numero2;
        }
    }
    public int dividir(){
        if(numero2 == 0){
            System.out.println("No se puede dividir por 0");
            return 0;
        }else{
            return numero1/numero2;
        }
    }
}
