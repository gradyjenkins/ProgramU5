package AgileProject;

class ProgramU5 
{
	private static int count;
	public Node head;
	
	public ProgramU5(){
		
	}
	
	private static int getCount(){
		return count;
	}
	
	private static void incrementCount() {
		count++;
	}
	
	private static void decrementCount() {
		count--;
	}
	
	public void addNode(double data, double data2)
	{
		
		//initializes node if 1st element
		if(head == null)
		{
			head = new Node(data, data2);
			incrementCount();
			return;
		}
		
		Node temp = new Node(data, data2);
		Node curr = head;
		
		//check for NPE, crawl through list until end then add item at end
		if(curr != null)
		{
			while(curr.getNext() != null)
			{
				curr = curr.getNext();
			}
			
			//last node's next ref is set to current node
			curr.setNext(temp);
		}
		//increment num of elements
		incrementCount();
	}
	
	
	
	
	private class Node 
	{
		//reference to next node
		Node next;
		//data in this node, any type.
		double data;
		double data2;
		
		//constructor
		public Node(double value1, double value2) 
		{
			next = null;
			data = value1;
			data2 = value2;
		}
		
		//self-explanatory
		public Object getData() 
		{
			return data;
		}
		
		//returns the next node
		public Node getNext() 
		{
			return next;
		}
		
		//sets the node's data to be equal to a double value
		public void setData(double value)
		{
			data = value;
		}
		
		//sets the next to be equal to the next node
		public void setNext(Node nextNode)
		{
			next = nextNode;
		}	
	}
}
