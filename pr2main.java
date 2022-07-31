package com.company;

import java.util.Scanner;
public class pr2main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        pr2 a = new pr2();
        System.out.println("Enter the string:");
        String S = s.nextLine();
        a.startOz(S);
    }
}
