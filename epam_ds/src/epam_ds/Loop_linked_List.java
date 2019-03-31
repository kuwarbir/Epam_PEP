package epam_ds;

public class Loop_linked_List
{
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
 public int detectloop()
 {
	node slow=head;
	node fast=head;
	while(slow!=null && fast!=null && fast.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast)
		{
		 System.out.println("found");
		 return 1;
		}
	}
	return 0;
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop_linked_List ll=new Loop_linked_List();
		ll.push(4);
		ll.push(12);
		ll.push(10);
		ll.push(15);
		ll.head.next.next.next.next=ll.head;
		int ans= ll.detectloop(); 
		System.out.println(ans);
		
	}

}
