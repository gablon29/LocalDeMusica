package homework3.Exerc;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaPersonas listaPersonas = new ListaPersonas();

        listaPersonas.agregarPersonas(new Persona("gabriel", "29", "programar"));
        listaPersonas.agregarPersonas(new Persona("Ivan", "28", "entrenar"));
        listaPersonas.agregarPersonas(new Persona("Florencia", "27", "programar"));
        listaPersonas.agregarPersonas(new Persona("lucas", "23", "trabajar"));

        List<Persona> personas = listaPersonas.filtroPorCantidad(2);
        personas.forEach(persona -> System.out.println(persona.nombre));
        List<String> nombres = listaPersonas.listarNombres();
        nombres.forEach(System.out::println);
        System.out.println(" ");
        listaPersonas.printPersonas();
        }

    }

