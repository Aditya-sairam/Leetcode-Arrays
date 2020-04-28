class Reorder {
    public void reorderList(ListNode A) {
        
		// if head is null or head next is null 
		if(A == null) return ;
		
		ListNode root = A; 
		ListNode slow = root;
		ListNode fast = slow.next;
		while(fast!= null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// second list from middle elemenet
		ListNode middleNode = slow.next;
		
		// seperate first half from seond half, once reach to middle discard remaining element by assning to null.
		slow.next = null;
		
		// reverse seocond half list
		ListNode r = reverseList(middleNode);
		
		ListNode temp = root;
		// now merge 
		while(temp!= null && r!= null) {
			ListNode next1 = temp.next;
			temp.next = r;
			ListNode rNext = r.next;
			r.next = next1;
			r = rNext;
			temp = next1;
		}
		
		return ;
    
    
    }
	
	 public  ListNode reverseList(ListNode root) {
		ListNode prev = null;

		ListNode curr = root;

		ListNode next = null;

		while (curr != null) {
			// System.out.println(curr.val);
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}
}
