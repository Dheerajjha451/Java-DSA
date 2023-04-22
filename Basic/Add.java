package Basic;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter two integers to calculate their sum:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("sum of entered integers="+z);

        
    }
}
