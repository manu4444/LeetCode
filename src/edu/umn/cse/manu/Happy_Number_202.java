package edu.umn.cse.manu;

/**
 * Created by maste on 12/24/2016.
 */
public class Happy_Number_202 {

    public static boolean isHappy(int n) {
        int tempSum = 100;
        int tempNum = n;
        int i = 0;
        while (tempSum != 1 && i < 10) {
            tempSum = 0;
            i++;
            while (tempNum != 0) {
                //int temp = tempNum%10;
                tempSum += (tempNum % 10) * (tempNum % 10);
                tempNum = tempNum / 10;
            }
            tempNum = tempSum;
        }
        return (tempSum == 1) ? true : false;
    }

    public static void main(String[] args) {
        int input = 19;
        System.out.println(isHappy(input));
    }
}
