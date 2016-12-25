package edu.umn.cse.manu;

/**
 * Created by maste on 12/24/2016.
 */
public class Palindrome_Number_9 {

    public static boolean isPalindrome(int x) {
        int length = 0;
        int temp = x;
        int mid = 0;
        int start = 0, end = 0;

        if (x < 0) {
            return false;
        }

        while (temp != 0) {
            length++;
            temp = temp / 10;
        }

        if (length % 2 == 0) { //even
            mid = length / 2;
            start = mid;
            end = mid + 1;
        } else {
            mid = (length + 1) / 2;
            start = mid - 1;
            end = mid + 1;
        }


        while (start >= 1 && end <= length) {
            int firstNum = x / (int) Math.pow(10, length - start);
            int secondNum = x % (int) Math.pow(10, length - end + 1);
            if (firstNum % 10 != secondNum / (int) Math.pow(10, length - end)) {
                return false;
            }
            start--;
            end++;
        }
        return true;

    }

    public static void main(String[] args) {
        int input = 1221;
        System.out.println(isPalindrome(input));
    }
}
