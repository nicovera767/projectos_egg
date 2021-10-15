package Entidades;

public class JuegoMeses {

    private String[] meses = new String[12];
    private String mesSecreto;

    public JuegoMeses(int indice) {
        llenarMeses();
        mesSecreto = meses[indice];
    }

    public final void llenarMeses() {
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
    }

    public void setMesSecreto(String s) {
        mesSecreto = s;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
}
