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

}
