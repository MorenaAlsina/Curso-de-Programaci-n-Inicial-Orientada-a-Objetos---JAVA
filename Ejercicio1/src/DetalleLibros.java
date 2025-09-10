import java.util.Scanner;

public class DetalleLibros {
    public static void main(String[] args) {
        //Detalle libro
        String tituloLibro = "El senior de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        //imprimir
        System.out.println(tituloLibro);
        System.out.println("Titulo: " + tituloLibro);
        System.out.println("Anio Publicacion: " + anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println("Precio: " + precio);

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del libro: ");
        var titulo = sc.nextLine();
        System.out.println("Nombre del libro: " + titulo);




    }
}