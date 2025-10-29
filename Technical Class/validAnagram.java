import java.util.*;

public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Boolean b = validAnagram(s, t);
        System.out.println(b);
    }
    static boolean validAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String st = new String(arr);

        char[] arr1 = t.toCharArray();
        Arrays.sort(arr1);
        String st1 = new String(arr1);

        if(st.equals(st1)) {
            return true;
        }

        return false;
    }
}
// 0(nlogN)