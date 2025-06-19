public class better {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,5,6,6,6,7,7,7}; 
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;

        //galat
        // int i = 0; 
        // int j = i+1; 
        // while(i < j) {
        //     if(arr[i] == arr[j]) {
        //         j++;
        //     } else if (arr[i] != arr[j]) {
        //         arr[j] = arr[i+1];
        //         i++;
        //         j++;
        //     }
        // }
        // return -1;
    }
}
