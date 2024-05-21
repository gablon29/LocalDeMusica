package exerciseTest;

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
    int entrada = 11;
    boolean result = Operaciones.esPar(entrada);
    assertFalse(result);
}
}