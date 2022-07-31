package com.company;
import java.util.Scanner;
public class pr4 {
    Scanner s = new Scanner(System.in);
    pr4(){}
    pr4(int c)
    {
        int a[] = new int[c];
        System.out.println("Enter array:");
        for(int i=0;i<c;i++)
        {
            a[i]=s.nextInt();
        }
        int b=0;
        for(int i=0;i<c-2;i++)
        {
            if(a[i] == 1 && a[i+1] == 2 && a[i+2]==3)
            {
                b++;
            }
        }
        if(b==0)
        {
            System.out.println(false);
        }
        else
            System.out.println(true);
    }
}
