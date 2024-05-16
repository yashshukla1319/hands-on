public class PalindromWOReverse {
    public static void main(String[] args) {
        String input = "daad";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }

    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
