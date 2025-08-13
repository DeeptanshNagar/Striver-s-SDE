import java.util.Arrays;

public class sort012better {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArr(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count0++;
            }
            if(arr[i] == 1) {
                count1++;
            }
            if(arr[i] == 2) {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++){
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++){
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++){
            arr[i] = 2;
        }
    }
}
