package homework4.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ListaDePersonas<T>{

    private List<T> listaPersonas;

    public ListaDePersonas() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarALista(T tipo) {
        listaPersonas.add(tipo);
    }

    public List<T> getListaPersonas(){
        return listaPersonas;
    }
    public void printList() {
        for (T t: listaPersonas
             ) {
            System.out.println(t);
        }
    }
}
