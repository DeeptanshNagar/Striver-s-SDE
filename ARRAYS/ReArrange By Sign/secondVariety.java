import java.util.ArrayList;
import java.util.Arrays;

public class secondVariety {
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5, 3, 4};
        int[] ans = rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> positive = new ArrayList<>(); 
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        if(positive.size() > negative.size()){
            for (int i = 0; i < negative.size(); i++) {
                arr[2*i] = positive.get(i);
                arr[2*i+1] = negative.get(i);
            }

            int index = negative.size() * 2;
            for (int i = negative.size(); i < positive.size(); i++) {
                arr[index] = positive.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < positive.size(); i++) {
                arr[2*i] = positive.get(i);
                arr[2*i+1] = negative.get(i);
            }

            int index = positive.size() * 2;
            for (int i = positive.size(); i < negative.size(); i++) {
                arr[index] = negative.get(i);
                index++;
            }
        }
        return arr;
    }
}
