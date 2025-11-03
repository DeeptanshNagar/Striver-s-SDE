class Stack { // LIFO
    int size = 1000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    int top() {
        return arr[top];
    }

    int size() {
        return top + 1;
    }
}

public class main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println(s.top()); // 7
        System.out.println(s.size()); // 3
        System.out.println(s.pop()); // 7
        System.out.println(s.size()); // 2
        System.out.println(s.top()); // 3
    }
}
