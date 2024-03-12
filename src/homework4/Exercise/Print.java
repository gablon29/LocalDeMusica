package homework4.Exercise;

import java.util.Collection;
import java.util.List;

public class Print {
    public static void printList(List<? extends Persona> lista) {
        for (Persona persona: lista
             ) {
            System.out.println(persona);
        }
    }
    public static <T> void impriElementos(List<? extends T> lista){
        for (T elemento: lista
             ) {
            System.out.println(elemento);
        }
    }
}
