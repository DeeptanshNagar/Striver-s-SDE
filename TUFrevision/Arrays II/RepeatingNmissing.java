public class RepeatingNmissing {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int[] result = repeatingNoAndMissingNo(arr);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    static int[] repeatingNoAndMissingNo(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        int repeating = -1;
        int missing = -1;

        // Count frequency of each number
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;  
            } else if (freq[i] == 2) {
                repeating = i; 
            }
        }
        return new int[]{repeating, missing};
    }
}
