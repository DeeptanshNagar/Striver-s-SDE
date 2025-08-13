import java.util.ArrayList;
import java.util.Arrays;

public class sort012brute {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArr(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
