public class MissingNo_Optimal {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};    
        int N = 5;
        int result = missingNo(arr, N);
        System.out.println(result);
    }

    static int missingNo(int[] arr, int N) {
        int sum = N * (N+1)/2;
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray = sumOfArray + arr[i];
        }
        return sum - sumOfArray;
    }
}
