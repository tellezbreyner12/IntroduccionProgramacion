package modelo;

public class Edificios {

    //Atributos
    private int id;
    private String nombreEdificio;
    private String ubicacionEdificio;

    //Variable incremental para actualizar el ID de los objetos que se van creando
    private static int nuevoid;

    //Método para incrementar el id de los edificios automáticamente
    public void setNuevoid() {
        nuevoid++; //Incrementa en 1 el ID       
    }

    //Constructores de la clase Edificios
    public Edificios() {

    }

    public Edificios(int id, String nombreEdificio, String ubicacionEdificio) {
        setNuevoid(); //Se llama el método para actualizar el id
        this.id = nuevoid; //Se establece el nuevo id al atributo
        this.nombreEdificio = nombreEdificio;
        this.ubicacionEdificio = ubicacionEdificio;
    }

    //Getter & setter + encapsulamiento
    public String getUbicacionEdificio() {
        return ubicacionEdificio;
    }

    public void setUbicacionEdificio(String ubicacionEdificio) {
        this.ubicacionEdificio = ubicacionEdificio;
    }

    public int getId() {
        return id;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    //Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Edificios disponibles para alquilar: ");
        sb.append("\nID del edificio: ").append(id);
        sb.append("\nNombre del edificio: ").append(nombreEdificio);
        sb.append("\nUbicación del edificio: ").append(ubicacionEdificio);
        return sb.toString();
    }

}
