package org.olmedo.poointerface.modelo;

import java.util.Date;

public class Libro extends Producto implements ILibro {
  private Date fechaPublicacion = new Date();
  private String autor;
  private String titulo;
  private String editorial;


  public Libro(String autor, String titulo, String editorial, int precio){
    super(precio);
    this.autor = autor;
    this.titulo = titulo;
    this.editorial = editorial;
  }


  @Override
  public Date getFechaPublicacion(){
    return fechaPublicacion;
  }

  public String getAutor(){
    return autor;
  }

  public String getTitulo(){
    return titulo;
  }

  public String getEditorial(){
    return editorial;
  }

  @Override
  public double getPrecioVenta(){
     return getPrecio() * 0.95;
  }

}
