import java.util.ArrayList;

// Tc = O(N^2)
// Sc = O(1) I Haven't use extra space to solve the problem but i have used extra space to store the answer, if you consider that then the Space comp will be O(N).
public class bruteforce {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        // int[] arr = {5,4,3,2,1}; // All elements will store.
        ArrayList<Integer> result = leaders(arr);
        System.out.println(result);
    }
    static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    leader = false;
                    break;
                }
            }
            if(leader == true) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}