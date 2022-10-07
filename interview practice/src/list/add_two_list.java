package list;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.



class add_two_list {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode h = l1;//head node of ans linked list
        ListNode prev = null;//previous node 
        int carry = 0;
        int sum=0;
        while(l1 != null && l2!=null){
            sum = l1.val + l2.val + carry; //adding values of two linked list and carry
            l1.val = sum%10;//storing unit place value in linked list 1
            carry = sum/10;//calcualting carry
            prev = l1;//moving previous forward
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            sum = l1.val + carry;
            l1.val = sum%10;
            carry = sum/10;
            prev = l1;
            l1 = l1.next;
        }
        
        if(l2!=null){//if list 2 is not empty linke list1 to list 2 remaing node
            prev.next = l2;
        }
        while(l2!=null){
            sum = l2.val + carry;
            l2.val = sum%10;
            carry = sum/10;
            prev = l2;
            l2 = l2.next;
        }
        if(carry == 1){//if carry is 1 after processing both lists create a new node with val 1
            ListNode n = new ListNode(1);
            prev.next = n;
            
        }
        return h;
    }
} 
