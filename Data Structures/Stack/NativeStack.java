/**
 * @author littledream1502@gmail.com
 * @date 2018/1/16
 * @desc 用数组模拟的原生栈;
 */
public class NativeStack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    NativeStack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    public static void main(String[] args) {
        NativeStack stack = new NativeStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()+" Poped from Stack.");
    }
}
