package edu.umn.cse.manu;

/**
 * Created by maste on 12/24/2016.
 */
public class Add_Digits_258 {
    public static int addDigits(int num) {
        int tempSum = 100;
        int tempNum = num;
        while (tempSum >= 10) {
            tempSum = 0;
            while (tempNum / 10 != 0) {
                tempSum += tempNum % 10;
                if (tempSum >= 10) {
                    tempSum = tempSum / 10 + tempSum % 10;
                }
                tempNum = tempNum / 10;
            }
            tempSum += tempNum;
            tempNum = tempSum;
        }
        return tempSum;
    }

    public static void main(String[] args) {
        int input = 19;
        System.out.println(addDigits(input));
    }
}
