package Basic;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        // int no=4;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no=sc.nextInt();
        String type=((no%2)==0)?"even":"odd";
        System.out.println(type);
    }
}
