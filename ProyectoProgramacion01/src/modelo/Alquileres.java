package modelo;

public class Alquileres {

    //Atributos
    private int id;
    private int idInquilino;
    private int idEdificio;
    private String numeroContrato;
    private String fechaInicio;
    private String fechaFin;
    private float mensualidad;

    //Variable incremental para actualizar el ID de los objetos que se van creando
    private static int nuevoid;   
    
    //Método para incrementar el id de los alquileres automáticamente
    public void setNuevoid() {
        nuevoid++; //Incrementa en 1 el ID       
    }
    
    //Constructores
    public Alquileres() {
    }

    public Alquileres(int id, int idInquilino, int idEdificio, String numeroContrato, String fechaInicio, String fechaFin, float mensualidad) {
        setNuevoid(); //Se llama el método para actualizar el id
        this.id = nuevoid; //Se establece el nuevo id al atributo
        this.idInquilino = idInquilino;
        this.idEdificio = idEdificio;
        this.numeroContrato = numeroContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.mensualidad = mensualidad;
    }

    //Getter & setter
    public int getId() {
        return id;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public int getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }

    //Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalles de los alquileres: ");
        sb.append("\nAlquier #: ").append(id);
        sb.append("\nID del edificio: ").append(idEdificio);
        sb.append("\nID del inquilino: ").append(idInquilino);
        sb.append("\nNúmero de contrato: ").append(numeroContrato);
        sb.append("\nFecha de inicio: ").append(fechaInicio);
        sb.append("\nFecha de vencimiento: ").append(fechaFin);
        sb.append("\nMensualidad: ").append(mensualidad);
        return sb.toString();
    }

}
