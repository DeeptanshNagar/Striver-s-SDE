
import java.util.ArrayList;
import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5, 2,-4};
        int[] ans = rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] rearrangeArray(int[] arr){
        int n = arr.length;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                arr[i] = positive.get(posIndex++);
            } else {
                arr[i] = negative.get(negIndex++);
            }
        }
        return arr;
    }
}
