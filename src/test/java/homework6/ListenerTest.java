package homework6;

import org.junit.runner.JUnitCore;
import org.junit.runners.model.InitializationError;

public class ListenerTest {
    public static void main(String[] args) {
        JUnitCore junitCore = new JUnitCore();
        junitCore.addListener(new CalculatorTestListener());
        junitCore.run(CalculatorMinusTest.class, CalculatorPlusTest.class, CalculatorMultTest.class);
    }

}
