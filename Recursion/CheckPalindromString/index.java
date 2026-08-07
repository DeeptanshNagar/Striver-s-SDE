public class index {
	public static void main(String[] args) {
		String str = "nitin";
		System.out.println(isPalin(str, 0, str.length() - 1));
	}
	static boolean isPalin(String s, int start, int end) 
	{
		if(start >= end) {
			return true;
		}

		if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

		return isPalin(s, start + 1, end - 1);

		// return s.charAt(start) == s.charAt(end) && isPalin(s, start + 1, end - 1);
	}
}