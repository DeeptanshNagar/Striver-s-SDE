public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String text1 = "hello world";
        String broken1 = "ad";
        System.out.println(sol.canBeTypedWords(text1, broken1));

        String text2 = "leet code";
        String broken2 = "lt";
        System.out.println(sol.canBeTypedWords(text2, broken2));

        String text3 = "leet code";
        String broken3 = "e";
        System.out.println(sol.canBeTypedWords(text3, broken3));
    }

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" "); // ["hello", "world"]
        int count = 0;

        for (String word : words) {
            boolean canType = true;
            for (char ch : brokenLetters.toCharArray()) { // ['a','d']
                if (word.indexOf(ch) != -1) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }
        return count;
    }
}
