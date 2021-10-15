package Entidades.Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class ServiciosAhorcado {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearAhorcado() {
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        String[] adivina = new String[palabra.length()];
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
            adivina[i] = "_";
        }
        System.out.println("Ingrese cantidad de intentos maximos");
        int intentos = leer.nextInt();
        return new Ahorcado(vector, adivina, intentos);
    }

    public void longitud(Ahorcado a) {
        System.out.println("La longitud de la palabra es " + a.getPalabra().length);
        for (int i = 0; i < a.getPalabra().length; i++) {
            System.out.print(a.getAdivina()[i] + " ");
        }
        System.out.println("");
    }

    public boolean buscarLetra(Ahorcado a, String letra) {
        boolean esta = false;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(letra)) {
                esta = true;
            }
        }
        if (esta == true) {
            System.out.println("La letra esta en la palabra");
        } else {
            System.out.println("La letra no esta en la palabra");
        }
        return esta;
    }

    public void encontradas(Ahorcado a, String l) {
        if (a.getCantEncontradas() != a.getPalabra().length) {
            for (int i = 0; i < a.getPalabra().length; i++) {
                if (a.getPalabra()[i].equals(l) == true) {
                    a.setCantEncontradas(a.getCantEncontradas() + 1);
                    a.setAdivina(a.getPalabra()[i], i);
                    if (a.getCantEncontradas() == a.getPalabra().length) {
                        System.out.println("GANASTE....! \nLa palabra es: ");
                        for (int j = 0; j < a.getPalabra().length; j++) {
                            System.out.print(a.getAdivina()[j]);
                        }
                        System.out.println("");
                    }
                }
            }
            System.out.println("Letras (encontradas,restantes): " + "(" + a.getCantEncontradas() + "," + (a.getPalabra().length - a.getCantEncontradas()) + ")");
        }
    }

    public void intentos(Ahorcado a, boolean b) {
        if (b == true) {
            System.out.println("Te quedan " + a.getIntentos() + " intentos");
        } else {
            a.setIntentos(a.getIntentos() - 1);
            System.out.println("Te quedan " + a.getIntentos() + " intentos");
        }
    }

    public void jugar(Ahorcado a) {
        System.out.println("Vamos a jugar");
        while (a.getCantEncontradas() != a.getPalabra().length && a.getIntentos() != 0) {
            longitud(a);
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            intentos(a, buscarLetra(a, letra));
            encontradas(a, letra);
        }
    }
}
