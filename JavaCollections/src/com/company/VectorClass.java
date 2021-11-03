package com.company;

import java.util.Vector;

public class VectorClass {

    public static void printVector(Vector<String> vector){
        for (String value : vector) {
            System.out.println(value);
        }
    }

    public static void updateValue(Vector<String> vector, String oldValue, String newValue){
        if(vector.contains(oldValue)){
            int index = vector.indexOf(oldValue);
            vector.set(index, newValue);
        }
    }

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        System.out.println("-- Vector ------------------------");
        System.out.println("-- Adding elements ------------------");

        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        vector.add("Four");
        vector.add("Five");

        printVector(vector);

        System.out.println("-- Removing elements ------------------");

        vector.remove("Two");
        vector.remove("Four");

        printVector(vector);

        System.out.println("-- Updating elements ------------------");

        updateValue(vector, "Five", "Six");
        updateValue(vector, "One", "Zero");

        printVector(vector);
    }
}
