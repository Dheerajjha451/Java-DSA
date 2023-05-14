package Patterns.Practice2;

public class Bintodec {
    public static void Bintodec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit+(int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+myNum+"="+decNum);
    }
    public static void main(String[] args) {
        Bintodec(1111);
    }
}
