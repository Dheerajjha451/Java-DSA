package Patterns.Practice2;

import Basic.variables;

public class ternary {
    public static void main(String[] args) {
        int n=4;
        String type=((n%2)==0)? "Even":"Odd";
        System.out.println(type);
    }
}
