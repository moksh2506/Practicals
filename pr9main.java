package com.company;

import java.util.Scanner;

/*ID:21CE099
Name: Moksh Patel

AIM: The problem is to check whether a given Sudoku solution is correct.
 */
public class pr9main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Sudoku Solution:");
        int a1[][] = new int[9][9];
        int a2[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a1[i][j] = s.nextInt();
                a2[i][j] = a1[i][j];
            }
        }
        pr9 x = new pr9();
        x.Sudoku(a1, a2);
    }
}
