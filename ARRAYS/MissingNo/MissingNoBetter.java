// Better approach : Striver

public class MissingNoBetter {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        int N = 5;
        int ans = missNo(nums, N);
        System.out.println(ans);
    }

    public static int missNo(int[] nums, int N) {
        int[] hash = new int[N+1];
        for (int i = 0; i < N-1; i++) {
            hash[nums[i]]++;
        }

        for (int i = 1; i <= N; i++) {
            if(hash[i]==0) {
                return i;
            }
        }

        return -1;
    }
}