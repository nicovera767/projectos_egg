package Entidades;
public class NIF {
    private long dni;
    private String letra;
    public NIF(){}
    public NIF(long dni , String letra){
        this.dni = dni;
        this.letra = letra;
    }
    public void setDni(long dni){
        this.dni = dni;
    }
    public long getDni(){
        return dni;
    }
    public void setLetra(String letra){
        this.letra = letra;
    }
    public String getLetra(){
        return letra;
    }
}
