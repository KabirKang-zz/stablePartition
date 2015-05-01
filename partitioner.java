package partitionStable;

/*
	1. We need two lists, a less than, and a greater than/equal than list.
	2. These lists need to be combined at the end, unless there were no nodes less than x. 
		In this case, we need to return the beginning of the second list.
	3. We should start out all references as null, so that we can check if beforeStart or beforeEnd
		have been defined.
	4. We need a reference to next because we are going to be moving each n in position, either
		to the end of the before list, or to the end of the after list. We should nullify it's next.

*/

public class partitioner {

	public static LinkedListNode partition(LinkedListNode n, int x){
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;


		while(n!=null){
			LinkedListNode next = n.next;
			n.next = null;
			if(n.data<x){
				if(beforeStart == null){
					beforeStart = n;
					beforeEnd = beforeStart;
				}
				else{
					beforeEnd.next = n;
					beforeEnd = n;
				}
			}
			else{
				if(afterStart == null){
					afterStart = n;
					afterEnd = afterStart;
				}
				else{
					afterEnd.next = n;
					afterEnd = n;
				}
			}
			n = next;
		}

		if(beforeStart == null){
			return afterStart;
		}

		beforeEnd.next = afterStart;
		
		return beforeStart;
	}

	public static void main(String[] args){
		System.out.println("Welcome to the stable partitioner.");		
	}
}