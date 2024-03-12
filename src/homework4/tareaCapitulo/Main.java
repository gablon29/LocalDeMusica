package homework4.tareaCapitulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(5);
        List<Integer> list2 = new ArrayList<>();
        Utilities.copiarElementos(lista, list2);
        list2.forEach(System.out::println);
    }
}
