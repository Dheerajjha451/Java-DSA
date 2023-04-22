package Basic;

import java.util.Scanner;

public class Swap {
    // public static void main(String[] args) {
    //     int x,y,temp;
    //     System.out.println("Enter x and y");
    //     Scanner sc=new Scanner(System.in);
    //     x=sc.nextInt();
    //     y=sc.nextInt();
    //     System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
    //     temp =x;
    //     x=y;
    //     y=temp;
    //     System.out.println("After Swapping\nx = "+x+"\ny = "+y);
    // }
// }

public static void main(String[] args) {
    int x,y;
    System.out.println("Enter x and y :");
    Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
    y=sc.nextInt();
    System.out.println("before Swapping\nx = "+x+"\ny = "+y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After Swapping\nx = "+x+"\ny = "+y);
}
}