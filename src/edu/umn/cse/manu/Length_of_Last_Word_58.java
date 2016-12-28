package edu.umn.cse.manu;

/**
 * Created by maste on 12/27/2016.
 */
public class Length_of_Last_Word_58 {
    public static int lengthOfLastWord(String s) {

        String[] temp = s.split(" ");
        if (temp.length > 0)
            return temp[temp.length - 1].length();
        else
            return 0;

    }

    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(lengthOfLastWord(str1));
    }
}
