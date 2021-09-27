package _Advanced;
import java.util.Scanner;

public class geometry {    

    public static double area(int x, int y, int z){
        return 2*(x*y) + 2*(y*z) + 2*(z*x);
    }

    public static double volum(int x, int y, int z){
        return x * y * z;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x : ");
        int x = sc.nextInt();
        
        System.out.println("y : ");
        int y = sc.nextInt();

        System.out.println("z : ");
        int z = sc.nextInt();
        sc.close();

        System.out.println("Aria : " + geometry.area(x, y, z));
        System.out.println("Volum : " + geometry.volum(x, y, z));
    }

}
