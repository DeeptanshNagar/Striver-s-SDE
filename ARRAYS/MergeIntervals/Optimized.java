import java.util.*;

public class Optimized {

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        // Sort intervals based on start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            } else {
                int lastIndex = ans.size() - 1;
                int updatedEnd = Math.max(ans.get(lastIndex).get(1), arr[i][1]);
                ans.get(lastIndex).set(1, updatedEnd);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> merged = mergeOverlappingIntervals(intervals);
        for (List<Integer> interval : merged) {
            System.out.println(interval);
        }
    }
}
