import javax.annotation.processing.SupportedSourceVersion;
import java.awt.font.FontRenderContext;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        ArrayList<Instrumento> lista = f.listaInstrumentosPorTipo(Tipo.CUERDA);
        for (Instrumento instrumento: lista
             ) {
            System.out.println(instrumento);
        }
    }

    private static void cargarFabrica(Fabrica f){
        Sucursal blasparera = new Sucursal("blasparera");
        Sucursal lavalle = new Sucursal("Lavalle");
        blasparera.agregarInstrumento(new Instrumento("p1213", "flauta", Tipo.CUERDA));
        blasparera.agregarInstrumento(new Instrumento("p456", "piano", Tipo.PERCUSION));
        lavalle.agregarInstrumento(new Instrumento("L123", "Guitarra", Tipo.CUERDA));
        lavalle.agregarInstrumento(new Instrumento("L456", "trompeta", Tipo.VIENTO));
        f.agregarSucursal(blasparera);
        f.agregarSucursal(lavalle);
}
}
