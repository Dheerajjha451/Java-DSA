import java.util.Arrays;
class Main{
    public static void findMaximumProduct(int[] A){
        int n=A.length;
        if(n<2){
            return;

        }
        Arrays.sort(A);
        if ((A[0] * A[1]) > (A[n - 1] * A[n - 2])) {
            System.out.print("Pair is (" + A[0] + ',' + A[1] + ')');
        }
        else {
            System.out.print("Pair is (" + A[n - 1] + ',' + A[n - 2] + ')');
        }
    }
 
    public static void main (String[] args)
    {
        int[] A = { -10, -3, 5, 6, -20 };
 
        findMaximumProduct(A);
    }
    }
