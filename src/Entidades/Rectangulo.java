package Entidades;

import java.util.Scanner;
public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int base , altura ;
    public Rectangulo(){
         System.out.println("Ingrese base del rectangulo");
         base = leer.nextInt();
         System.out.println("Ingrese altura del rectangulo");
         altura = leer.nextInt();
     }
    //Getter y Setter
    public void setBase(int base){
         this.base = base;
     }
    public void setAltura(int altura){
         this.altura = altura;
     }
    public int getBase(){
         return base;
     }
    public int getAltura(){
         return altura;
     }
    //Metodos pedidos
    public double supRectangulo(){
         return base*altura;
     }
    public int perimetroRect(){
         return (base+altura)*2;
     }
    public void imprimirRectangulo(){
    for(int i = 0 ; i < altura ; i++){
        if (i == 0 || i == altura - 1){
            for(int j = 0; j < base ; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }else{
            System.out.print("*");
            for(int j = 0 ; j<(base-2) ; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("\n");
        }
    }
}
}
