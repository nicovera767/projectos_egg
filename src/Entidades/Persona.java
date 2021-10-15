package Entidades;
import java.util.Date;
import java.util.Scanner;
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre , sexo;
    private int edad ,menor20 = -1 , entre20y25 = 0 , mayor25 = 1 ;
    private Date fechaNacimiento;
    private double altura , peso , imc;
    //Constructores
    public Persona(){
        
    }
    public Persona (String nom , String sex , double alt , double peso ,int año ,int mes,int dia){
        nombre = nom;
        sexo = sex;
        fechaNacimiento = new Date(año,mes-1,dia);
        altura = alt;
        this.peso = peso;
    }
    //Getters y Setters
    public void setFechaNac(int año, int mes , int dia){
        fechaNacimiento = new Date(año , mes-1 , dia);
    }
    public Date getFechaNac(){
        return fechaNacimiento;
    }
    public void setImc(double imc){
        this.imc = imc;
    }
    public double getImc(){
        return imc;
    }
    public int getm20(){
        return menor20;
    }
    public int get20Y25(){
        return entre20y25;
    }
    public int getM25(){
        return mayor25;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setSexo(String s){
        sexo = s;
    }
    public String getSexo(){
        return sexo;
    }
    public void setEdad(int años){
        edad = años;
    }
    public int getEdad(){
        return edad;
    }
    public void setAltura(double alt){
        altura = alt;
    }
    public double getAltura(){
        return altura;
    }
    public void setPeso(double p){
        peso = p;
    }
    public double getPeso(){
        return peso;
    }
}
