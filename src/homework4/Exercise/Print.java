package homework4.Exercise;

import java.util.List;

public class Print {
    public static void printList(List<?> lista) {
        for (Object object: lista
             ) {
            System.out.println(object);
        }
    }
}
