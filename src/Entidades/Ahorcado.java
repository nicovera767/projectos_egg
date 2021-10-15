package Entidades;

public class Ahorcado {

    private final String[] palabra;
    private String[] adivina;
    private int cantEncontradas, intentos;

    public Ahorcado(String[] palabra, String[] ad, int jugadasMax) {
        this.palabra = palabra;
        adivina = ad;
        cantEncontradas = 0;
        intentos = jugadasMax;
    }

    public void setCantEncontradas(int cant) {
        cantEncontradas = cant;
    }

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setIntentos(int i) {
        intentos = i;
    }

    public int getIntentos() {
        return intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public String[] getAdivina() {
        return adivina;
    }

    public void setAdivina(String l, int indice) {
        adivina[indice] = l;
    }
}
