import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //method is used to check if the actual result of the add method call is equal to the expected result
        assertEquals(4, Calculator.add(2,2));
    }

    
    /* AssertAll() method tests the multiply() method of the Calculator class with four different input parameters and expected results. */
    @Test
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}
