package Chapter2;

import java.util.HashSet;

public class LinkedList {

	ListNode head;
	private int length = 0;

	public LinkedList() {
		length = 0;
	}

	public ListNode getHead() {
		return this.head;
	}

	public void insertAtBeginning(ListNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	public void insertAtEnd(ListNode node) {
		if (head == null) {
			head = node;
		} else {
			ListNode p, q;
			for (p = head; (q = p.getNext()) != null; p = q)
				;
			p.setNext(node);
		}
		length++;
	}

	public void insert(int data, int position) {
		if (position < 0) {
			position = 0;
		} else if (position > length) {
			position = length;
		}

		if (head == null) {
			head = new ListNode(data);
		}
		if (position == 0) {
			ListNode temp = new ListNode(data);
			temp.setNext(head);
			head = temp;
		} else {
			ListNode tmp = head;
			for (int i = 1; i < position; i++) {
				tmp = tmp.getNext();
			}
			ListNode n = new ListNode(data);
			n.setNext(tmp.getNext());
			tmp.setNext(n);
		}
		length++;
	}

	public void removeFromBeginning() {
		if (head != null) {
			ListNode node = head;
			head = node.getNext();
			node.setNext(null);
			length--;
		}
	}

	public void removeFromEnd() {
		if (head != null) {
			if (head.getNext() == null) {
				head = null;
			} else {
				ListNode node = head;
				for (int i = 1; i < length - 1; i++) {
					node = node.getNext();
				}
				node.setNext(null);
			}
			length--;
		}
	}
	
	public void removeNodeData(int data){
		if(head == null) {
			return;
		}
		if(head.getData() == data){
			head = head.getNext();
			length--;
		}
		else{
			ListNode p=head, q=null;
			//while((q = p.getNext()) != null){}
			for(int i=1;i<length;i++){
				if(data == p.getNext().getData()){
					p.setNext(p.getNext().getNext());
					return;
				} else {
					p=p.getNext();
				}
			}
			length--;
		}
	}
	
	public void removeNodePosition(int position){
		if(position < 0){
			position = 0;
		} if(position == 0){
			head = head.getNext();
			length--;
			return;
		} if(position > length){
			position = length;
		} else {
			ListNode temp = head;
			for(int i = 1; i<position;i++){
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			length--;
		}
	}
	
	public void removeDuplicates(){
		HashSet<Integer> unique = new HashSet<Integer>();
		ListNode n = head;
		ListNode previous = null;
		while(n != null){
			if(unique.contains(n.getData())){
				previous.setNext(n.getNext());
			} else {
				unique.add(n.getData());
				previous = n;
			}
			n = n.getNext();
		}
	}
	
	public void pelindrome()
	{
		
	}
}
