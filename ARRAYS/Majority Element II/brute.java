import java.util.*;

public class brute {
    public static void main(String args[]) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3};
        int[] ans = majorityElement(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] majorityElement(int[] v) {
        int n = v.length; 
        int[] result = new int[2]; 
        int size = 0; 

        for (int i = 0; i < n; i++) {
            // check if v[i] is not already in result
            boolean alreadyAdded = false;
            for (int k = 0; k < size; k++) {
                if (result[k] == v[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                int cnt = 0;
                // count frequency of v[i]
                for (int j = 0; j < n; j++) {
                    if (v[j] == v[i]) {
                        cnt++;
                    }
                }

                // check if frequency > n/3
                if (cnt > (n / 3)) {
                    result[size] = v[i];
                    size++;
                }
            }

            if (size == 2) break; // no need to check more
        }

        return Arrays.copyOf(result, size); // return only filled part
    }
}
