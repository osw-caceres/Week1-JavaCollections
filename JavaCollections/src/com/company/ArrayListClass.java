package com.company;

import java.util.ArrayList;

public class ArrayListClass {

    public static void printArrayList(ArrayList<String> arrayList){
        for (String value : arrayList) {
            System.out.println(value);
        }
    }

    public static void updateValue(ArrayList<String> arrayList, String oldValue, String newValue){
        if(arrayList.contains(oldValue)){
            int index = arrayList.indexOf(oldValue);
            arrayList.set(index, newValue);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("-- ArrayList ------------------------");
        System.out.println("-- Adding elements ------------------");

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");

        printArrayList(arrayList);

        System.out.println("-- Removing elements ------------------");

        arrayList.remove("Two");
        arrayList.remove("Four");

        printArrayList(arrayList);

        System.out.println("-- Updating elements ------------------");

        updateValue(arrayList, "Five", "Six");
        updateValue(arrayList, "One", "Zero");

        printArrayList(arrayList);
    }
}
