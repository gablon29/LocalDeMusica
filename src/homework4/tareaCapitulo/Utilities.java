package homework4.tareaCapitulo;

import java.util.Collection;
import java.util.List;

public class Utilities {
    public static void imprimirElementos(List<?> list){
        for (Object object: list
             ) {
            System.out.println(object);
        }
    }
    public static <T> void copiarElementos(List<? extends T> list, Collection<? super T> copia) {
        copia.addAll(list);
    }
}
