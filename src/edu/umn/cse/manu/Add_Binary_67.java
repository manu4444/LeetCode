package edu.umn.cse.manu;

/**
 * Created by maste on 12/27/2016.
 */
public class Add_Binary_67 {

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i, j;
        int carry = 0;
        //boolean markCarry = false;
        for (i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
            if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (carry == 1) {
                    sb.insert(0, '1');
                } else {
                    sb.insert(0, '0');
                }
                carry = 1;
            } else {
                if (a.charAt(i) == '1' || b.charAt(j) == '1') {
                    if (carry == 1) {
                        sb.insert(0, '0');
                        carry = 1;
                    } else {
                        sb.insert(0, '1');
                        carry = 0;
                    }
                } else {
                    if (carry == 1) {
                        sb.insert(0, '1');
                    } else {
                        sb.insert(0, '0');
                    }
                    carry = 0;
                }
            }
        }

        if (i >= 0) {
            while (i >= 0) {
                if (carry == 1) {
                    if (a.charAt(i) == '1') {
                        sb.insert(0, '0');
                        carry = 1;
                    } else {
                        sb.insert(0, '1');
                        carry = 0;
                    }
                } else {
                    sb.insert(0, a.charAt(i));
                }
                i--;
            }
        }

        if (j >= 0) {
            while (j >= 0) {
                if (carry == 1) {
                    if (b.charAt(j) == '1') {
                        sb.insert(0, '0');
                        carry = 1;
                    } else {
                        sb.insert(0, '1');
                        carry = 0;
                    }
                } else {
                    sb.insert(0, b.charAt(j));
                }
                j--;
            }
        }

        if (carry == 1) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        System.out.println(addBinary(str1, str2));
    }
}
