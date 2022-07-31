package com.company;

import java.util.Scanner;

/*ID:21CE099
Name: Moksh Patel

AIM: Given 2 strings, a and b, return the number of the positions where they contain the
     same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
     and "az" substrings appear in the same place in both strings.
 */
public class pr5main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String a1 = sc.nextLine();
        System.out.println("Enter 2nd String:");
        String a2 = sc.nextLine();
        pr5 s = new pr5(a1, a2);
        sc.close();
    }
}
