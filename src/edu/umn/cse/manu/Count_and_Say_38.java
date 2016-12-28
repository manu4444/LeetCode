package edu.umn.cse.manu;

/**
 * Created by maste on 12/27/2016.
 */
public class Count_and_Say_38 {
    public static String countAndSay(int n) {

        char[] start = {'1'};
        char[] c;
        int ji = 3;
        if (n == 1) {
            return "1";
        }

        if (n == 2) {
            return "11";
        } else {
            while (ji <= n) {
                StringBuilder sb = new StringBuilder();
                c = start;

                for (int i = 0; i < c.length - 1; i++) {
                    int counter = 0;
                    while (i < c.length - 1 && c[i] == c[i + 1]) {
                        counter++;
                        i++;
                    }
                    sb.append(counter).append(c[i]);
                }
                if (sb.charAt(sb.length() - 1) != c[c.length - 1]) {
                    sb.append('1').append(c[c.length - 1]);
                }
                start = sb.toString().toCharArray();
                ji++;
            }
        }
        return start.toString();


    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(countAndSay(n));
    }
}
