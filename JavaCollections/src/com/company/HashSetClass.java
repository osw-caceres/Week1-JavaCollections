package com.company;

import java.util.HashSet;

public class HashSetClass {

    public static void printSet(HashSet<String> set){
        for (String value : set) {
            System.out.println(value);
        }
    }

    public static void updateValue(HashSet<String> set, String oldValue, String newValue){
        for (String value: set) {
            if(value.equals(oldValue)){
                set.remove(value);
                set.add(newValue);
                return;
            }
        }
    }

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        System.out.println("-- HashSet ------------------------");
        System.out.println("-- Adding elements ------------------");

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        printSet(set);

        System.out.println("-- Removing elements ------------------");

        set.remove("Two");
        set.remove("Four");

        printSet(set);

        System.out.println("-- Updating elements ------------------");

        updateValue(set, "Five", "Six");
        updateValue(set, "One", "Zero");

        printSet(set);

    }
}
