package Patterns.Practice2.fivehundredproblems.Hashmap;
import java.util.Map;
import java.util.HashMap;
public class maxlensubarray {
    public static void findMaxLenSubarray(int[] nums, int s){
        Map<Integer, Integer>map =new HashMap<>();
        map.put(0, -1);
        int target=0;
        int len=0;
        int ending_index=-1;
        for(int i=0;i<nums.length;i++){
            target+=nums[i];
            map.putIfAbsent(target, i);
            if(map.containsKey(target -s)&& len<i - map.get(target -s)){
                len = i - map.get(target -s);
                ending_index = i;
            }
        }
 
        // print the subarray
        System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int target = 8;
 
        findMaxLenSubarray(nums, target);
    }
}