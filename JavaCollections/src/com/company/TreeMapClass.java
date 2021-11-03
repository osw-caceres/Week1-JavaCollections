package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

    public static void printTreeMap(TreeMap<Integer, String> treeMap){
        for (Map.Entry entry: treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - " + "Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        System.out.println("-- TreeMap ------------------------");
        System.out.println("-- Adding elements ------------------");

        treeMap.put(101,"One");
        treeMap.put(105,"Two");
        treeMap.put(103,"Three");
        treeMap.put(102,"Four");
        treeMap.put(104,"Five");

        printTreeMap(treeMap);

        System.out.println("-- Removing elements ------------------");

        treeMap.remove(102);
        treeMap.remove(103);

        printTreeMap(treeMap);

        System.out.println("-- Updating elements ------------------");

        treeMap.replace(101, "Zero");
        treeMap.replace(105, "Six");

        printTreeMap(treeMap);
    }
}
