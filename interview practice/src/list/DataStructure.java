package list;

public class DataStructure {
	class ArrayList{}
	class LinkedList{
		Node head;
		class Node{
			Node next;
			int data;
			
			Node(int d){
				data=d;
				next=null;
			}
		}
		LinkedList(){
			head=null;
		}
		public void new_node(int d) {	
			Node n=new Node(d);
			if(head==null) {
				head=n;
				n.next=null;
				return;
			}
			else {
				Node currentNode=head;
				while(currentNode.next!=null) {
					currentNode=currentNode.next;
				}
				currentNode.next=n;
				return;
			}	
		}
		
		public void PrintList() {
			if(head==null) {
				System.out.println("list is empty");
				return;
			}
			else {
				Node currentNode=head;
				while(currentNode!=null) {
					System.out.println(currentNode.data);
					currentNode=currentNode.next;
				}	
				
			}
		}
		
		public void deleteatindex(int i) {
			if(head==null) {
				System.out.println("list is empty");
				return;
			}
			Node currentNode=head;
			if(i==0) {
				head=currentNode.next;
			}
			else{
				int count=0;
				Node prev=null;
				while(currentNode!=null && count!=i) {
					prev=currentNode;
					currentNode=currentNode.next;
					count++;
				}
				if(currentNode==null) {
					System.out.println("index is greater then given arraylist");
				}
				if(count==i) {
					prev.next=currentNode.next;
				}
			}
		}
	}
		
	class DoubleLinkedList{}
}
