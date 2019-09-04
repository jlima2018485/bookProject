package org.books.sistema;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.books.dao.LibroJpaController;
import org.books.dao.exceptions.NonexistentEntityException;
import org.books.dominio.Libro;

public class Principal {

    private static Scanner sc = new Scanner(System.in);
    private static Scanner sbook = new Scanner(System.in);
    private static Libro b;
    private static LibroJpaController bookDao = new LibroJpaController();
    private static int op, id;

    public static void main(String[] args) {
        do {
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
            System.out.println("");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("¿Desea regresar al menú Principal?");
                    b = obtenerLibro();
                    System.out.println(b);
                    break;
                case 2:
                    System.out.println("¿Desea regresar al menú Principal?");
                    b = getBook();
                    if (bookDao.addBook(b)) {
                        System.out.println("Se agrego el libro con exito!");
                    } else {
                        System.out.println("No se pudo agregar el libro intente de nuevo");
                    }
                    break;
                case 3:
                    System.out.println("¿Desea regresar al menú Principal?");
                    b = obtenerLibro();
                    System.out.println(b);
                    System.out.println("Ingrese los nombres y apellidos nuevos");
                    b = new Libro(sc.nextInt(), sbook.nextLine(), sbook.nextLine(), sbook.nextInt(), sbook.nextLine(), sbook.nextLine(), sbook.nextFloat());

                    try {
                        bookDao.editBook(b);
                    } catch (Exception ex) {
                        System.out.println("No se puede actualizar el registro");
                    }
                    break;
                case 4:
                    b = obtenerLibro();
                    System.out.println("¿Está seguro que desea eliminar el siguiente registro?");
                    System.out.println(b);

                    try {
                        bookDao.destroyBook(id);
                        System.out.println("Registro eliminado éxitosamente");
                        System.out.println("¿Desea regresar al menú Principal?");
                    } catch (NonexistentEntityException ex) {
                        System.out.println("No fue posible eliminar el registro");
                        System.out.println("¿Desea regresar al menú Principal?");
                    }
                    break;
                case 5:
                    System.out.println("¿Desea regresar al menú Principal?");
                    List<Libro> libro = bookDao.findLibroEntities();
                    for (Iterator<Libro> iterator = libro.iterator(); iterator.hasNext();) {
                        Libro next = iterator.next();
                        System.out.println(next);
                    }
                    break;
                case 6:
                    System.out.println("------------------ Cerrando el Programa ------------------");
                    System.out.println("--------------- Que tenga un excelente día ---------------");
                    bookDao.cerrar();
                    System.exit(0);
                    break;

                default:
                    System.out.println("No Es Una Opcion Del Menu");
            }

        } while (sbook.nextLine().equalsIgnoreCase("si"));
        System.out.println("------------------ Cerrando el Programa ------------------");
        System.out.println("--------------- Que tenga un excelente día ---------------");
        bookDao.cerrar();
    }

    public static Libro obtenerLibro() {
        System.out.println("Ingrese el codigo del libro");
        id = sc.nextInt();
        b = bookDao.findLibro(id);
        return b;
    }

    private static Libro getBook() {
        System.out.println("Ingrese el codigo, el nombre, el autor, las paginas, el editorial, la categoria y el precio del libro");
        Libro b = new Libro(sc.nextInt(), sbook.nextLine(), sbook.nextLine(), sbook.nextInt(), sbook.nextLine(), sbook.nextLine(), sbook.nextFloat());
        return b;
    }
}
