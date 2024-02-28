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

    public double[] porcIntrumentos(String nameSuc) {
        double[] porcentajes = null;
        Sucursal sucEncontrada = buscarSucursal(nameSuc);
        if (sucEncontrada != null) {
            porcentajes = sucEncontrada.porcIntrumento();
        }
        return porcentajes;
    }

   public Sucursal buscarSucursal(String nameSuc) {
        Sucursal sucEncontrado = null;
        int i = 0;
        while ( i < sucursals.size() && !this.sucursals.get(i).getNombre().equals(nameSuc)) {
            i++;
        }
        if (i < sucursals.size()){
            sucEncontrado = this.sucursals.get(i);
        }
        return sucEncontrado;
   }
    public ArrayList<Instrumento> listaInstrumentosPorTipo(Tipo tipo) {
        ArrayList<Instrumento> instrumentosSeleccionados = new ArrayList<>();
        for (Sucursal sucursal: sucursals) {
            instrumentosSeleccionados.addAll( sucursal.intrumentosPorTipo(tipo));
        }
        return instrumentosSeleccionados;
    }
    public Instrumento borradoDeInstrumento(String ID) {
        Instrumento instBorrado = null;
        int i = 0;
        while(i < sucursals.size() && instBorrado == null) {
            instBorrado = sucursals.get(i).borrarInstrumento(ID);
            i++;
        }
        return instBorrado;
    }
}
