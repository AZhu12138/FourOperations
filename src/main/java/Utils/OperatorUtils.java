package Utils;

import java.util.Random;

/**
 * 生成随机操作符
 */
public class OperatorUtils {

    /**
     * 生成随机操作符
     * @return 随机操作符
     */
    public static String getRandomOperator() {
        String[] operators = {"+", "-", "×", "÷"};
        Random random = new Random();
        int randomNum = random.nextInt(4);
        return operators[randomNum];
    }

    /**
     * 获得操作符的优先级
     * @param operator 传入的操作符
     * @return 返回优先级
     */
    public static int getOperatorOrder(String operator) {
        switch (operator) {
            case "+":
                return 0;
            case "-":
                return 0;
            case "×":
                return 1;
            case "÷":
                return 1;
            case " ":
                return 2;
        }
        return 0;
    }

    /**
     * 检查参数是否含有运算符
     * @param param 传入的参数
     * @return 返回结果
     */
    public static boolean hasOperator(String param) {
        return param.contains("+") || param.contains("-") ||
                param.contains("×") || param.contains("÷");
    }

}
