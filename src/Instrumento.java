public class Instrumento {
    private String ID;
    private String nombre;
    private Tipo tipo;

    public Instrumento(String ID, String nombre, Tipo tipo) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "ID='" + ID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
