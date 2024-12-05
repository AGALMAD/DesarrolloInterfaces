import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverse_hola() {

        //Arrange
        String frase = "hola";
        String resultadoObtener = "aloh";

        //Act
        StringUtils stringUtils = new StringUtils();
        String resultadoObtenido = stringUtils.reverse(frase);


        //Assert
        assertEquals(resultadoObtener, resultadoObtenido);


    }

    @Test
    public void testReverse_adios() {

        //Arrange
        String frase = "adios";
        String resultadoObtener = "soida";

        //Act
        StringUtils stringUtils = new StringUtils();
        String resultadoObtenido = stringUtils.reverse(frase);


        //Assert
        assertEquals(resultadoObtener, resultadoObtenido);


    }

    
    @Test
    public void testPalindromo_anilina() {

        //Arrange
        boolean resultadoEsperado = true;
        String palabra = "anilina";

        //Act
        StringUtils stringUtils = new StringUtils();
        Boolean resultadoObtenido = stringUtils.esPalindromo(palabra);


        //Assert
        assertEquals(resultadoEsperado, resultadoObtenido);


    }




}
