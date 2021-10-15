package Entidades;
import java.util.Scanner;
public class Cuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual , interes;
    //Constructores
    public Cuenta(){
        
    }
    public Cuenta(int nC , long dni , double saldo , double interes){
        numeroCuenta = nC;
        dniCliente = dni;
        saldoActual = saldo;
        this.interes = interes;
    }
    //Getters y Setters
    public void setNumCuenta(int numCta){
        numeroCuenta = numCta;
    }
    public int getNumCuenta(){
        return numeroCuenta;
    }
    public void setDniCliente(long dni){
        dniCliente = dni;
    }
    public long getDniCliente(){
        return dniCliente;
    }
    public void setSaldoActual(double saldo){
        saldoActual = saldo;
    }
    public double getSaldoAct(){
        return saldoActual;
    }
    public void setInteres(double interes){
        this.interes = interes;
    }
    public double getInteres(){
        return interes;
    }
}
  
