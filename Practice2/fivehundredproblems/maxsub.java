public class maxsub {
    public static int kadane (int[] arr){
        int maxSofar=0;
        int maxEndingHere=0;
        for(int i: arr){
            maxEndingHere=maxEndingHere+i;
            maxEndingHere=Integer.max(maxEndingHere, 0);
            maxSofar=Integer.max(maxSofar, maxEndingHere);
        }
        return maxSofar;

    }
    public static void main(String[] args) {
    int[] arr={-2,1,-3,4,-1,2,1,-5,4};
    System.out.println("The sum of contiguous subarray with the " + "largest is " + kadane(arr));
    }
}
