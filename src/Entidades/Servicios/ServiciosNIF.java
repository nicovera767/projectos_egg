package Entidades.Servicios;
import Entidades.NIF;
import java.util.Scanner;
public class ServiciosNIF {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String[] vectorLetras = new String[23];
    private final String[] arreglo = new String[23];
    public void llenarArreglo(){
        arreglo[0]="T";
        arreglo[1]="R";
        arreglo[2]="W";
        arreglo[3]="A";
        arreglo[4]="G";
        arreglo[5]="M";
        arreglo[6]="Y";
        arreglo[7]="F";
        arreglo[8]="P";
        arreglo[9]="D";
        arreglo[10]="X";
        arreglo[11]="B";
        arreglo[12]="N";
        arreglo[13]="J";
        arreglo[14]="Z";
        arreglo[15]="S";
        arreglo[16]="Q";
        arreglo[17]="V";
        arreglo[18]="H";
        arreglo[19]="L";
        arreglo[20]="C";
        arreglo[21]="K";
        arreglo[22]="E";
    }
    public NIF crearNif(){
        llenarArreglo();
        System.out.println("Ingrese su dni");
        long dni = leer.nextLong();
        String letra = arreglo[(int)(dni%23)];
        return new NIF(dni,letra);
    }
    public void mostrar(NIF n){
        System.out.println("El NIF es :"+n.getDni()+"-"+n.getLetra());
    }
}
