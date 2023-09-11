package servicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Libro;


public class LibroServicio {
    List<Libro> libros = new ArrayList<Libro>();
    Scanner scanner = new Scanner(System.in);

    public void buscarPorTitulo(){
        System.out.println("Ingrese el titulo:");
        String titulo = scanner.nextLine();

        for (Libro libro : libros) {
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("El libro existe en nuestra biblioteca.");
            }
        }

        System.out.println("¡Gracias!");
    }

    public void buscarPorAutor(){
        System.out.println("Ingrese el autor:");
        String autor = scanner.nextLine();
        System.out.println("Buscando...");
        for (Libro libro : libros) {
            if(libro.getAutor().equalsIgnoreCase(autor)){
                System.out.println(libro.toString());
            }
        }
        System.out.println("-");
        System.out.println("¡Gracias!");
    }

    public void verDisponibilidad(){
        System.out.println("Ingrese el titulo del libro para verificar disponibilidad:");
        String titulo = scanner.nextLine();
        System.out.println("Buscando...");

        for (Libro libro : libros) {
            if(libro.isDisponible()){
                System.out.println("El libro esta disponible.");
            }
            
        }        System.out.println("-");
                System.out.println("¡Gracias!");

    }

    public void prestarLibro(){
        System.out.println("Ingrese el titulo del libro para prestar:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el nombre del lector:");
        String nombreLector = scanner.nextLine();
        System.out.println("Ingrese el DNI del lector:");
        int dniLector = scanner.nextInt();

        for (Libro libro : libros) {
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                libro.setNombreLector(nombreLector);
                libro.setDniLector(dniLector);
                libro.setDisponible(false);
                System.out.println("Libro prestato. Disponibilidad actual : false");
            }
        }
    }

    public void regresarLibro(){
        System.out.println("Ingrese el titulo del libro a regresar:");
        String titulo = scanner.nextLine();
        for (Libro libro : libros) {
            if(libro.getTitulo() == titulo && !libro.isDisponible()) {
                libro.setDisponible(true);
                System.out.println("Libro regresado. Disponibilidad actual : true");
            }
        }
    }

    public void imprimirTicket(){
        System.out.println("Ingrese el DNI del lector:");
        int dniLector = scanner.nextInt();
        Libro libro = new Libro();

        for (Libro libroAux : libros) {
            if(libroAux.getDniLector() == dniLector) {
                try {
                    FileWriter escritor = new FileWriter ("ticket.txt");
                    BufferedWriter buffer = new BufferedWriter(escritor);
                    buffer.write(libro.toString());
                    buffer.newLine();
                    buffer.write("Gracias.");
                    buffer.close();
            }   catch (IOException e) {
                System.out.println("Error al escribir en el archivo.");
            }
        }
    }
}

    public void mostrarLibrosPrestados () {
        for (Libro libro : libros) {
            if(libro.isDisponible() == false) {
                System.out.println("Listado de libros prestados:");
                System.out.println(libro.getTitulo().toString());
            }
        }
    }

    public void crearLibro() {
        Libro libro1 = new Libro();
        libro1.setAutor("Jorge Luis Borges");
        libro1.setTitulo("Ficciones");
        libro1.setDisponible(true);

        libros.add(libro1);

        Libro libro2 = new Libro();
        libro2.setAutor("Milan Kundera");
        libro2.setTitulo("La insoportable levedad del ser");
        libro2.setDisponible(true);

        libros.add(libro2);

        Libro libro3 = new Libro();
        libro3.setAutor("Federico Garcia Lorca");
        libro3.setTitulo("Bodas de sangre");
        libro3.setDisponible(true);

        libros.add(libro3);
    }


}
