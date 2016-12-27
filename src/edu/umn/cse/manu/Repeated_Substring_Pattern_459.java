package edu.umn.cse.manu;

/**
 * Created by master on 12/26/2016.
 */
public class Repeated_Substring_Pattern_459 {

    public static boolean repeatedSubstringPattern(String str) {

        int strLength = str.length();
        StringBuilder tempStr = new StringBuilder();
        for (int i = 1; i <= strLength / 2; i++) {
            if (strLength % i == 0) {
                tempStr.setLength(0);
                String subString = str.substring(0, i);
                for (int j = 0; j < strLength / i; j++) {
                    tempStr.append(subString);
                }
                if (str.equals(tempStr.toString())) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(repeatedSubstringPattern(str));
    }
}
