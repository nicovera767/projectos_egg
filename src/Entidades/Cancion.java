package Entidades;
public class Cancion {
    private String titulo, autor;
    
    public Cancion(){
        titulo = "";
        autor = "";
    }
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
}
