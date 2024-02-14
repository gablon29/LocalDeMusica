import java.util.ArrayList;

public class Sucursal {
    private ArrayList<Instrumento> instrumentos;
    private String nombre;

    public void listaDeIntrumentos () {
        for (Instrumento instrumento: instrumentos
             ) {
            System.out.println(instrumento);
        }
    }
}
