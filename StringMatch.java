public class StringMatch {
    public static int bruteForceMatch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) break;
            }
            if (j == m) return i; // match found at index i
        }
        return -1; // no match found
    }

    public static void main(String[] args) {
        String text = "hello world";
        String pattern = "world";
        int index = bruteForceMatch(text, pattern);
        System.out.println("Pattern found at index: " + index);
    }
}