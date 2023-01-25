import ru.netology.Ints;
import ru.netology.IntsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntsCalculatorTest {
    int arg1 = 2;
    int arg2 = 3;
    Ints intsCalc = new IntsCalculator();
    @Test
    void sum() {
        int expectedResult = arg1 + arg2;
        int actualResult = intsCalc.sum(arg1, arg2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void mult() {
        int expectedResult = arg1 * arg2;
        int actualResult = intsCalc.mult(arg1, arg2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void pow() {
        int expectedResult = arg1 * arg1 * arg1;
        int actualResult = intsCalc.pow(arg1, arg2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
