import java.util.Arrays;

public class brute {

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        int n = intervals.length;

        // Sort intervals by starting time

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // {{1, 3}, {2, 6}, {8, 10}, {15, 18}}


        // Temporary array to store merged intervals (max n)

        int[][] temp = new int[n][2]; // n = 4, so temp = new int[4][2]
        // [ [0, 0], [0, 0], [0, 0], [0, 0] ]

        int index = -1; 

        for (int i = 0; i < n; i++) {
            int start = intervals[i][0]; 
            int end = intervals[i][1]; 

            if (index == -1 || start > temp[index][1]) {  
                // No overlap, add new interval
                index++;
                temp[index][0] = start; 
                temp[index][1] = end;   
            } else {
                // Overlapping interval, merge
                temp[index][1] = Math.max(temp[index][1], end);
            }
        }

        // Copy merged intervals to result array
        int[][] result = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {8, 10}, {2, 6}, {15, 18} };
        int[][] merged = mergeOverlappingIntervals(intervals);

        System.out.println("The merged intervals are:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print("[" + merged[i][0] + ", " + merged[i][1] + "]");
        }
    }
}
