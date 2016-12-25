package edu.umn.cse.manu;

/**
 * Created by maste on 12/24/2016.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7
 */
public class Ugly_Number_263 {

    public static boolean isUgly(int num) {
        //Finishing divisibilty by 2
        if (num != 0) {
            while (num % 2 == 0) {
                num = num / 2;
            }
            //Finishing divisibilty by 3
            while (num % 3 == 0) {
                num = num / 3;
            }
            //Finishing divisibilty by 5
            while (num % 5 == 0) {
                num = num / 5;
            }

            return (num == 1) ? true : false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int input = 14;
        System.out.println(isUgly(input));
    }
}
