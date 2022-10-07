package problem.twosortedarrays;

class Solution {
   

   
   
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
    	
    
    public static void mergesort(int[] nums, int inicio, int fim) {
    	if(inicio >= fim) {
    		return;
    	}
    	
    
    	
    	int meio = (inicio + fim) / 2;
    	
    	
    	mergesort(nums, inicio, meio);
    	mergesort(nums, meio + 1, fim);
    	
    	
    	
 
    	merge(nums, 0, fim, meio);//Reponsável por juntar e ordenar.
    	
   
    }
    
    
    
    
    
    
}