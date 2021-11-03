package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {

    public static void printLinkedHashMap(LinkedHashMap<Integer, String> linkedHashMap){
        for (Map.Entry entry: linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - " + "Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        System.out.println("-- LinkedHashMap ------------------------");
        System.out.println("-- Adding elements ------------------");

        linkedHashMap.put(101,"One");
        linkedHashMap.put(102,"Two");
        linkedHashMap.put(103,"Three");
        linkedHashMap.put(104,"Four");
        linkedHashMap.put(105,"Five");

        printLinkedHashMap(linkedHashMap);

        System.out.println("-- Removing elements ------------------");

        linkedHashMap.remove(102);
        linkedHashMap.remove(103);

        printLinkedHashMap(linkedHashMap);

        System.out.println("-- Updating elements ------------------");

        linkedHashMap.replace(101, "Zero");
        linkedHashMap.replace(105, "Six");

        printLinkedHashMap(linkedHashMap);
    }
}
