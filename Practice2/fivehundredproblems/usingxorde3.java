package Patterns.Practice2.fivehundredproblems;

import Basic.reverse;

public abstract class usingxorde3 {
    public static int findDuplicate(int[] nums){
        int xor=0;
        for(int value:nums){
            xor ^= value;

        }
        for(int i=1;i<nums.length-1;i++){
            xor ^= i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4};
        System.out.println("The duplicate element is "+findDuplicate(nums));
    }
}
