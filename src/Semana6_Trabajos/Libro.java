package Semana6_Trabajos;

public class Libro {
    String titulo;
    String autor;
    int ISBN;
    double precio;
    
    public Libro(String titulo, String autor, int ISBN, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }
    
    public void mostar(){
        System.out.println("Titulo: "+titulo
                          +"\n Autor: "+autor
                          +"\n ISBN: "+ISBN
                          +"\n Precio: L."+precio);
    }
    
    public void descuento(int edad){
        double descuento;
        if (edad >= 18) {
            descuento = precio*0.25;
        }else{
            descuento=precio*0.10;
        }
        double precioFinal = precio - descuento;
        System.out.println("Precio actualizado (DESCUENTO): L."+precioFinal);
    }
}
