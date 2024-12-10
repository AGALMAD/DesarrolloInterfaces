import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverse_cat() {

        //Arrange
        String frase = "cat";
        String resultadoObtener = "tac";

        //Act
        StringUtils stringUtils = new StringUtils();
        String resultadoObtenido = stringUtils.reverse(frase);


        //Assert
        assertEquals(resultadoObtener, resultadoObtenido);


    }

    @Test
    public void testReverse_dog() {

        //Arrange
        String frase = "dog";
        String resultadoObtener = "god";

        //Act
        StringUtils stringUtils = new StringUtils();
        String resultadoObtenido = stringUtils.reverse(frase);


        //Assert
        assertEquals(resultadoObtener, resultadoObtenido);


    }

    @Test
    public void testReverse_apple() {

        //Arrange
        String frase = "apple";
        String resultadoObtener = "elppa";

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
