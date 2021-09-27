package _Basic;
import java.util.Scanner;

public class box {
  
  public box(){
    this(1, 1, 1);
  }

  public box(int height){
    this(height, height, height);
  }

  public box(int height, int width, int depth) {
    System.out.println(height);
    System.out.println(width);
    System.out.println(depth);
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
      box firstObj = new box();

      System.out.println("Object 2 : \n");
      box secondObj = new box(height);

      System.out.println("Object 3 : \n");
      box thirdObj = new box(height, width, depth);
    }
}