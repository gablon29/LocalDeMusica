package homework3.Exerc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaPersonas {
    List<Persona> lista;

    public ListaPersonas() {
        this.lista = new ArrayList<>();
    }

    public void agregarPersonas(Persona persona){
        this.lista.add(persona);
    }
    public List<String> listarNombres() {
        List<String> names = lista.stream()
                .map(persona -> persona.nombre)
                .collect(Collectors.toList());
        return names;
    }
    public List<Persona> filtrarPorHobby(String hobby) {
        List<Persona> names = lista.stream()
                .filter(persona -> persona.hobby.equals(hobby))
                .collect(Collectors.toList());
        return names;
    }
}

