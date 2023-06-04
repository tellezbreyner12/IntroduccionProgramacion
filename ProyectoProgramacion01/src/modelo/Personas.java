package modelo;

public class Personas {

    //Atributos
    private int id;
    private String nombreInquilino;
    private int telefono;
    private String correo;

    //Variable incremental para actualizar el ID de los objetos que se van creando
    private static int nuevoid;   
    
    //Método para incrementar el id de las personas automáticamente
    public void setNuevoid() {
        nuevoid++; //Incrementa en 1 el ID       
    }

    //Constructores de la clase Personas
    public Personas() {

    }

    public Personas(int id, String nombreInquilino, int telefono, String correo) {
        setNuevoid(); //Se llama el método para actualizar el id
        this.id = nuevoid; //Se establece el nuevo id al atributo
        this.nombreInquilino = nombreInquilino;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Getter & setter + encapsulamiento
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public String getNombreInquilino() {
        return nombreInquilino;
    }

    public void setNombreInquilino(String nombreInquilino) {
        this.nombreInquilino = nombreInquilino;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalles del cliente: ");
        sb.append("\nID del cliente: ").append(id);
        sb.append("\nNombre del cliente: ").append(nombreInquilino);
        sb.append("\nTeléfono: ").append(telefono);
        sb.append("\nCorreo: ").append(correo);
        return sb.toString();
    }

}
