package controller;

import interfaces.Interfaces;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import modelo.Edificios;

public class EdificiosController implements Interfaces {

    public static ArrayList<Edificios> listaEdificios = new ArrayList();

    @Override
    public void agregar() {

        String nombreEdificio = JOptionPane.showInputDialog("Ingrese el nombre del edificio: ");
        String ubicacionEdificio = JOptionPane.showInputDialog("Ingrese la ubicación del edificio: ");

        Edificios edificio = new Edificios(0, nombreEdificio, ubicacionEdificio);

        listaEdificios.add(edificio);
        
    }

    @Override
    public void editar() {

        int id = -1;
        String nuevoNombre;
        String nuevaUbicacion;

        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del edificio por editar: "));
        } catch (NumberFormatException e) {
            
        }
        
        for (Edificios i : listaEdificios) {
            if (i.getId() == id) {

                nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del edificio: ", i.getNombreEdificio());
                nuevaUbicacion = JOptionPane.showInputDialog("Ingrese la nueva ubicación del edificio: ", i.getUbicacionEdificio());

                i.setNombreEdificio(nuevoNombre);
                i.setUbicacionEdificio(nuevaUbicacion);

                JOptionPane.showMessageDialog(null, "Datos modificados correctamente.");

                return; //Se sale del método una vez se haga la modificación
            }
        }
        
        JOptionPane.showMessageDialog(null, "El edificio consultado no existe.");

    }

    @Override
    public void consultar() {

        int id = -1;

        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del edificio por consultar: "));
        } catch (NumberFormatException e) {
            
        } 

        for (Edificios i : listaEdificios) {
            if (i.getId() == id) {
                JOptionPane.showMessageDialog(null, i.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El edificio consultado no existe.");
    }

    
    
}
