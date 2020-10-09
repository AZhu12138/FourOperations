package Utils;

import org.junit.Test;

public class OperandUtilsTest {

    @Test
    public void testGetRandomOperand() {
        for (int i = 0; i < 100; i++) {
            String operand = OperandUtils.getRandomOperand(5);
            System.out.println(operand);
        }
        System.out.println("=====================================");
        for (int i = 0; i < 100; i++) {
            String operand = OperandUtils.getRandomOperand(10);
            System.out.println(operand);
        }
        System.out.println("=====================================");
        for (int i = 0; i < 100; i++) {
            String operand = OperandUtils.getRandomOperand(100);
            System.out.println(operand);
        }
    }

}
