package Patterns.Practice2.fivehundredproblems;
import java.util.Arrays;
public class findpairsorting {
    public static void findPair(int[] nums,int target){
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        while(low<high){
if(nums[low]+nums[high]==target){
    System.out.printf("Pair found (%d, %d)",nums[low],nums[high]);
return;
}
if(nums[low]+nums[high]<target){
    low++;
}
else{
    high--;
}
        }
        System.out.println("No pair found");
    
    }
    public static void main(String[] args) {
        int[] nums={8,7,2,5,3,1};
        int target=10;
        findPair(nums, target);
    }
}
