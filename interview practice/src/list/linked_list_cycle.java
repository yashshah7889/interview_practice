package list;

public class linked_list_cycle {
	   public boolean hasCycle(ListNode head) {
	        if(head==null|| head.next==null){ //side case
	            return false;
	        }
	        //get two pointer
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast!=null && fast.next!=null){//if gets nulll means no cycle exist 
	         fast=fast.next.next;//increment or shift by two
	            slow=slow.next;//increment or shift by one
	            if(fast==slow){// if cycle somehow or eventually will meet at some point can try with example.  
	             return true;
	         }  
	        
	        }
	        return false;
	    }
}
