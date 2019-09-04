package org.books.sistema;

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
        do{
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
                    System.out.println("¿Desea regresar al menú Principal?");
                    break;
                case 2:
                    System.out.println("¿Desea regresar al menú Principal?");
                    break;
                case 3:
                    System.out.println("¿Desea regresar al menú Principal?");
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
                    break;
                case 6:
                    System.out.println("------------------ Cerrando el Programa ------------------");
                    System.out.println("--------------- Que tenga un excelente día ---------------");
                    bookDao.cerrar();
                    break;

                default:
                    System.out.println("No Es Una Opcion Del Menu");
                    System.out.println("¿Desea intentarlo de nuevo?");
            }
        }while(sbook.nextLine().equalsIgnoreCase("si"));
            System.out.println("------------------ Cerrando el Programa ------------------");
            System.out.println("--------------- Que tenga un excelente día ---------------");
            bookDao.cerrar();
    }
}
