package problem.twosortedarrays;

class Solution {
	     
	   
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	
    	int nL = nums1.length;
    	int nR = nums2.length;
    	
    	
    	int[] nums = new int[nL+nR];
    
    	
    	
    	int[] L = new int[nL];
    	int[] R = new int[nR];
    	
    	
    	for(int i = 0; i < nL; i++) {
    		L[i] = nums1[i];
    	}
    	
    	
    	for(int j = 0; j < nR; j++) {
    		R[j] = nums2[j];
    	}
    	
    	
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	
    	while(i < nL && j < nR){
    	    if(L[i] <= R[j]){
    	      nums[k] = L[i];
    	      i = i + 1;
    	    } else {
    	      nums[k] = R[j];
    	      j = j + 1;
    	    }
    	    k = k + 1;
    	    }


    	  while(i < nL){
    	    nums[k] = L[i];
    	    i = i + 1;
    	    k = k + 1;
    	  }

    	  while(j < nR){
    		nums[k] = R[j];
    	    j = j + 1;
    	    k = k + 1;
    	  }
    		  
    	  
    	  if(nums.length % 2 == 0){
              return (double)(nums[(nums.length - 1)/2] + nums[((nums.length- 1)/2 + 1)])/2;
          }
          else{
              return nums[nums.length/2];
          }
    	  
    	 
    	}
 
}