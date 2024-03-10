package homework3.Exerc;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaPersonas listaPersonas = new ListaPersonas();

        listaPersonas.agregarPersonas(new Persona("gabriel", "29", "programar", TipoPersona.PROGRAMADOR));
        listaPersonas.agregarPersonas(new Persona("Ivan", "28", "entrenar", TipoPersona.ENTRENADOR));
        listaPersonas.agregarPersonas(new Persona("Florencia", "27", "programar", TipoPersona.PROGRAMADOR));
        listaPersonas.agregarPersonas(new Persona("lucas", "23", "trabajar", TipoPersona.PROGRAMADOR));

        List<Persona> personas = listaPersonas.filtroPorCantidad(2);
        personas.forEach(persona -> System.out.println(persona.nombre));
        List<String> nombres = listaPersonas.listarNombres();
        nombres.forEach(System.out::println);
        System.out.println(" ");
        listaPersonas.printPersonas();
        }

    }

