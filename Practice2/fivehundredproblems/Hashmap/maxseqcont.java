package Practice2.fivehundredproblems.Hashmap;

public class maxseqcont {
    public static void findLongestSequence(int[] A,int k){
        int left=0;
        int count=0;
        int window=0;
        int leftIndex=0;
        for(int right=0;right<A.length;right++){
            if(A[right]==0){
                count++;
            }
            while(count>k){
                if(A[left]==0){
                    count--;
                }
                left++;
            }
            if(right-left+1>window){
                window=right-left+1;
                leftIndex=left;
            }
        }
        if(window==0){
            return;
        }
        System.out.println("The longest sequence has length " + window +
        " from index " + leftIndex + " to " + (leftIndex + window - 1));
}

public static void main(String[] args)
{
int[] A = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
int k = 2;

findLongestSequence(A, k);
}
}