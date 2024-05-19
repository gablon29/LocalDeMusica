package tiposVariables;

public class Main {
    public static void main(String[] args) {

        Nadador facundo = new Nadador("Facundo", "Espalda");
        System.out.println("Esta es la cantidad de nadadores:\n %s".formatted(Nadador.cantid_nad));
        Nadador martin = new Nadador("Martin", "Libre");
        int cant = Nadador.cantid_nad;
        System.out.println("Esto en el numero de nadadores:\n %s".formatted(cant));


    }
}
