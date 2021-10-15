package Entidades.Servicios;
import Entidades.Raices;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class ServiciosRaices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public double getDiscriminante(Raices r){
        return (pow(r.getB(),2)-4*r.getA()*r.getC());
    }
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r) >= 0;
    }
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r)==0;
    }
    public void obtenerRaices(Raices r){
        if(tieneRaices(r)==true){
            double raiz1 = (-r.getB()+sqrt(getDiscriminante(r)/2*r.getA()));
            double raiz2 = (-r.getB()-sqrt(getDiscriminante(r)/2*r.getA()));
            System.out.println("Las raices son: "+raiz1+" , "+raiz2);
        }
    }
    public void obtenerRaiz(Raices r){
        if(tieneRaiz(r)==true){
            double raiz = (-r.getB()+sqrt(getDiscriminante(r)/2*r.getA()));
            System.out.println("La raiz es "+raiz);
        }
    }
    public void calcular(Raices r){
        if (tieneRaiz(r)==true){
            obtenerRaiz(r);
        }else if(tieneRaices(r)==true){
            obtenerRaices(r);
        }else{
            System.out.println("No Existe solucion.");
        }
    }
}
