package Patterns.Practice2.fivehundredproblems;

public class usingarrayindicesde2 {
    public static int findDuplicate(int[] nums){
        int duplicate=-1;
        for(int i: nums){
            int val=(i<0)? -i:i;
            if(nums[val]>=0){
                nums[val]=-nums[val];
            }
            else{
                duplicate=val;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i] =- nums[i];
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,2};
        System.out.println("The duplicate element is "+findDuplicate(nums));
    }
}
