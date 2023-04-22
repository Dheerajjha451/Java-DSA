package Basic;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int a;
        float b;
        String s;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.nextLine();
        System.out.println("You entered string "+s);
        System.out.println("Enter a Number");
        a=sc.nextInt();
        System.out.println("You entered integer "+a);
        System.out.println("Enter a float");
        b=sc.nextFloat();
        System.out.println("You entered float"+b);
        
    }
}
