package com.company;

public class pr2 {

    public String startOz (String OZ )
    {
        String result = "";
        if (OZ.startsWith("oz"))
        {
            return "oz";
        }
        else if (OZ.startsWith("o"))
        {
            return "o";
        }
        else if (OZ.startsWith("z", 1))
        {
            return "z";
        } else
            return "";
    }
}
