class stackNode {
    int data;   
    stackNode next;

    public stackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private stackNode top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }
    
    public void stackPush(int x) {
        stackNode element = new stackNode(x);
        element.next = top;
        top = element;
        System.out.println("Element pushed: " + x);
        size++;
    }

    public int stackPop() {
        if (isEmpty()) {
            System.out.println("Cannot pop from empty stack");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    public int stackPeek() {
        if (isEmpty()) {
            System.out.println("Stack is empty — no element to peek");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int stackSize() {
        return size;
    }
}

public class main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.stackPush(10);
        stack.stackPush(20);
        stack.stackPush(30);
        System.out.println("Top element: " + stack.stackPeek());
        System.out.println("Popped element: " + stack.stackPop());
        System.out.println("Popped element: " + stack.stackPop());
        System.out.println("Top element now: " + stack.stackPeek());
        System.out.println("Current size: " + stack.stackSize());
        System.out.println("Popped element: " + stack.stackPop());
        System.out.println("Popped element: " + stack.stackPop());
    }
}
