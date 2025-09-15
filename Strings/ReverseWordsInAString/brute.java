class brute {
    public static void main(String[] args) {
        String st = "TUF is great for interview preparation";
        System.out.println("Before reversing words: ");
        System.out.println(st);
        System.out.println("After reversing words: ");
        System.out.print(result(st));
    }

    static String result(String s) {
        int left = 0;
        int right = s.length() - 1;

        String temp = "";  // current word
        String ans = "";   // final result

        while(left <= right && s.charAt(left) == ' ') {
            left++;
        }

        while(left <= right && s.charAt(right) == ' ') {
            right--;
        }

        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp += ch;
            } else if (ch == ' ') {
                if (!ans.equals("")) {
                    ans = temp + " " + ans;
                } else {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }

        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }
        return ans;
    }
}
