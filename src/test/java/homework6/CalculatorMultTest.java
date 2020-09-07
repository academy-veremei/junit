package homework6;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class CalculatorMultTest extends Assert {
    private int a;
    private int b;
    private int expected;

    public CalculatorMultTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: произведение ({0}*{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{{2, 2, 4}, {3, 3, 9}, {5, 3, 15}});
    }

    @Test
    public void multTest() {
        assertEquals(expected, Calculator.mult(a, b));
    }
}
