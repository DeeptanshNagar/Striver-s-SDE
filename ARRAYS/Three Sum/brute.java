import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class brute {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        List<List<Integer>> result = threeSum(arr, n);
        for(List<Integer> it : result) {
            System.out.print("[ ");  
            for(Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] arr, int n) {
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
}