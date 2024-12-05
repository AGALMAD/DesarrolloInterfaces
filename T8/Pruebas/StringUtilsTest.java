import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverse_Hola() {

        //Arrange
        String frase = "hola";
        String resultadoObtener = "aloh";

        //Act
        StringUtils stringUtils = new StringUtils();
        String resultadoObtenido = stringUtils.reverse(frase);


        //Assert
        assertEquals(resultadoObtener, resultadoObtenido);


    }
}
