import java.util.HashSet;

public class optimized {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1}; // [1, 2, 3, 4, 100, 101, 102]
        int ans = findLongestSeq(arr);
        System.out.println(ans);
    }

    static int findLongestSeq(int[] arr) {
        if(arr.length == 0) return 0;
        int longest = 1;
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashset.add(arr[i]);
        }
        for(int it : hashset) {
            if(!hashset.contains(it - 1)) {
                int count = 1;
                int x = it;
                while(hashset.contains(x+1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }    
}