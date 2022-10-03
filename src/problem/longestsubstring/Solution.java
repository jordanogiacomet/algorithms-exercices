package problem.longestsubstring;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int i = 0, j = 0, ans = 0;
        
        while(i < s.length()) {
        	if(!map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), i);
        		i++;
        	} else {
        		map.remove(s.charAt(j));
        		j++;
        	}
        
            ans = Math.max(ans, i-j);
        }
        
        return ans;
        
    }
}