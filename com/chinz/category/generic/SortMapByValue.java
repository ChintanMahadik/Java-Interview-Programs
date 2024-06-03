package com.chinz.category.generic;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Horror", "Annabella");
        map.put("Comedy", "Mr.Bean");
        map.put("Thriller", "Fast & Furious");
        map.put("Mystery", "Gone Girl");

        System.out.println("Sorted Based on Keys");
        Map<String, String> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);

        System.out.println("Sorted based on values");
        List<Map.Entry<String, String>> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add(entry);
        }
        Collections.sort(list, Map.Entry.comparingByValue());

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(linkedHashMap);
    }
}
