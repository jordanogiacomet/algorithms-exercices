package problem.twosortedarrays;

class Solution {
    public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr3;
        
        arr3 = mergesort(nums1, 0, nums1.length - 1, nums2, 0, nums2.length -1);
        
        
        
        return arr3;
        
    }
    
    public static void main(String[] args) {
		int[] arr1 = {1,3};
		int[] arr2 = {2};
    	
    	System.out.println(findMedianSortedArrays(arr1, arr2));
	}
    
    
    
    public static int[] merge(int[] nums, int inicio, int fim, int meio) {
    	
    	int nL = meio - inicio + 1;
    	int nR = fim - meio;
    	
    	
    	int[] L = new int[nL];
    	int[] R = new int[nR];
    	
    	
    	for(int i = 0; i < nL; i++) {
    		L[i] = nums[i + inicio];
    	}
    	
    	
    	for(int j = 0; j < nR; j++) {
    		R[j] = nums[j + meio + 1];
    	}
    	
    	
    	int i = 0;
    	int j = 0;
    	int k = inicio;
    	
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
    	  return nums;
    	}
    	
    
    public static int[] mergesort(int[] nums1, int inicio1, int fim1, int[] nums2, int inicio2, int fim2) {
    	if(inicio1 >= fim1) {
    		return null;
    	}
    	
    	if(inicio2 >= fim2) {
    		return null;
    	}
    	
    	int meio1 = (inicio1 + fim1) / 2;
    	int meio2 = (inicio2 + fim2) / 2;
    	
    	mergesort(nums1, inicio1, meio1, nums2, inicio2, meio2);
    	mergesort(nums1, meio1 + 1, fim1, nums2, meio2 + 1, fim2);
    	
    	
    	
    	int total = nums1.length + nums2.length;
    	int[] numsTotal = new int[total];
    	int meioTotal = (0 + total) / 2;
    	
    	return merge(numsTotal, 0, total-1, meioTotal);//Reponsável por juntar e ordenar.
    	
   
    }
    
    
    
    
    
    
    
    
    
}