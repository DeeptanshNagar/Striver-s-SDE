import java.util.ArrayList;

public class optimized {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        // int[] arr = {5,4,3,2,1}; // All elements will store.
        ArrayList<Integer> result = leaders(arr);
        System.out.println(result);
    }

    static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > maxi) {
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        return ans;
    }
}

// tc - o(n)
// sc - o(n)
