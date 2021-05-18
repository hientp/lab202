import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTesting2Test {

    @Test
    void multiplyNumbers(){
        MathTesting mathTesting = new MathTesting();
        int result = mathTesting.multiplyNumbers(2,7);
        assertEquals(14, result);
    }

}