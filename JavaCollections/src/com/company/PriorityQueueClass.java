package com.company;

import java.util.PriorityQueue;

public class PriorityQueueClass {

    public static void printPriorityQueue(PriorityQueue<String> priorityQueue){
        for (String value : priorityQueue) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        System.out.println("-- PriorityQueue ------------------------");
        System.out.println("-- Adding elements ------------------");

        priorityQueue.add("One");
        priorityQueue.add("Two");
        priorityQueue.add("Three");
        priorityQueue.add("Four");
        priorityQueue.add("Five");

        printPriorityQueue(priorityQueue);

        System.out.println("-- Removing elements ------------------");

        priorityQueue.remove();
        priorityQueue.remove();

        printPriorityQueue(priorityQueue);
    }
}
