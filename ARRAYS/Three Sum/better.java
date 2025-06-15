import java.util.*;

public class better {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(arr);
        for(List<Integer> it : result) {
            System.out.print("[ ");
            for(Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i+1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if(hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        return new ArrayList<>(st);
    }
}
