package list;

class Merge {
	public ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {
		ListNode ml=null;
		ListNode head = null;
		
		ListNode new_node;
		while(temp1!=null && temp2!=null) {
			if(temp1.val<temp2.val) {
				new_node=new ListNode(temp1.val,null);
				temp1=temp1.next;
			}else {
				new_node=new ListNode(temp2.val,null);
				temp2=temp2.next;
			}
			if(ml==null) {
				ml=new_node;
				head=ml;
			}else {
				ListNode n=ml;
                while(n.next!=null){
                    n=n.next;
                }
                n.next=new_node;
			}
		}
        if(temp1==null){
            while(temp2!=null){
              new_node=new ListNode(temp2.val,null);
				temp2=temp2.next;  
                if(ml==null) {
				ml=new_node;
				head=ml;
			}else {
				ListNode n=ml;
                while(n.next!=null){
                    n=n.next;
                }
                n.next=new_node;
			}
            }
        }else{
              while(temp1!=null){
              new_node=new ListNode(temp1.val,null);
				temp1=temp1.next;  
                if(ml==null) {
				ml=new_node;
				head=ml;
			}else {
				ListNode n=ml;
                while(n.next!=null){
                    n=n.next;
                }
                n.next=new_node;
			}
            }
        }
		return head;
        
    }
}