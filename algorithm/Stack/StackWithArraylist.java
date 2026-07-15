package algorithm.Stack;

import java.util.ArrayList;

public class StackWithArraylist {
    private ArrayList<Integer> stackList;

    public void Stack() {
        stackList = new ArrayList<>();
    }

    // Có thể giữ constructor có giá trị khởi tạo giống class cũ nếu muốn
    public void Stack(int value) {
        stackList = new ArrayList<>();
        stackList.add(value);
    }

    public void push(int value) {
        stackList.add(value);
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        // Xoá và trả về phần tử cuối cùng (đỉnh stack)
        return stackList.removeLast();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int getHeight() {
        return stackList.size();
    }

    public void printStack() {
        System.out.println("Stack: ");
        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println(" " + stackList.get(i));
        }
    }

}
