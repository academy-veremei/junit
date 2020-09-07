package homework6;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class CalculatorPlusTest extends Assert {
    private int a;
    private int b;
    private int expected;

    public CalculatorPlusTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: сложение ({0}+{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{{1, 1, 2}, {2, 2, 4}, {10, 10, 20}});
    }

    @Test
    public void plusTest() {
        assertEquals(expected, Calculator.plus(a, b));
    }

}
