package Entidades;
public class Arrays {
    private int tamaño;
    private final double[] arreglo;
    
    public Arrays(int tamaño){
        this.arreglo = new double[tamaño];
        this.tamaño = tamaño;
    }
    public void setArreglo(double valor , int indice){
        arreglo[indice] = valor;
    }
    public double getArreglo(int indice){
        return arreglo[indice];
    }
    public int getTamaño(){
        return tamaño;
    }
    
    
}
