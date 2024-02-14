import java.util.ArrayList;

public class Sucursal {
    private ArrayList<Instrumento> instrumentos;
    private String nombre;

    public Sucursal(String nombre) {
        this.instrumentos = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarInstrumento (Instrumento instrumento) {
        this.instrumentos.add(instrumento);
    }

    public String getNombre() {
        return nombre;
    }

    public void listaDeIntrumentos () {
        for (Instrumento instrumento: instrumentos
             ) {
            System.out.println(instrumento);
        }
    }
}
