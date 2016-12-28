package edu.umn.cse.manu;

/**
 * Created by maste on 12/27/2016.
 */
public class Valid_Palindrome_125 {
    public static boolean isPalindrome(String s) {

        char[] temp = new char[s.length()];
        int tempLength = 0;
        int i, j;

        char[] strArr = s.toCharArray();
        for (char c : strArr) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                temp[tempLength++] = Character.toLowerCase(c);
            }
        }

        for (i = 0, j = tempLength - 1; i <= j; i++, j--) {
            if (temp[i] != temp[j]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str1));
    }
}
