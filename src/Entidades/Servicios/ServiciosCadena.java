package Entidades.Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class ServiciosCadena {
    Cadena e = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public int mostrarVocales(Cadena c){
        int cantVocales = 0;
        for(int i = 0 ; i < c.getLongitud() ; i++){
            switch (c.getFrase().charAt(i)){
                case 'a':cantVocales = cantVocales + 1;
                break;
                case 'e':cantVocales = cantVocales + 1;    
                break;    
                case 'i':cantVocales = cantVocales + 1;    
                break;    
                case 'o':cantVocales = cantVocales + 1;    
                break;    
                case 'u':cantVocales = cantVocales + 1;    
                break;    
            }
        }
        return cantVocales;
    }
    public String invertirFrase(Cadena c){
        String invertida = c.getFrase().substring(0,1);
        for(int i = 1 ; i < c.getLongitud() ; i++){
            invertida = c.getFrase().substring(i, i+1).concat(invertida);
        }
        return invertida;
    }
    public int vecesRepetido(Cadena c , String letra){
        int ctasVeces = 0;
        for(int i = 0 ; i < c.getLongitud() ; i++){
            if (c.getFrase().substring(i, i+1).equals(letra)){
                ctasVeces = ctasVeces + 1;
            }
        }
        return ctasVeces;
    }
    public void compararLongitud(Cadena c){
        System.out.println("Ingrese la frase a comparar");
        String f = leer.next();
        if(c.getLongitud() == f.length()){
            System.out.println("Tienen la misma longitud");
        }else if(c.getLongitud() < f.length()){
            System.out.println("La frase nueva es mas larga");
        }else{
            System.out.println("La frase nueva es mas corta");
        }
    }
    public void unirFrases(Cadena c){
        System.out.println("Ingrese la frase a unir");
        String f = leer.next();
        System.out.println("Las frases unidas resultan: ");
        System.out.println(c.getFrase().concat(f));
    }
    public void reemplazar(Cadena c){
        System.out.println("Por que caracter quiere reemplazar las letras a?");
        String letra = leer.next();
        System.out.println(c.getFrase().replace("a",letra));
    }
    public boolean contiene(Cadena c){
        System.out.println("Que letra quiere sber si esta en la fase?");
        String letra = leer.next();
        return c.getFrase().contains(letra);
    }
}
