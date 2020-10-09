package pojo;

import java.util.Arrays;

/**
 * 用于实现四则运算的栈数据结构
 */
public class OperationStack {

    String[] data;
    int maxSize;
    int top;

    public OperationStack(int maxSize) {
        this.maxSize = maxSize;
        data = new String[maxSize];
        top = 0;
    }

    // 将数据压入栈中
    public void push(String s) {
        data[top++] = s;
    }

    // 弹出栈中的一个值
    public String pop() {
        if (top == 0) {
            return null;
        } else {
            return data[--top];
        }
    }

    @Override
    public String toString() {
        return "OperationStack{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

}
