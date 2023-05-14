package Patterns.Practice2.fivehundredproblems;

// Sort binary array in linear time

// Given a binary array, sort it in linear time and constant space. The output should print all zeroes, followed by all ones.
import java.util.Arrays;
public class sortbinaryarray {
    public static void sort(int[] A){
        int zeros=0;
        for(int value: A){
            if(value ==0){
                zeros++;
            }
        }
        int k=0;
        while(zeros-- !=0){
            A[k++]=0;

        }
        while(k<A.length){
            A[k++]=1;

        }
    }
    public static void main(String[] args) {
        int[] A={0,0,1,0,1,1,0,1,0,0};
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
