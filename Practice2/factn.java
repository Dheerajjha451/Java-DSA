package Patterns.Practice2;

public class factn {
public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n; i++){
        f=f*i;

    }
    return f;
}
public static int multiply(int a, int b){
    int product=a*b;
    return product;
}

public static void main(String[] args) {
    System.out.println(factorial(6));
    int a=3;
    int b=5;
    int prod=multiply(a, b);
    System.out.println("a*b= "+prod);

}
}
