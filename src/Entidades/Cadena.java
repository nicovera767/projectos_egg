package Entidades;
import java.util.Scanner;
public class Cadena {
    private String frase;
    private int longitud;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void setFrase(String f){
        frase = f;
        setLongitud();
    }
    public String getFrase(){
        return frase;
    }
    public void setLongitud(){
        longitud = frase.length();
    }
    public int getLongitud(){
        return longitud;
    }
    
    public Cadena(){
        System.out.println("Ingrese una frase");
        frase = leer.next();
        longitud = frase.length();
    }
}
