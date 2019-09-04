package org.books.sistema;

import java.util.Scanner;
import org.books.dao.LibroJpaController;
import org.books.dominio.Libro;

public class Principal {

    private static Scanner sc = new Scanner(System.in);
    private static Scanner sbook = new Scanner(System.in);
    private static Libro b;
    private static LibroJpaController bookDao = new LibroJpaController();
    private static int op, id;

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("***********************************************************");
        System.out.println("***********************************************************");
        System.out.println("*******************[ MENU DE OPCIONES ]********************");
        System.out.println("***********************************************************");
        System.out.println("***********************************************************");
        System.out.println("___________________________________________________________");
        System.out.println(" ~1 Mostrar Libro Por Codigo                             ");
        System.out.println(" ~2 Agregar Libro Al Sitema Gestor Base De Datos         ");
        System.out.println(" ~3 Actualizar La Tupla                                    ");
        System.out.println(" ~4 Eliminar La Tupla                                      ");
        System.out.println(" ~5 Listar Libros                                         ");
        System.out.println(" ~6 Salir                                                  ");
        System.out.println("___________________________________________________________");
        System.out.println("  Ingrese Una Opcion A Realizar Por Favor...               ");
        System.out.println("___________________________________________________________");
        System.out.println("");

        op = sc.nextInt();

        switch (op) {
            case 1:
                   b = obtenerLibro();
                   System.out.println(b);
                break;
            case 2:
                    b = getBook();
                    if (bookDao.addBook(b))
                        System.out.println("Se agrego el libro con exito!");
                    else 
                        System.out.println("No se pudo agregar el libro intente de nuevo");
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;

            default:
                System.out.println("No Es Una Opcion Del Menu");
        }
    }
    
    public static Libro obtenerLibro(){
        System.out.println("Ingrese el codigo del libro");
        id = sc.nextInt();
        b = bookDao.findLibro(id);
        return b;
    }
}
