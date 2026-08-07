// import java.util.ArrayList;

// public class main {

//     static void printS(int ind, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {

//         if (ind == n) {
//             if (s == sum) {
//                 for (int x : ds) {
//                     System.out.print(x + " ");
//                 }
//                 System.out.println();
//             }
//             return;
//         }

//         // Pick
//         ds.add(arr[ind]);
//         s = s + arr[ind];

//         printS(ind + 1, ds, s, sum, arr, n);

//         // Backtrack
//         s = s - arr[ind];
//         ds.remove(ds.size() - 1);

//         // Not Pick
//         printS(ind + 1, ds, s, sum, arr, n);
//     }

//     public static void main(String[] args) {

//         int[] arr = {1, 2, 1};
//         int n = arr.length;
//         int sum = 2;

//         ArrayList<Integer> ds = new ArrayList<>();

//         printS(0, ds, 0, sum, arr, n);
//     }
// }

// ****************************

// if you want to print only first subsequence

// import java.util.*;

// public class main {

//     static boolean printS(int ind, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {

//         if (ind == n) {
//             if (s == sum) {
//                 for (int x : ds) {
//                     System.out.print(x + " ");
//                 }
//                 System.out.println();
// 				return true;
//             } else {
// 				return false;
// 			}
//         }

//         // Pick
//         ds.add(arr[ind]);
//         s = s + arr[ind];

//         if(printS(ind + 1, ds, s, sum, arr, n) == true) {
// 			return true;
// 		}

//         // Backtrack
//         s = s - arr[ind];
//         ds.remove(ds.size() - 1);

//         // Not Pick
//         if(printS(ind + 1, ds, s, sum, arr, n)) {
// 			return true;
// 		}

// 		return false;
//     }

//     public static void main(String[] args) {

//         int[] arr = {1, 2, 1};
//         int n = arr.length;
//         int sum = 2;

//         ArrayList<Integer> ds = new ArrayList<>();

//         printS(0, ds, 0, sum, arr, n);
//     }
// }



// ************************************

// if u want to return the count of total no. of possible subsequence

import java.util.*;

public class main {

    static int printS(int ind, int s, int sum, int[] arr, int n) {
		// condition not satisfied
		// strictly done if array contains positives only
		if(s > sum) return 0;
        if (ind == n) {
			// condition satisfied
            if (s == sum) {
				return 1;
            } else {
				// condition doesn't satisfied
				return 0;
			}
        }

        // Pick
        s = s + arr[ind];

        int left = printS(ind + 1, s, sum, arr, n);

        // Backtrack
        s = s - arr[ind];

        // Not Pick
        int right = printS(ind + 1, s, sum, arr, n);

		return left + right;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int n = arr.length;
        int sum = 2;

        ArrayList<Integer> ds = new ArrayList<>();

        System.out.println(printS(0, 0, sum, arr, n));
    }
}


// what we study today
// directly printing subsequence - 1st code snippet
// printing first occured subsequence - return true/false and avoid further recursion calls if you get there already
// counting total no. of subsequence possible - 3rd code snippet, return 1 when base case hits true otherwise false (add all Functions and return)