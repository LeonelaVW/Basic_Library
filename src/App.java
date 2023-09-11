
import java.util.Scanner;

import servicio.LibroServicio;

public class App {
    public static void main(String[] args) throws Exception {
       /*  Creá un programa que simule un sistema de gestión de
biblioteca. Debe permitir a los usuarios buscar libros por
título o autor, verificar la disponibilidad (con atributo
booleano), prestar y devolver libros, y llevar un registro de
las transacciones. Debe poder emitir un

"ticket" (en formato
.txt) listo para ser imprimido, en el que conste los detalles
de la transacción. */

        Scanner qwerty = new Scanner(System.in);
        LibroServicio libroServis = new LibroServicio();

        libroServis.crearLibro();
        int menu = 0;

        do {
        System.out.println("INGRESE LA OPCION QUE DESEA EJECUTAR:");
        System.out.println("1. Buscar libro por titulo");
        System.out.println("2. Buscar libro por autor");
        System.out.println("3. Verificar disponibilidad del libro");
        System.out.println("4. Prestar libro");
        System.out.println("5. Devolver libro");
        System.out.println("6. Registro de libros prestados");
        System.out.println("7. Imprimir ticket");
        System.out.println("8. Salir");
        
        menu = qwerty.nextInt();

        switch (menu) {
            case 1:
                libroServis.buscarPorTitulo();
                break;
            case 2:
                libroServis.buscarPorAutor();
                break;
            case 3:
                libroServis.verDisponibilidad();
                break;
            case 4:
                libroServis.prestarLibro();
                break;
            case 5:
                libroServis.regresarLibro();
                break;
            case 6:
                libroServis.mostrarLibrosPrestados();
                break;
            case 7:
                libroServis.imprimirTicket();
                break;
            }
        } while (menu != 8);
        System.out.println("Gracias por su consulta.");

            qwerty.close();
    }
}
