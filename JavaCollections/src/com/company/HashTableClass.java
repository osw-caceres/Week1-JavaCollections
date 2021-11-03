package com.company;

import java.util.Hashtable;
import java.util.Map;

public class HashTableClass {

    public static void printHashTable(Hashtable<Integer, String> hashTable){
        for (Map.Entry entry: hashTable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - " + "Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Hashtable<Integer, String> hashTable = new Hashtable<>();

        System.out.println("-- HashTable ------------------------");
        System.out.println("-- Adding elements ------------------");

        hashTable.put(101,"One");
        hashTable.put(102,"Two");
        hashTable.put(103,"Three");
        hashTable.put(104,"Four");
        hashTable.put(105,"Five");

        printHashTable(hashTable);

        System.out.println("-- Removing elements ------------------");

        hashTable.remove(102);
        hashTable.remove(103);

        printHashTable(hashTable);

        System.out.println("-- Updating elements ------------------");

        hashTable.replace(101, "Zero");
        hashTable.replace(105, "Six");

        printHashTable(hashTable);
    }
}
