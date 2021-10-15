package Entidades.Servicios;

import java.util.Scanner;
import Entidades.Cuenta;

public class ServiciosCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     public Cuenta crearCuenta(){
        System.out.println("Ingrese nro de cta");
        int cta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        System.out.println("Ingrese Saldo Actual");
        double saldo = leer.nextDouble();
        System.out.println("Ingrese interes");
        double inter = leer.nextDouble();
        return new Cuenta(cta,dni,saldo,inter);
    }
     public void ingresar(Cuenta cta , double ingreso){
         cta.setSaldoActual(ingreso + cta.getSaldoAct());
    }
    public void retirar(Cuenta cta , double retiro){
        if(retiro <= cta.getSaldoAct()){
            cta.setSaldoActual(cta.getSaldoAct() - retiro); 
        }else{
            cta.setSaldoActual(0);
        }
    }
    public void extraccionRapida(Cuenta cta){
        System.out.println("Cuanto dinero quiere extraer?");
        double extraccion = leer.nextDouble();
        if(extraccion <= (cta.getSaldoAct()*0.2)){
            cta.setSaldoActual(cta.getSaldoAct() - extraccion) ;
        }else{
            System.out.println("Solo puede extraer el 20% de su saldo");
        }
    }
    public void consultarSaldo(Cuenta cta){
        System.out.println("Su saldo es de $"+cta.getSaldoAct());
    }
    public void consultarDatos(Cuenta cta){
        System.out.println("Nro cta: "+cta.getNumCuenta());
        System.out.println("DNI:     "+cta.getDniCliente());
        System.out.println("Saldo:  $"+cta.getSaldoAct());
        System.out.println("Interes: "+cta.getInteres());
    }
}
