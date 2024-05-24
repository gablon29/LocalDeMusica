package exerciseTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test para exerciseTest/Operaciones.java")
class OperacionesTest {
@Test
@DisplayName("Prueba de area de un rectangulo")
    void test(){
    //GIVEN
    int input1 = 2;
    int input2 = 4;
    //WHEN
    int result = Operaciones.areaRectangulo(input1, input2);
    //THEN
    int outputExpected = 8;
    assertEquals(outputExpected, result);

}
@Test
@DisplayName("Metodo para verificar condicion de par")
    void codicionPar(){
    int entrada = 1133;
    boolean result = Operaciones.esPar(entrada);
    assertFalse(result);
}
@Test
@DisplayName("Contador de characteres")
void countCharactersTest(){
    String cadenaInput = "hola como estas";
    int result = Operaciones.countCharacters(cadenaInput);
    assertEquals(15, result);
}
@Test
    @DisplayName("Metodo para revertir cadena")
    void reverseStringTest(){
    String input = "hola";
    String result = Operaciones.revertirCadena(input);
    String expected = "aloh";
    Assertions.assertEquals(expected, result);
}
}