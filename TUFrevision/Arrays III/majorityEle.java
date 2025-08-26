public class majorityEle {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    static int majorityElement(int[] arr) {
        int n = arr.length;
        int h = arr.length / 2;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > h) {
                return arr[i];
            }
        }
        return -1;
    }
}
