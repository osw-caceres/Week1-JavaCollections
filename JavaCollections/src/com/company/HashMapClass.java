package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void printHashMap(HashMap<Integer, String> hashMap){
        for (Map.Entry entry: hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - " + "Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        System.out.println("-- HashMap ------------------------");
        System.out.println("-- Adding elements ------------------");

        hashMap.put(101,"One");
        hashMap.put(102,"Two");
        hashMap.put(103,"Three");
        hashMap.put(104,"Four");
        hashMap.put(105,"Five");

        printHashMap(hashMap);

        System.out.println("-- Removing elements ------------------");

        hashMap.remove(102);
        hashMap.remove(103);

        printHashMap(hashMap);

        System.out.println("-- Updating elements ------------------");

        hashMap.replace(101, "Zero");
        hashMap.replace(105, "Six");

        printHashMap(hashMap);
    }
}
