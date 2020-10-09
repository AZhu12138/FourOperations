package pojo;

import org.junit.Test;

public class PojoTest {

    @Test
    public void testPorblem() {
        Problem problem1 = new Problem();
        Problem problem2 = new Problem("题目2的后缀题目");

        problem1.setSuffixProblem("题目1的后缀题目");
        problem1.setInfixProblem("题目1的中缀题目");
        problem1.setAnswer("题目1的答案");

        problem2.setInfixProblem("题目2的中缀题目");
        problem2.setAnswer("题目2的答案");

        System.out.println(problem1.getSuffixProblem());
        System.out.println(problem1.getInfixProblem());
        System.out.println(problem1.getAnswer());

        System.out.println(problem2);
    }

    @Test
    public void testOperationStack() {
        OperationStack stack = new OperationStack(10);
        stack.push("题目1");
        System.out.println(stack);
        stack.push("题目2");
        stack.push("题目3");
        System.out.println(stack);
        System.out.println("弹出："+stack.pop());
        System.out.println(stack);
        System.out.println("弹出："+stack.pop());
        System.out.println(stack);
        System.out.println("弹出："+stack.pop());
        System.out.println(stack);
        System.out.println("弹出："+stack.pop());
        System.out.println(stack);
    }

}
