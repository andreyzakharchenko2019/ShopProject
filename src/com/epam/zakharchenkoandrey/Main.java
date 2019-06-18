package com.epam.zakharchenkoandrey;

public class Main {

    public static void main(String[] args) {
        // write your code here

        java.util.Queue<Client> queue = new java.util.LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(new Client(i));
        }
        System.out.println(queue);
        for (int i = 0; i < 10; i++) {
            queue.remove().buy();
            //System.out.println(queue);
        }
    }
}
