import org.olmedo.poointerface.modelo.*;


public class ProyectoCatalagos {
    public static void main(String[] args) {

        IProducto[] productos = new Producto[6];

        productos[0] = new TvLcd(340000, "LG", 42);
        productos[1] = new Libro("Eric Gamma", "Elementos Reusable POO", "Alguna...", 18000);
        productos[2] = new Libro("Martin Fowler", "UML Gota a Gota", "Alguna...", 14000);
        productos[3] = new Comics(1000, "Spider-Man", "Stan Lee", "Regreso a casa", "Alguna...");
        productos[4] = new IPhone(540000, "Apple", "14 Pro Max", "Rojo");
        productos[5] = new IPhone(600000, "Apple", "14 Plus", "Negro");

        for (IProducto p : productos) {
            System.out.println("Tipo de: " + p.getClass().getName());
            System.out.println("- ");
            System.out.println("Precio: " + p.getPrecio());
            System.out.println("- ");
            System.out.println("Precio Final: " + p.getPrecioVenta());

            if(p instanceof IElectronico) {
                System.out.println("- ");
                System.out.println("Fabricante: " + ((IElectronico) p).getFabricante());


                if (p instanceof IPhone) {
                    System.out.println("- ");
                    System.out.println("Modelo: " + ((IPhone) p).getModelo());
                    System.out.println("- ");
                    System.out.println("Color: " + ((IPhone) p).getColor());
                }


                if (p instanceof TvLcd) {
                    System.out.println("- ");
                    System.out.println("Pulgadas: " + ((TvLcd) p).getPulgada());
                }
            }

                if (p instanceof ILibro) {
                    System.out.println("- ");
                    System.out.println("Titulo: " + ((ILibro) p).getTitulo());
                    System.out.println("- ");
                    System.out.println("Autor: " + ((ILibro) p).getAutor());


                if (p instanceof Comics) {
                    System.out.println("- ");
                    System.out.println("Personaje: " + ((Comics) p).getPersonaje());

                }
            }

            System.out.println();

        }
    }
}