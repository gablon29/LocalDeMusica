package InterfaceExample;

public class Main {
    public static void main(String[] args) {
        Amigable gabriel = new Amigable();
        String despido = gabriel.saludoDespedia.despedir("gabriel", "gian");
        System.out.println(despido);
        String carinio = gabriel.abrazar("lucas");
        System.out.println(carinio);
        int cantidadDeGolpes = gabriel.golpear(4, 5);
        String pelea = "gabriel le golpea a lucas " + cantidadDeGolpes + "  golpes en la cara";
        System.out.println(pelea);
        String perdonar = gabriel.perdonar.pedirPerdon("lucas", "gian");
        System.out.println(perdonar);
    }
}
