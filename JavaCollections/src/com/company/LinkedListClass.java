package com.company;

import java.util.LinkedList;

public class LinkedListClass {

    public static void printLinkedList(LinkedList<String> linkedList){
        for (String value : linkedList) {
            System.out.println(value);
        }
    }

    public static void updateValue(LinkedList<String> linkedList, String oldValue, String newValue){
        if(linkedList.contains(oldValue)){
            int index = linkedList.indexOf(oldValue);
            linkedList.set(index, newValue);
        }
    }

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("-- LinkedList ------------------------");
        System.out.println("-- Adding elements ------------------");

        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add("Five");

        printLinkedList(linkedList);

        System.out.println("-- Removing elements ------------------");

        linkedList.remove("Two");
        linkedList.remove("Four");

        printLinkedList(linkedList);

        System.out.println("-- Updating elements ------------------");

        updateValue(linkedList, "Five", "Six");
        updateValue(linkedList, "One", "Zero");

        printLinkedList(linkedList);
    }
}
