import java.util.ArrayList;
import java.util.List;

public class intersectionOfarr_optimal {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,6,7,8};
        int[] nums2 = {1,2,4,5,8};
        int n = nums1.length;
        int m = nums2.length;
        int[] result = intersection(nums1, nums2, n, m);
        for(int k : result) {
            System.out.print(k + " ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2, int n, int m) {
        List<Integer> ansList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                ansList.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans = new int[ansList.size()];
        for (int k = 0; k < ansList.size(); k++) {
            ans[k] = ansList.get(k);
        }

        return ans;
    }

}
