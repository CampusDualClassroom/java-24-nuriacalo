package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> newQueue = new LinkedList<>();
        newQueue.add("Smith");
        newQueue.add("Montessori");
        newQueue.add("Peralta");
        newQueue.add("House");

        return newQueue;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        for (String cola : queue) {
            System.out.println(cola);
        }
        queue.clear();
    }

    public static void main(String[] args) {
        Queue<String> myQueue = createQueue();
        printAndEmptyQueue(myQueue);
    }

}
