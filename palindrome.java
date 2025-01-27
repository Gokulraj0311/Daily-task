class Solution {
    public boolean isPalindrome(int x) {
        // Negative no cannot be palindromes
        if (x < 0) {
            return false;
        }
        String original = Integer.toString(x);// Convert number to a string
        String sc = new StringBuilder(original);
        String reversee=sc.reverse().toString();// Reverse the string using StringBuilder
        return original.equals(reversee);// Compare the original string with the reversed string
    }
}
