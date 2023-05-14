package Patterns.Practice2;

public class ifelse {
    public static void main(String[] args) {
        // int a=1;
        // int b=5;
        // if(a >= b){
        //     System.out.println("A is largest");
        // }
        // else{
        //     System.out.println("B is Largest");
        // }
        int age =16;
        if(age >=18){
            System.out.println("Adult: Drive,Vote");
        }
        if(age>13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
