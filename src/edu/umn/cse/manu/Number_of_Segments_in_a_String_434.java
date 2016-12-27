package edu.umn.cse.manu;

/**
 * Created by maste on 12/26/2016.
 */
public class Number_of_Segments_in_a_String_434 {

    public static int countSegments(String s) {

        int counter = 0;
        char[] chArr = s.toCharArray();

        int i = 0;

        while (i < chArr.length) {
            if (chArr[i] != ' ') {
                counter++;
                while (i < chArr.length && chArr[i] != ' ') {
                    i++;
                }
            } else if (chArr[i] == ' ') {
                while (i < chArr.length && chArr[i] == ' ') {
                    i++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String str = "manu khandelwal";
        System.out.println(countSegments(str));
    }
}
