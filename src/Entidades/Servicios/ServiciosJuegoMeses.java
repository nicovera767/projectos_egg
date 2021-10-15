package Entidades.Servicios;

import Entidades.JuegoMeses;
import java.util.Scanner;

public class ServiciosJuegoMeses {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public JuegoMeses crearJuego() {
        System.out.println("Ingrese un numero del 1 al 12 inclusive");
        int n = leer.nextInt();
        return new JuegoMeses(n-1);
    }

    public void jugar(JuegoMeses j) {
        System.out.println("Adivine el mes secreto.\nIntroduzca nombre del mes");
        String intento = leer.next();
        if (intento.equals(j.getMesSecreto())) {
            System.out.println("Felicitacines ganaste...!");
        } else {
            while (!(intento.equals(j.getMesSecreto()))) {
                System.out.println("No adivinaste, intenta con otro");
                intento = leer.next();
                if (intento.equals(j.getMesSecreto())) {
                    System.out.println("Felicitacines ganaste...!");
                }
            }
        }
    }
}
