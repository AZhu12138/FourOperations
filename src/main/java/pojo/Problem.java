package pojo;

/**
 * Problem 题目实体类，包含题目本身及其对应的答案
 */
public class Problem {

    private String suffixProblem;
    private String infixProblem;
    private String answer;

    public Problem() {
    }

    public Problem(String suffixProblem) {
        this.suffixProblem = suffixProblem;
    }

    public String getSuffixProblem() {
        return suffixProblem;
    }

    public void setSuffixProblem(String suffixProblem) {
        this.suffixProblem = suffixProblem;
    }

    public String getInfixProblem() {
        return infixProblem;
    }

    public void setInfixProblem(String infixProblem) {
        this.infixProblem = infixProblem;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "suffixProblem='" + suffixProblem + '\'' +
                ", infixProblem='" + infixProblem + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
