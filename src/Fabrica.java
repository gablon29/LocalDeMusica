import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Sucursal> sucursals;

    public Fabrica() {
        this.sucursals = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal){
        this.sucursals.add(sucursal);
    }

    public void listarSucursales() {
        for (Sucursal sucursal: sucursals
             ) {
            System.out.println(sucursal.getNombre());
            sucursal.listaDeIntrumentos();
        }
    }
    public ArrayList<Instrumento> listaInstrumentosPorTipo(Tipo tipo) {
        ArrayList<Instrumento> instrumentosSeleccionados = new ArrayList<>();
        for (Sucursal sucursal: sucursals) {
            instrumentosSeleccionados.addAll( sucursal.intrumentosPorTipo(tipo));
        }
        return instrumentosSeleccionados;
    }
}
