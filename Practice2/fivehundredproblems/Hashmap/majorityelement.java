package Practice2.fivehundredproblems.Hashmap;
import java.util.HashMap;
import java.util.Map;
public class majorityelement {
    public static int findMajorityElement (int[] nums){
        Map<Integer, Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
 
        // return the element if its count is more than `n/2`
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() > nums.length/2) {
                return entry.getKey();
            }
        }
 
        // no majority element is present
        return -1;
    }
 
    public static void main (String[] args)
    {
        // assumption: valid input (majority element is present)
        int[] nums = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
 
        int result = findMajorityElement(nums);
        if (result != -1) {
            System.out.println("The majority element is " + result);
        }
        else {
            System.out.println("The majority element doesn't exist");
        }
    }
}
