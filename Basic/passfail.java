package Basic;

import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        // int marks=67;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks:");
        int marks=sc.nextInt();

        String reportcard=marks >=33?"Pass":"Fail";
        System.out.println(reportcard);
    }
}
