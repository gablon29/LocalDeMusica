package bucleFor;

import java.util.ArrayList;
import java.util.List;

public class ExerciseFor {
    public static List<Character> cadenaArray(String cadena){
        List<Character> characters = new ArrayList<>();
        for (char charac: cadena.toCharArray()
             ) {
            characters.add(charac);
        }
        return characters;
    }

    public static List<Character> revertorCadena(List<Character> characters){
        List<Character> cadenaInvertida = new ArrayList<>();
        int n = characters.size();
        for (int i = n - 1; i >= 0; i--){
            cadenaInvertida.add(characters.get(i));
        }
        return cadenaInvertida;
    }
}
