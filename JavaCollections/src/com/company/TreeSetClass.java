package com.company;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetClass {

    public static void printTreeSet(TreeSet<String> treeSet){
        for (String value : treeSet) {
            System.out.println(value);
        }
    }

    public static void updateValue(TreeSet<String> treeSet, String oldValue, String newValue){
        for (String value: treeSet) {
            if(value.equals(oldValue)){
                treeSet.remove(value);
                treeSet.add(newValue);
                return;
            }
        }
    }

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        System.out.println("-- TreeSet ------------------------");
        System.out.println("-- Adding elements ------------------");

        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");

        printTreeSet(treeSet);

        System.out.println("-- Removing elements ------------------");

        treeSet.remove("Two");
        treeSet.remove("Four");

        printTreeSet(treeSet);

        System.out.println("-- Updating elements ------------------");

        updateValue(treeSet, "Five", "Six");
        updateValue(treeSet, "One", "Zero");

        printTreeSet(treeSet);
    }
}
