import java.util.ArrayList;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4,5,6,7};
        int[] arr2 = {3,3,4,4,5,8};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> result = findIntersection(arr1, arr2, n, m);
        System.out.println("Intersection of arr1 and arr2 is ");
        for (int val: result){
            System.out.print(val+" ");
        }
    }
    static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] visi = new int[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j] && visi[j]==0){
                    ans.add(arr1[i]);
                    visi[j] = 1;
                    break;
                } else if (arr2[j] > arr1[i]) {
                    break;
                }
            }
        }
        return ans;
    }

    // as per leetcode 
    
    // public int[] findIntersection(int[] arr1, int[] arr2) {
    
    //     int n = nums1.length;
    //     int m = nums2.length;
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     int[] visi = new int[arr2.length];
    //     for (int i = 0; i < arr1.length; i++) {
    //         for (int j = 0; j < arr2.length; j++) {
    //             if(arr1[i] == arr2[j] && visi[j]==0){
    //                 ans.add(arr1[i]);
    //                 visi[j] = 1;
    //                 break;
    //             } else if (arr2[j] > arr1[i]) {
    //                 break;
    //             }
    //         }
    //     }
    //     int[] result = new int[ans.size()];
    //     for (int i = 0; i < ans.size(); i++) {
    //         result[i] = ans.get(i);
    //     }

    //     return result;
    // }
}
