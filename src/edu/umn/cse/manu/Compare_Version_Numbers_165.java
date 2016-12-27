package edu.umn.cse.manu;

/**
 * Created by maste on 12/26/2016.
 * <p>
 * Note that to split on the literal dot, you need to split it by \\.
 * one backslash for the dot and second for the backslash itself
 */
public class Compare_Version_Numbers_165 {

    public static int compareVersion(String version1, String version2) {

        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int i = 0, j = 0;
        for (i = 0, j = 0; i < ver1.length && j < ver2.length; i++, j++) {
            if (Integer.parseInt(ver1[i]) > Integer.parseInt(ver2[j])) {
                return 1;
            } else if (Integer.parseInt(ver1[i]) < Integer.parseInt(ver2[j])) {
                return -1;
            }
        }

        if (i < ver1.length) { //Length if version one is more
            // Check if any remaining string are only zero
            while (i < ver1.length) {
                if (Integer.parseInt(ver1[i]) > 0) {
                    return 1;
                }
                i++;
            }
        } else if (j < ver2.length) {
            while (j < ver2.length) {
                if (Integer.parseInt(ver2[j]) > 0) {
                    return -1;
                }
                j++;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String str1 = "1.0";
        String str2 = "1";
        System.out.println(compareVersion(str1, str2));
    }
}
