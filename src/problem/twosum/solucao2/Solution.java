package problem.twosum.solucao2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashNums = new HashMap<>();
        
        
        for(int i = 0; i < nums.length; i++){
               int complement = target - nums[i];
            
            
               if(hashNums.containsKey(complement)){
                   return new int[]{hashNums.get(complement), i};
               }
            
                hashNums.put(nums[i], i);
            
           }
       
        throw new IllegalArgumentException("Not found");
        
    }
   
     
}


// O(n)