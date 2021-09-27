package com.company;
import java.util.Scanner;

public class Box {

    public Box(){
        this(1, 1, 1);
    }
    public Box(int height){
        this(height, height, height);
    }
    public Box(int height, int width, int depth) {
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Depth : " + depth);
    }
    public static double area(int x, int y, int z){
        return 2*(x*y) + 2*(y*z) + 2*(z*x);
    }
    public static double volum(int x, int y, int z){
        return x * y * z;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Height : ");
        int height = sc.nextInt();

        System.out.println("Width : ");
        int width = sc.nextInt();

        System.out.println("Depth : ");
        int depth = sc.nextInt();
        sc.close();
        System.out.println("\n");

        System.out.println("Object 1 : \n");
        Box firstObj = new Box();
        System.out.println("\n Object 2 : \n");
        Box secondObj = new Box(height);
        System.out.println("\n Object 3 : \n");
        Box thirdObj = new Box(height, width, depth);

        System.err.println("\n");
        System.out.println("Aria : " + Box.area(width, height, depth));
        System.out.println("Volum : " + Box.volum(width, height, depth));
    }
}
