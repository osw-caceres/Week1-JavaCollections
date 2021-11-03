package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

    public static void printLinkedSet(LinkedHashSet<String> linkedSet){
        for (String value : linkedSet) {
            System.out.println(value);
        }
    }

    public static void updateValue(LinkedHashSet<String> linkedSet, String oldValue, String newValue){
        for (String value: linkedSet) {
            if(value.equals(oldValue)){
                linkedSet.remove(value);
                linkedSet.add(newValue);
                return;
            }
        }
    }

    public static void main(String[] args) {

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

        System.out.println("-- LinkedHashSet ------------------------");
        System.out.println("-- Adding elements ------------------");

        linkedSet.add("One");
        linkedSet.add("Two");
        linkedSet.add("Three");
        linkedSet.add("Four");
        linkedSet.add("Five");

        printLinkedSet(linkedSet);

        System.out.println("-- Removing elements ------------------");

        linkedSet.remove("Two");
        linkedSet.remove("Four");

        printLinkedSet(linkedSet);

        System.out.println("-- Updating elements ------------------");

        updateValue(linkedSet, "Five", "Six");
        updateValue(linkedSet, "One", "Zero");

        printLinkedSet(linkedSet);
    }
}
