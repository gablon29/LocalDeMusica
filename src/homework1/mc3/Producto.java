package homework1.mc3;



public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;
    private String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{ " +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    @Override
    public int compareTo(Producto o) {
       return Integer.compare((int) this.precio, (int) o.precio);
    }
}
