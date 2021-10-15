package Entidades.Servicios;

import Entidades.Matematica;
import static java.lang.Math.abs;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class ServiciosMatematica {
    public double devolverMayor(Matematica m){
        if(m.getNumero1()==m.getNumero2()){
            System.out.println("Los numeros son iguales");
            return m.getNumero1();
        }else if(m.getNumero1()<m.getNumero2()){
            return m.getNumero2();
        }else{
            return m.getNumero1();
        }
    }
    public double calcularPotencia(Matematica m){
       double n1 = round(m.getNumero1());
       double n2 = round(m.getNumero2());
       if(n1 < n2){
           return pow(n2,n1);
       }else{
           return pow(n1,n2);
       }
    }
    public double calculaRaiz(Matematica m){
        return sqrt(abs(min(m.getNumero1(),m.getNumero2())));
    }
}
