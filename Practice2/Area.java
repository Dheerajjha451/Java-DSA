package Patterns.Practice2;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float rad =sc.nextFloat();
        float area=(float) (3.14* rad*rad);
        System.out.println(area);
    }
}
