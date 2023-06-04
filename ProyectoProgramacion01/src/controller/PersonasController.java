package controller;

import interfaces.Interfaces;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Personas;

public class PersonasController implements Interfaces {

    public static ArrayList<Personas> listaPersonas = new ArrayList();

    @Override
    public void agregar() {
        int telefono = 0;

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre completo: ");
        String correo = JOptionPane.showInputDialog("Ingrese su correo eletrónico: ");
        
        try{
            telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de teléfono: "));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Favor ingrese correctamente los datos solicitados.");
            return;
        }

        Personas persona = new Personas(0, nombre, telefono, correo);

        listaPersonas.add(persona);

    }

    @Override
    public void editar() {

        int id = -1;
        String nuevoNombre;
        int nuevoTelefono;
        String nuevoCorreo;
        
        try{
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id para modificar sus datos: "));
        } catch(NumberFormatException e) {
            
        }

        for (Personas i : listaPersonas) {
            if (i.getId() == id) {
                nuevoNombre = JOptionPane.showInputDialog("Ingrese su nuevo nombre: ",
                        i.getNombreInquilino());
                try{
                nuevoTelefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nuevo número telefónico: ",
                        i.getTelefono()));
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Favor ingrese correctamente los datos solicitados.");
                    return;
                }
                nuevoCorreo = JOptionPane.showInputDialog("Ingrese su nuevo correo electrónico: ",
                        i.getCorreo());

                i.setNombreInquilino(nuevoNombre);
                i.setCorreo(nuevoCorreo);
                i.setTelefono(nuevoTelefono);
                return;

            }
        }

        JOptionPane.showMessageDialog(null, "El id ingresado no existe.");

    }

    @Override
    public void consultar() {

        int id = -1;

        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a consultar: "));
        } catch (NumberFormatException e) {

        }

        for (Personas i : listaPersonas) {
            if (i.getId() == id) {
                JOptionPane.showMessageDialog(null, i.toString());
                return;
            }

        }

        JOptionPane.showMessageDialog(null, "El id ingresado no existe.");

    }

}
