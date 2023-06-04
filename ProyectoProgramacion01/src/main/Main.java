package main;

import controller.AlquileresController;
import controller.EdificiosController;
import controller.MenuController;
import controller.PersonasController;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        menuPrincipal();
    }

    //Método para ingresar a los 3 módulos
    public static void menuPrincipal() {

        //Instanciación de la clase MenuController
        MenuController menu = new MenuController();

        //Variable para almacenar la selección del menú
        int opcionMenu;

        do {
            opcionMenu = menu.MenuPrincipal("Bienvenido a Alquileres Bienes Raíces el Encanto."
                    + "\nSeleccione la opción deseada: "); //Lo que se retorna en el método se almacena en opcionMenu
            switch (opcionMenu) {
                case 0:
                    edificios();
                    break;
                case 1:
                    personas();
                    break;
                case 2:
                    alquileres();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ha salido del programa.");
                    System.exit(0); //Termina la aplicación.
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un opción válida.");
            }
        } while (opcionMenu != 4);

    }

    //Método para ingresar al módulo edificios
    public static void edificios() {

        //Instanciación de la clase MenuController
        MenuController menu = new MenuController();

        //Instanciación de la clase EdificiosController
        EdificiosController edificio = new EdificiosController();

        //Variable para almacenar la selección del menú
        int opcionMenu;

        do {
            opcionMenu = menu.MenuCRUD("Módulo 1. Edificios"
                    + "\nSeleccione una opción: ");
            switch (opcionMenu) {
                case 0:
                    //Agregar
                    edificio.agregar();
                    break;
                case 1:
                    //Editar
                    edificio.editar();
                    break;
                case 2:
                    //Consultar
                    edificio.consultar();
                    break;
                case 3: //Volver
                    menuPrincipal();
            }
        } while (opcionMenu != 4);
    }

    //Método para ingresar al módulo personas
    public static void personas() {

        //Instanciación de la clase MenuController
        MenuController menu = new MenuController();

        //Instanciación de la clase PersonasController
        PersonasController persona = new PersonasController();

        //Variable para almacenar la selección del menú
        int opcionMenu;

        do {
            opcionMenu = menu.MenuCRUD("Módulo 2. Personas"
                    + "\nSeleccione una opción: ");
            switch (opcionMenu) {
                case 0:
                    //Agregar
                    persona.agregar();
                    break;
                case 1:
                    //Editar
                    persona.editar();
                    break;
                case 2:
                    //Consultar
                    persona.consultar();
                    break;
                case 3:
                    //Volver
                    menuPrincipal();
            }
        } while (opcionMenu != 4);
    }

    //Método para ingresar al módulo alquileres
    public static void alquileres() {

        //Instanciación de la clase MenuController
        MenuController menu = new MenuController();

        //Instanciación de la clase AlquileresController
        AlquileresController alquileres = new AlquileresController();

        //Variable para almacenar la selección del menú
        int opcionMenu;

        do {
            opcionMenu = menu.MenuCRUD("Módulo 3. Alquileres"
                    + "\nSeleccione una opción: ");

            switch (opcionMenu) {
                case 0:
                    //Agregar
                    alquileres.agregar();
                    break;
                case 1:
                    //Editar
                    alquileres.editar();
                    break;
                case 2:
                    //Consultar
                    alquileres.consultar();
                    break;
                case 3:
                    //Volver
                    menuPrincipal();
            }
        } while (opcionMenu != 4);
    }

}
