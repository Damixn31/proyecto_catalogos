package org.olmedo.poointerface.modelo;

public class Comics extends Libro {
   private String personaje;


   public Comics(int precio, String personaje, String autor, String titulo, String editorial){
     super(autor, editorial, titulo, precio);
     this.personaje = personaje;
   }   

   public String getPersonaje(){
     return personaje;
   }

   @Override
   public double getPrecioVenta(){
     return this.getPrecio() * 0.85;
   }
}
