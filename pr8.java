package com.company;

import java.util.Scanner;
    public class pr8
    {
        public static void main (String[] args)
        {
            Scanner s = new Scanner (System.in);

            String[] answers = { "D","B","D","C","C","D","A","E","A","D"};

            String[][] list = new String[8][10];

            System.out.println("Enter the Students MCQ options: " );

            for (int i =0;i<list.length;i++)
            {
                int count =0;
                for (int j=0;j<list[i].length;j++)
                {
                    list[i][j] = s.next();

                    if(list[i][j].equalsIgnoreCase(answers[j]))
                        count++;
                }
                System.out.println("Student's " + i+1 + " correct answers are " + count);
            }
        }
    }