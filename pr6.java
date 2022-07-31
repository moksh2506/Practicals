package com.company;

import java.util.Arrays;

public class pr6 {

    pr6 (String[] word, String target)
    {
        int p = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals(target)) {
                p++;
            }
        }
        p= word.length - p;
        int place =0;
        String [] str = new String[p];
        for(int j=0;j<word.length;j++)
        {
            if(!word[j].equals(target))
            {
                str[place]=word[j];
                place++;
            }
        }
        System.out.println(Arrays.toString(str));

    }
}
