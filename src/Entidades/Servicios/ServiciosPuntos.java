package Entidades.Servicios;

import Entidades.Puntos;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class ServiciosPuntos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Puntos crearPuntos(){
        System.out.println("Imgrese coordenada x del punto 1");
        double x1 = leer.nextInt();
        System.out.println("Imgrese coordenada y del punto 1");
        double y1 = leer.nextInt();
        System.out.println("Imgrese coordenada x del punto 2");
        double x2 = leer.nextInt();
        System.out.println("Imgrese coordenada x del punto 2");
        double y2 = leer.nextInt();
        return new Puntos(x1,y1,x2,y2);
    }
    public double distanciaPuntos(Puntos p){
        double catetoA = abs(p.getX2()-p.getX1());
        double catetoB = abs(p.getY2()-p.getY1());
        return sqrt(pow(catetoA,2)+pow(catetoB,2));
    }
}
