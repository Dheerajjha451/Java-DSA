package Patterns.Practice2.fivehundredproblems;
import java.util.Arrays;
public class sba2 {
    public static void sort(int[] A){
        int k=0;
        for(int i: A){
            if(i==0){
                A[k++]=0;

            }
        }
        for(int i=k;i<A.length;i++){
            A[k++]=1;
        }
    }
    public static void main(String[] args) {
        int[] A={0,0,1,0,1,1,0};
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
