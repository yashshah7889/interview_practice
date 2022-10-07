package list;

public class remove_dulpicate_from_sorted_list {
	
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head==null){
	            return null;
	        }
	        ListNode l1=head;
	        while(l1.next!=null){
	            if(l1.val!= l1.next.val){
	                l1=l1.next;
	            }else{
	                l1.next=l1.next.next;
	            }
	        }
	        
	     return head;   
	    }
	
}
