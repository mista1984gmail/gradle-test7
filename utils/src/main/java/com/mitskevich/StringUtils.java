package com.mitskevich;

public class StringUtils {
    public static boolean isPositiveNumber(String str){
        if (str == null)
            return false;
        if (str.isEmpty())
            return false;
        if (str.matches("[-+]?\\d+")){
            return Integer.parseInt(str) > 0;
        }
        return false;
    }
}
