// DAY 2 <-----/---> QUE 1

public class Ques1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int ans = addEven(arr);
        System.out.println(ans);
    }

    static int addEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}

// Time Comp. = O(N)
// Space Comp. = O(1)