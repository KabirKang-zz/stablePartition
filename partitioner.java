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

	}

	public static void main(String[] args){
		System.out.println("Welcome to the stable partitioner.");		
	}
}