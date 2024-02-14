import javax.annotation.processing.SupportedSourceVersion;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Sucursal blasparera = new Sucursal("blasparera");
        Sucursal lavalle = new Sucursal("Lavalle");
        blasparera.agregarInstrumento (new Instrumento("p1213", "flauta", Tipo.CUERDA));
        blasparera.agregarInstrumento(new Instrumento("p456", "piano", Tipo.PERCUSION));
        lavalle.agregarInstrumento(new Instrumento("L123", "Guitarra", Tipo.CUERDA));
        lavalle.agregarInstrumento(new Instrumento("L456", "trompeta", Tipo.VIENTO));
        Fabrica f = new Fabrica();
        f.agregarSucursal(blasparera);
        f.agregarSucursal(lavalle);
        f.listarSucursales();

        }
    }
