public class Optimized {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,2};
        int ans = singleNum(arr);
        System.out.println(ans);
    }

    static int singleNum(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
