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
        System.out.println(" ~1 Mostrar Persona Por Codigo                             ");
        System.out.println(" ~2 Agregar Persona Al Sitema Gestor Base De Datos         ");
        System.out.println(" ~3 Actualizar La Tupla                                    ");
        System.out.println(" ~4 Eliminar La Tupla                                      ");
        System.out.println(" ~5 Listar Persona                                         ");
        System.out.println(" ~6 Salir                                                  ");
        System.out.println("___________________________________________________________");
        System.out.println("  Ingrese Una Opcion A Realizar Por Favor...               ");
        System.out.println("___________________________________________________________");
        System.out.println("");

        op = sc.nextInt();

        switch (op) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                b = obtenerBook();
                System.out.println(b);
                System.out.println("Ingrese los nombres y apellidos nuevos");
                b = new Libro (sc.nextInt(), sbook.nextLine(), sbook.nextLine(), sbook.nextInt(), sbook.nextLine(), sbook.nextLine(), sbook.nextFloat());
	
                try {
		bookDao.editBook(b);
                } catch (Exception ex) {
		System.out.println("No se puede actualizar el registro");
                }
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
    private static Libro getBook() {
        System.out.println("Ingrese el codigo, el nombre, el autor, las paginas, el editorial, la categoria y el precio del libro");
        Libro b = new Libro (sc.nextInt(), sbook.nextLine(), sbook.nextLine(), sbook.nextInt(), sbook.nextLine(), sbook.nextLine(), sbook.nextFloat());
        return b;
	}
}
