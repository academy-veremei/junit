package homework6;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class CalculatorMinusTest extends Assert {
    private int a;
    private int b;
    private int expected;

    public CalculatorMinusTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: вычитание ({0}-{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(
                new Object[][]{{1, 1, 0}, {10, 2, 8}, {20, 10, 10}});
    }

    @Test
    public void minusTest() {
        assertEquals(expected, Calculator.minus(a, b));
    }

}