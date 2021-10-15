package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Perros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<String> raza = new ArrayList();

    public Perros() {

    }

    public Perros(ArrayList s) {
        raza = s;
    }
    
    public ArrayList getRaza(){
        return raza;
    }
    public void setRaza(String s){
        raza.add(s);
    }

    

}
