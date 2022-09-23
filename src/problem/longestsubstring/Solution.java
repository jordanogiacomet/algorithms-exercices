package problem.longestsubstring;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<String> map = new HashSet<String>();
        int cont = 0;
        int flag = 0;
        
        
        for(int i = 0; i < s.length(); i++) {
        	if(flag == 1) {
        		i--;
        		flag = 0;
        	}
        	
        	
        	
        	if(!map.contains(Character.toString(s.charAt(i)))) {
        	
                map.add(Character.toString(s.charAt(i)));
        	}else {
        	  if(map.size()>cont) {
        		  cont = map.size();
            	  
        	  }
        	  flag = 1; 
        	  map.clear();
        		
        	};
        }
		return cont;
        
        
    }
}