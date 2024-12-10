
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd_2_mas_2() {

        //Arrange
        int num1 = 2;
        int num2 = 2;
        int expectedResult = 4;
        Calculator calculator = new Calculator();

        //Act
        int actualResult = calculator.add(num1, num2);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testAdd_menos5_mas_6() {

        //Arrange
        int num1 = -5;
        int num2 = 6;
        int expectedResult = 1;
        Calculator calculator = new Calculator();

        //Act
        int actualResult = calculator.add(num1, num2);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testDivide_10_entre_5() throws Exception {
        //Arrange
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();

        //Act
        if (num2 == 0) {
            throw new Exception("No se puede dividir por 0");
        }

        int actualResult = calculator.divide(num1, num2);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

/* 
    @Test
    public void testDivide_10_entre_0() throws Exception {
        //Arrange
        int num1 = 10;
        int num2 = 0;
        int expectedResult = 2;
        Calculator calculator = new Calculator();

        //Act
        if (num2 == 0) {
            throw new Exception("No se puede dividir por 0");
        }

        int actualResult = calculator.divide(num1, num2);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    */
    

    @Test
    public void testMultiply_5_por_2() {
        //Arrange
        int num1 = 5;
        int num2 = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();

        //Act
        int actualResult = calculator.multiply(num1, num2);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply_5_por_0() {
        //Arrange
        int num1 = 5;
        int num2 = 0;
        int expectedResult = 0;
        Calculator calculator = new Calculator();

        //Act
        int actualResult = calculator.multiply(num1, num2);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtract_5_menos_2() {
        //Arrange
        int num1 = 5;
        int num2 = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();

        //Act
        int actualResult = calculator.subtract(num1, num2);

        //Assert
        assertEquals(expectedResult, actualResult);

    }


    @Test
    public void testSubtract_5_menos_0() {
        //Arrange
        int num1 = 5;
        int num2 = 0;
        int expectedResult = 5;
        Calculator calculator = new Calculator();

        //Act
        int actualResult = calculator.subtract(num1, num2);

        //Assert
        assertEquals(expectedResult, actualResult);

    }
}
