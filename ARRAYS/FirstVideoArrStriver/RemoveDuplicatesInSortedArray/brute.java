import java.util.HashSet;
import java.util.Set;

public class brute {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,5,6,6,6,7,7,7};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    static int removeDuplicates(int[] arr) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {          // NlogN
            st.add(arr[i]);
        }
        int k = st.size();

        int index = 0;
        for(Integer it : st) {                          // N
            arr[index] = it;
            index++;
        }
        return k;
    }
}
// TC -> 0(NlogN + N)
// SC -> 0(N)