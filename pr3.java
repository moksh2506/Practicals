package com.company;
/*ID:21CE099
Name: Moksh Patel

AIM: Given two non-negative int values, return true if they have the same last digit, such
     as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
     10 is 7.
 */
import java.util.Scanner;

public class pr3
{
    public static void main(String[] args) {
        int x,y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        x= s.nextInt();
        System.out.println("Enter Second number:");
        y=s.nextInt();
        int a=0;
        int b=0;
        while(x!=0)
        {
            a=x%10;
            x=x/10;
        }
        while(y!=0)
        {
            b=y%10;
            y=y/10;
        }
        if (a == b)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
//        System.out.println("This program is prepared by 21CE099_MokshPatel.");
    }
}
