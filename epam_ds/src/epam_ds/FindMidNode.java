package epam_ds;

public class FindMidNode {

	node head;
	class node
	{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	public void push(int data)
	{
		node newnode=new node(data);
	newnode.next=head;
	head=newnode;
	
	}
	public void printmid()
	{
		node slow=head;
		node fast=head;
		while(fast!=null &&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.print(slow.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMidNode ll=new FindMidNode();
		ll.push(1);
		ll.push(45);
		ll.push(25);
		ll.push(62);
		ll.push(123);
		ll.push(85);
		ll.push(32);
		ll.push(03);
		ll.push(38);
		ll.printmid();
	}

}
