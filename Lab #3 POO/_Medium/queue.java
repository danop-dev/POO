package _Medium;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static char[] display;
    private int max_li;
    private int count;
    private Queue<Integer> queue = new LinkedList<Integer>();

    public queue(){
        this.max_li = Integer.MAX_VALUE;
        this.queue = new LinkedList<Integer>();
    }

    public queue(int max_li){
        this.max_li = max_li;
        this.queue = new LinkedList<Integer>();
    }

    public void isEmpty(){
        if (this.count == 0) {
            System.out.println("Queue nu are nici un element.");    
        } else {
            System.out.println("Queue : " + this.count);
        }
    }

    public void isFull(){
        if (this.max_li >= Integer.MAX_VALUE) {
            System.out.println("ERROR : impossible");
        } else {
            System.out.println("Nr. elem. : " + this.count);
            System.out.println("Max elem : " + this.max_li);
        }
    }

    public void display(){
        if(this.count == 0){
            System.out.println("Queue nu are elemente.");
        } else {
            System.out.println(this.queue);
        }
    }

    public void add_el(int el){
        if(this.count >= this.max_li){
            System.out.println("Error: Max Queue");
        } else {
            this.queue.add(el);
            this.count++;
            System.out.println(el + " este adaugat");
        }
    }

    public void remove_el(){
        if(this.count >= this.max_li){
            System.out.println("Error: Queue nu are elemente");
        } else {
            this.queue.remove();
            this.count--;
        }
    }  
}