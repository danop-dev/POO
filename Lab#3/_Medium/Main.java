package _Medium;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        queue qu1 = new queue();

        Scanner sc = new Scanner(System.in);
        System.out.println("Max li : ");
        int max_li = sc.nextInt();

        queue qu2 = new queue(max_li);

        
        ((queue) qu1).add_el(10);
        ((queue) qu1).add_el(20);
        ((queue) qu1).add_el(30);
        ((queue) qu1).add_el(40);
        // qu1.add(20);

        System.out.println("Queue 1 : ");
        ((queue) qu1).display();
        
        ((queue) qu1).remove_el();
        ((queue) qu1).display();


        System.out.println("\n Queue 2 : ");
        ((queue) qu2).add_el(50);
        ((queue) qu2).add_el(60);
        ((queue) qu2).add_el(70);
        ((queue) qu2).add_el(80);
        ((queue) qu2).display();

        ((queue) qu2).isEmpty();
        ((queue) qu2).isFull();        
    }
}
