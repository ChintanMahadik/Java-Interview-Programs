package com.chinz.category.generic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringPool {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3= new String("xyz");

        System.out.println(s1.equals(s3));
    }
}
