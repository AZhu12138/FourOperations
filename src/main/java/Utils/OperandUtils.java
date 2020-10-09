package Utils;

import java.util.Random;

/**
 * 生成随机操作数
 */
public class OperandUtils {

    /**
     * 生成一个随机的操作数
     * @param range 操作数的范围
     * @return 随机的操作数
     */
    public static String getRandomOperand(int range) {
        // 分子
        int numerator;
        // 分母
        int denominator;
        Random random = new Random();

        denominator = random.nextInt(15) + 1;
        numerator = random.nextInt(denominator * range);
        String fraction = numerator + "/" + denominator;

        return fraction;
    }

}
