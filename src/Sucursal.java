import java.util.ArrayList;

public class Sucursal {
    private ArrayList<Instrumento> instrumentos;
    private String nombre;

    public Sucursal(String nombre) {
        this.instrumentos = new ArrayList<>();
        this.nombre = nombre;
    }

    public Instrumento encontrarInstrumento(String ID) {
        int i = 0;
        while (i < instrumentos.size() && !this.instrumentos.get(i).getID().equals(ID)) {
            // comparar si el id es el mismo.
            if ()
        }
        return null;
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

    public ArrayList<Instrumento> intrumentosPorTipo(Tipo tipo) {
        ArrayList<Instrumento> seleccionados= new ArrayList<>();
        for (Instrumento instrumento: instrumentos) {
            if(instrumento.getTipo() == tipo) {
                seleccionados.add(instrumento);
            }
        }
        return seleccionados;
    }
}
