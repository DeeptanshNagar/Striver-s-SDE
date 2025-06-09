import java.util.*;

public class FindtheUnion_brute {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6,8,9};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> result = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: result)
            System.out.print(val+" ");
        }

    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            s.add(arr2[i]);
        }
        for(int k : s) {
            union.add(k);
        }
        return union;
    }
}