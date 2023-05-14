package Patterns.Practice2.fivehundredproblems;
import java.util.Arrays;

import Patterns.Practice2.swap;
import strings.stringbasic;
public class quicksortsba3 {
    public static void sort(int[] A){
        int pivot=1;
        int j=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<pivot){
                swap(A,i,j);
                j++;
            }
        }
    }
    public static void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public static void main(String[] args) {
        int[] A={0,0,1,0,1,1,0,1,0,0};
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
