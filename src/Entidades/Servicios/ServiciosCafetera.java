package Entidades.Servicios;

import Entidades.Cafetera;

public class ServiciosCafetera {
    
     public void llenarCafetera(Cafetera caf){
        caf.setCantActual(caf.getCapMax());
    }
    public void servirTaza(Cafetera caf , int cant){
        if((double)cant <= caf.getCantAct()){
            caf.setCantActual(caf.getCantAct()-(double)cant);
        }else{
            System.out.println("La taza no se pudo llenar, faltando "+((double)cant - caf.getCantAct()));
            this.vaciarCafetera(caf);
        }
    }
    public void vaciarCafetera(Cafetera caf){
        caf.setCantActual(0);
    }
    public void agregarCafe(Cafetera caf , int cafe){
        if((caf.getCapMax()-caf.getCantAct()) <= (double)cafe){
            caf.setCantActual(caf.getCantAct() + (double)cafe);
        }else{
            this.llenarCafetera(caf);
            System.out.println("Solo se agrego a la cafetera "+(caf.getCapMax()-caf.getCantAct()));
        }
    }
}
