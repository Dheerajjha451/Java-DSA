package Basic;

import java.util.Scanner;

public class Ftoc {
    public static void main(String[] args) {
        
    
    float temprature;
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the temperature in Fahrenheit");
temprature=sc.nextInt();
temprature=((temprature-32)*5)/9;
System.out.println("Temperature in celsius = "+ temprature);
}
}