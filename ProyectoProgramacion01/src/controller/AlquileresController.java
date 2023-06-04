package controller;

import static controller.EdificiosController.listaEdificios;
import static controller.PersonasController.listaPersonas;
import interfaces.Interfaces;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alquileres;
import modelo.Edificios;
import modelo.Personas;

public class AlquileresController implements Interfaces {

    public static ArrayList<Alquileres> listaAlquileres = new ArrayList();
    
    @Override
    public void agregar() {

        // Variable para almacenar el índice del inquilino en la lista de personas
        int inquilinoIndex = -1;
        // Variable para almacenar el índice del edificio en la lista de edificios
        int edificioIndex = -1;
        // Declarar las variables fuera del bloque try
        int idInquilino;
        int idEdificio;
        float mensualidad;

        // Se solicita al usuario ingresar el ID del inquilino
        try {
            idInquilino = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de inquilino: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Favor ingrese correctamente los datos solicitados.");
            return;
        }

        // Se busca el inquilino en la lista de personas
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getId() == idInquilino) {
                inquilinoIndex = i; // Se encuentra el inquilino, se guarda su índice
                break;
            }
        }

        // Se muestra la información del inquilino si se encontró, o un mensaje de error si no
        if (inquilinoIndex != -1) {
            JOptionPane.showMessageDialog(null, listaPersonas.get(inquilinoIndex));
        } else {
            JOptionPane.showMessageDialog(null, "La persona no se ha encontrado. Favor registrar primero.");
            return;
        }

        // Se solicita al usuario ingresar el ID del edificio
        try {
            idEdificio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del edificio: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Favor ingrese correctamente los datos solicitados.");
            return;
        }

        // Se busca el edificio en la lista de edificios
        for (int i = 0; i < listaEdificios.size(); i++) {
            if (listaEdificios.get(i).getId() == idEdificio) {
                edificioIndex = i; // Se encuentra el edificio, se guarda su índice
                break;
            }
        }

        // Se muestra la información del edificio si se encontró, o un mensaje de error si no
        if (edificioIndex != -1) {
            JOptionPane.showMessageDialog(null, listaEdificios.get(edificioIndex));
        } else {
            JOptionPane.showMessageDialog(null, "El edificio no se ha encontrado. Favor registrar primero.");
            return;
        }

        // Si tanto el inquilino como el edificio se encontraron, se procede a agregar el alquiler
        if (inquilinoIndex != -1 && edificioIndex != -1) {
            // Se solicitan los datos del alquiler al usuario
            String numeroContrato = JOptionPane.showInputDialog("Ingrese el número de contrato: ");

            // Verificar si el alquiler ya existe en la lista de alquileres
            for (Alquileres alquilerExistente : listaAlquileres) {
                if (alquilerExistente.getNumeroContrato().equals(numeroContrato)
                        && alquilerExistente.getIdInquilino() == idInquilino
                        && alquilerExistente.getIdEdificio() == idEdificio) {
                    JOptionPane.showMessageDialog(null, "El alquiler ya existe. No se puede repetir.");
                    return;
                }
            }

            // Solicitar y validar los demás datos del alquiler
            String fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio(mm/dd/yy): ");
            String fechaFin = JOptionPane.showInputDialog("Ingrese la fecha de vencimiento(mm/dd/yy): ");
            try {
                mensualidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de mensualidad en dólares: "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Favor ingrese correctamente los datos solicitados.");
                return;
            }

            // Se crea un objeto Alquileres con los datos ingresados
            Alquileres alquiler = new Alquileres(0, idInquilino, idEdificio, numeroContrato, fechaInicio, fechaFin, mensualidad);

            // Se agrega el alquiler a la lista de alquileres
            listaAlquileres.add(alquiler);
        }
    }

    @Override
    public void editar() {

        int id = -1;

        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del alquiler por modificar: "));
        } catch (NumberFormatException e) {

        }

        for (Alquileres i : listaAlquileres) {
            if (i.getId() == id) {
                String numeroContrato = JOptionPane.showInputDialog("Ingrese el nuevo número de contrato: ", i.getNumeroContrato());
                String fechaInicio = JOptionPane.showInputDialog("Ingrese la nueva fecha de inicio: ", i.getFechaInicio());
                String fechaFin = JOptionPane.showInputDialog("Ingrese la nueva fecha de vencimiento: ", i.getFechaFin());
                float mensualidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo monto de mensualidad: ", i.getMensualidad()));

                i.setNumeroContrato(numeroContrato);
                i.setFechaInicio(fechaInicio);
                i.setFechaFin(fechaFin);
                i.setMensualidad(mensualidad);

                JOptionPane.showMessageDialog(null, "Los datos han sido modificados.");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "El id ingresado no existe.");

    }

    @Override
    public void consultar() {

        int id = -1;

        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del alquiler por consultar: "));
        } catch (NumberFormatException e) {

        }

        for (Alquileres i : listaAlquileres) {
            if (i.getId() == id) {
                JOptionPane.showMessageDialog(null, i.toString());
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "El id ingresado no existe.");

    }

}
