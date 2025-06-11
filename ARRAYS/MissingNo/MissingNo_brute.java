public class MissingNo_brute {
    public static void main(String[] args) {
        int[] a = {1,2,4,5};    // note array is not starting from 0 . so it is a question of 1 to N not 0 to N.
        int N = 5;
        int result = missingNo(a, N);
        System.out.println(result);
    }

    static int missingNo(int[] a, int N) {

        // Outer loop that runs from 1 to N:
        for (int i = 1; i <= N; i++) {

            // flag variable to check
            //if an element exists
            int flag = 0;

            //Search the element using linear search:
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }

            // check if the element is missing
            //i.e flag == 0:

            if (flag == 0) return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
    
}