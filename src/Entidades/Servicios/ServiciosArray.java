package Entidades.Servicios;
import Entidades.Arrays;
import static java.lang.Math.random;
public class ServiciosArray {
    public void inicializarA(Arrays a){
        for(int i = 0 ; i < a.getTamaño() ; i++){
            double aux = random()*10;
            a.setArreglo(aux, i);
        }
        mostrarArreglo(a);
    }
    public void copiarEinicializar(int cant , Arrays a , Arrays b){
        for(int i = 0 ; i < b.getTamaño() ; i++){
            if(i<cant){
                b.setArreglo(a.getArreglo(i), i);
            }else{
                b.setArreglo(0.5, i);
            }
        }
    }
    public void ordenarArreglo(Arrays a){
        for(int i = 0 ; i < a.getTamaño() ; i++){
            for(int j = i+1 ; j < a.getTamaño() ; j++){
                if(a.getArreglo(i) > a.getArreglo(j)){
                    double aux = a.getArreglo(i);
                    a.setArreglo(a.getArreglo(j), i);
                    a.setArreglo(aux, j);
                }
            }
        }
    }
    public void mostrarArreglo(Arrays a){
        for(int i = 0 ; i < a.getTamaño() ; i++){
            System.out.println("["+a.getArreglo(i)+"]");
        }
    }
}
