package epam_ds;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
Stack<Integer> front=new Stack();
Stack<Integer> rear=new Stack();
int Q=sc.nextInt();
while(Q>0)
{
	int type,x;
	type=sc.nextInt();
	if(type==1)
	{
		x=sc.nextInt();
		rear.push(x);
	}
	else 
	{
		if(front.empty())
		{
			while(!rear.empty())
			{
				front.push(rear.peek());
				rear.pop();
			}
		}
		if(!front.empty())
		{
			if(type==2)
			{
				front.pop();
				
			}
			if(type==2)
			{
				System.out.println(front.peek());
			}
		}
	}
	Q--;
}
	}

}
