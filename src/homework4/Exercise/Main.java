package homework4.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deportista gabriel = new Deportista("gabriel", "Londero", 100);
        Deportista florencia = new Deportista("florencia", "Pacheco", 100);
        Persona lucas = new Persona("lucas", "londero");
        Persona gian = new Persona("gian", "londero");
        ListaDePersonas<Persona> listaDePersonas = new ListaDePersonas<>();
        listaDePersonas.agregarALista(lucas);
        listaDePersonas.printList();
        gabriel.saludar();
    }

}
