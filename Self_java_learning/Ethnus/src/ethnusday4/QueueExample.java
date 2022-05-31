package ethnusday4;
//package com.ethnus.javabatch10to12;
import java.util.*;
public class QueueExample {

    public static void main(String[] args) {
    /*Create an object of the queue*/
    Queue<String> queue=new LinkedList<>();
    /*Add the elements to the queue*/
    queue.add("Ramesh");
    queue.add("Vignesh");
    queue.add("Rakesh");
    /*Print the queue*/
    System.out.println(queue);
    /*Removing element*/
    System.out.println("Removing element:"+queue.remove());
    /*Create another object of the queue*/
    Queue<String> queue1=new LinkedList<>();
    /*Added all the elements in the queue*/
    queue1.add("Vijay");
    queue1.add("Ajay");
    queue1.add("Raghav");
    /*Use the addAll() method*/
    queue.addAll(queue1);
    /*Print the queue*/
    System.out.println(queue);
    /*Use the removeAll() method*/
    queue.removeAll(queue1);
    /*Print the queue*/
    System.out.println(queue);
    /*Head element of the 1st queue*/
    System.out.println("Head element of the 1st queue:"+queue.peek());
    /*Head element of the 2nd queue*/
    System.out.println("HEad element of the 2nd queue:"+queue1.peek());
    System.out.println("Removing 2nd element in 1st queue:"+queue.remove());
    System.out.println("Removing 3rd element in 1st queue:"+queue.remove());
    /*Head element of the 1st queue*/
    /*System.out.println("HEad element of the 1st queue:"+queue.element());
    System.out.println("Head element of the 1st queue:"+queue.peek());*/
    System.out.println("Queue elements:"+queue);
    System.out.println("Poll method:"+queue.poll());
    System.out.println("Queue:"+queue);





    }
}
