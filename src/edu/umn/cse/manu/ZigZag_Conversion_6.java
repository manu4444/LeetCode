package edu.umn.cse.manu;

/**
 * Created by maste on 12/28/2016.
 */
public class ZigZag_Conversion_6 {

    public static String convert(String s, int numRows) {

        StringBuilder sb = new StringBuilder();
        int masterCounter = 0;
        int step = (numRows - 1) * 2;
        if (step == 0) {
            return s;
        }
        //int midPoint = (numRows-1)/2;

        while (masterCounter < numRows) {

            int i = masterCounter;
            int counter = 1;
            if (i == numRows - 1 || i == 0) {
                while (i < s.length()) {
                    sb.append(s.charAt(i));
                    i += step;
                }
            } else
                while (i < s.length()) {
                    sb.append(s.charAt(i));
                    if (counter % 2 == 1) {
                        i = i + (step - 2 * masterCounter);
                    } else {
                        i = i + 2 * masterCounter;
                    }
                    counter++;
                }
            masterCounter++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "A";
        int rowLen = 1;
        System.out.println(convert(str1, rowLen));
    }
}
