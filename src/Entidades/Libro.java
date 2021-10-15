package Entidades;

import java.util.Scanner;

public class Libro {
    int isbn , numDePaginas;
    String titulo , autor ;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro (){
        
    }
    public Libro(int isbn , int numDePaginas , String autor , String titulo){
        this.isbn = isbn;
        this.numDePaginas = numDePaginas;
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro cargarLibro(){
        System.out.println("Ingrese numero de ISBN");
        isbn = leer.nextInt();
        System.out.println("Ingrese Titulo del Libro");
        titulo = leer.next();
        System.out.println("Ingrese Autor ");
        autor = leer.next();
        System.out.println("Ingrese cantidad de paginas");
        numDePaginas = leer.nextInt();
        Libro l = new Libro(isbn , numDePaginas , autor , titulo);
        return l;
    }
    public void mostrarLibro(){
        System.out.println("Numero de ISBN: "+isbn);
        System.out.println("El titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Nro de pag: "+numDePaginas);
    }
    
}
