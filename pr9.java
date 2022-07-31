package com.company;

import java.util.Arrays;

public class pr9 {

    void Sudoku(int a1[][],int a2[][])
    {
        int temp1 = 0;
        for (int i = 0; i < 9; i++)
        {
            Arrays.sort(a1[i]);
            for (int j = 0; j < 9; j++)
            {
                if (a1[i][j] == j + 1)
                {
                    continue;
                } else
                {
                    temp1 = 1;
                    break;
                }
            }
            if (temp1 == 1)
            {
                break;
            }
        }
        int temp2 = 0;
        for (int i = 0; i < 9; i++)
        {
            Arrays.sort(a2[i]);
            for (int j = 0; j < 9; j++)
            {
                if (a2[i][j] == j + 1)
                {
                    continue;
                } else
                {
                    temp2 = 1;
                    break;
                }
            }
            if (temp1 == 1)
            {
                break;
            }
        }
        if(temp1==1 || temp2==1)
        {
            System.out.println("NOT A CORRECT SOLUTION");
        }
        else
        {
            System.out.println("CORRECT SOLUTION");
        }
    }
}
