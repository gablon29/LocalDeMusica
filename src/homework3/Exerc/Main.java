package homework3.Exerc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaPersonas listaPersonas = new ListaPersonas();

        listaPersonas.agregarPersonas(new Persona("gabriel", "29", "programar"));
        listaPersonas.agregarPersonas(new Persona("Ivan", "28", "entrenar"));
        listaPersonas.agregarPersonas(new Persona("Florencia", "27", "programar"));
    }
}
