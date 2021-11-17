package oracleMessageDescriptionProblem;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(70);
        q.add(30);
        q.add(80);
        q.add(85);


        q.remove();
        q.remove();
        q.remove();
//Coz queue works on FIFO

        System.out.println(q.toString());
    }
}
