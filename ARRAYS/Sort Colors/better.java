import java.util.Arrays;

public class better {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortColors(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count0++;
            } else if(arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[i+count0] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[i+count0+count1] = 2;
        }
    }
}
