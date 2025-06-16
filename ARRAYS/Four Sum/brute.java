import java.util.*;

public class brute {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        List<List<Integer>> result = fourSum(arr);
        for(List<Integer> it : result) {
            System.out.print("[ ");  
            for(Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
    public static List<List<Integer>> fourSum(int[] arr) {
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    for (int m = k+1; m < arr.length; m++) {
                        long sum = arr[i] + arr[j];
                        sum += arr[k];
                        sum += arr[m];
                        if(sum == 9) {
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[m]);
                            temp.sort(null);
                            st.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
}
