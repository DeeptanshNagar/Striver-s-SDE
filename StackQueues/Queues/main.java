class Queue {
    private int[] arr;
    private int start, end, currSize, maxSize;

    public Queue() {
        arr = new int[16];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public void push(int newElement) {
        if(currSize == maxSize) {
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
            // Argument inside parentheses (1) → The exit status code.
            // 0 → Normal termination (means “success”)
            // 1 → Abnormal termination (means “error” or “something went wrong”)
        }

        if(end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % maxSize;
        }

        arr[end] = newElement;
        System.out.println("Pushed Element: " + newElement);
        currSize++;
    }

    public int pop() {
        if(start == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }

        int popped = arr[start];
        if(currSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxSize;
        }
        currSize--;
        return popped;
    }

    public int top() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }
    
    public int size() {
        return currSize;
    }
}


public class main {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println(q.top());
        System.out.println(q.size());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.size());
    }
}
