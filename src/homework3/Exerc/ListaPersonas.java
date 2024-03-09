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

    // generamos una lista solo con los nombres
    public List<String> listarNombres() {
        return lista.stream()
                .map(persona -> persona.nombre)
                .collect(Collectors.toList());
    }

    // filtramos por hobby
    public List<Persona> filtrarPorHobby(String hobby) {
        return lista.stream().filter(persona -> persona.hobby.equals(hobby))
                .collect(Collectors.toList());
    }


    // generamos un nueva lista limitando elementos
    public List<Persona> filtroPorCantidad(int num) {
        return lista.stream()
                .limit(num)
                .collect(Collectors.toList());
    }
    public void printPersonas() {
        for (Persona persona: this.lista
             ) {
            System.out.println(persona);
        }
    }
}

