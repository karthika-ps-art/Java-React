import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp()
    {
        System.out.println("Setting up test");
        calculator=new Calculator();
    }
    @Test
    void testAddition() {
        //Arrange
        //Calculator calculator = new Calculator();
        //Act
        int result = calculator.add(2, 3);
        //Assert
        assertEquals(5, result);
    }

    @Test
    void testSubtraction()
    {
        //Arrange
        //Calculator calculator=new Calculator();
        //Act
        int result=calculator.subtract(5,3);
        //Assert
        assertEquals(2, result);
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("Cleaning up after test");
        calculator=null;
    }
}