package com.company;

public class pr7 {
    private static final String str=" ";
    void pattern()
    {
        int num= 0;
        for (int row = 0; row <= 7; row++) {

            for (int column = 1; column <= 7 - row; column++) {
                System.out.printf("%4s", str);
            }

            for (int column = 0; column <= row; column++) {
                num = (int) Math.pow(2, column);

                System.out.printf("%4d", num);
            }

            for (int column = row - 1; column >= 0; column--) {
                num = (int) Math.pow(2, column);

                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
