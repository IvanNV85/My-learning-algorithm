package algorithm.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.push(5);
        myStack.push(6);


        myStack.getTop();
        myStack.getHeight();
        myStack.prinStack();
    }
}
