package Utils;

import org.junit.Test;

public class OperatorUtilsTest {

    @Test
    public void getRandomOperatorTest() {
        for (int i = 0; i < 100; i++) {
            System.out.println(OperatorUtils.getRandomOperator());
        }
    }

    @Test
    public void getOperatorOrderTest() {
        System.out.println("+的：" + OperatorUtils.getOperatorOrder("+"));
        System.out.println("-的：" + OperatorUtils.getOperatorOrder("-"));
        System.out.println("×的：" + OperatorUtils.getOperatorOrder("×"));
        System.out.println("÷的：" + OperatorUtils.getOperatorOrder("÷"));
        System.out.println(" 的：" + OperatorUtils.getOperatorOrder(" "));
        System.out.println("错的：" + OperatorUtils.getOperatorOrder("错"));
    }

    @Test
    public void hasOperatorTest() {
        System.out.println("123456：" + OperatorUtils.hasOperator("123456"));
        System.out.println("123+456：" + OperatorUtils.hasOperator("123+456"));
        System.out.println("12-3456：" + OperatorUtils.hasOperator("12-3456"));
        System.out.println("1234×56：" + OperatorUtils.hasOperator("1234×56"));
        System.out.println("1÷23456：" + OperatorUtils.hasOperator("1÷23456"));
    }

}
