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
}


public class main {
    public static void main(String[] args) {
        
    }
}
