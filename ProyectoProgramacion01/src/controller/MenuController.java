package controller;

import javax.swing.JOptionPane;

public class MenuController {

    public int MenuPrincipal(String titulo) { //Método Menu

        int opcion; //Variable para asignar la opción seleccionada
        
        //Creación del arreglo con las opciones
        String menu[] = {"Módulo Edificios", "Módulo Personas", "Módulo Alquileres", "Salir"}; 

        opcion = JOptionPane.showOptionDialog(null, titulo, "Menú Principal", 0,
                JOptionPane.QUESTION_MESSAGE, null, menu, "Salir");

        return opcion;
    }
    
    public int MenuCRUD(String titulo) {
        
        //Se crea el arreglo con las opciones del menú
        String[] opciones = {"Agregar", "Editar", "Consultar", "Volver"}; 
        
        int opcion = JOptionPane.showOptionDialog(null, titulo,
                "Menú", 0, JOptionPane.QUESTION_MESSAGE,
                null, opciones, "Volver"); //Esto crea la ventanita con las opciones del arreglo
        
        return opcion; //Se retorna la variable opcion el cual contiene un número
    }    
}
