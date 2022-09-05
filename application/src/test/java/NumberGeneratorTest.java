import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    NumberGenerator ng = new NumberGenerator();

    @Test
    void generateRandomNumberLessThanInputTest() {
        int testFloorNumber = 10;
        int resultNumber = ng.generateRandomNumber(testFloorNumber);
        assertTrue(resultNumber > 10);
        //test comment
    }
}