package problem.addtwonumbers;


public class Solution {
    
	  public class ListNode {
	  int val;
	  ListNode next;
	  ListNode() {}
	  ListNode(int val) { this.val = val; }
	  ListNode(int val, ListNode next) { this.val = val; this.next = next; }

         
    public ListNode addTwoNumbers(ListNode inicio1, ListNode inicio2) {
       
    	
int resto = 0;
    	
    	
        
        ListNode aux = new ListNode(0);
    	ListNode lista = aux;
        
    	
    	
    	while(inicio1 != null || inicio2 != null) {
        	
    		int val1 = (inicio1 != null)? inicio1.val: 0;
    		int val2 = (inicio2 != null)? inicio2.val: 0;
        	
        	int soma = val1 + val2 + resto;
        	resto = soma / 10;
        	int numero = soma % 10;
            
            ListNode nodo = new ListNode(numero);
            lista.next = nodo;
        	
        	if(inicio1 != null) {
        		inicio1 = inicio1.next;
        	}
        	
        	if(inicio2 != null) {
        		inicio2 = inicio2.next;
        	}
        	
            lista = lista.next;
    
        		
        }
    
    	if(resto > 0) {
    		ListNode nodo = new ListNode(resto);
    		lista.next = nodo;
    		lista = lista.next;
    	}
    
    
    	return aux.next;
    }
}
}