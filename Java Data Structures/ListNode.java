
public class ListNode implements Linkable
{
	private Comparable listNodeValue;
	private ListNode nextListNode;

	public ListNode()   //constructor
	{
		listNodeValue = null;
		nextListNode = null;
	}

	public ListNode(Comparable value, ListNode next)	//explicit constructor
	{
		listNodeValue=value;
		nextListNode=next;
	}

	public Comparable getValue()			//returns value of listnode
	{
		return listNodeValue;
	}

	public ListNode getNext()				//returns the next listnode in the order
	{
	   return nextListNode;
	}

	public void setValue(Comparable value)	//sets the value of a listnode
	{
		listNodeValue = value;
	}

	public void setNext(Linkable next)		//sets the next listnode's value (parameter is linkable as per linkable interface)
	{
		nextListNode = (ListNode)next;
	}
}
