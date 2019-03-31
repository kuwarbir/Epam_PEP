package epam_ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
Scanner sc=new Scanner(System.in);
int arrsize=sc.nextInt();
String arr[]= new String[arrsize];
for(int i=0;i<arrsize;i++ )
{
	arr[i]=br.readLine();
}
int qsize=sc.nextInt();
String q[]=new String[qsize];
for(int i=0;i<qsize;i++ )
{
	q[i]=br.readLine();
}
int count=0;
for(int i=0;i<arrsize;i++)
{
	for(int j=0;j<qsize;j++)
	{
		if(arr[i].equals(q[j]))
		{		

			count++;
		}
	}
}
System.out.println(count);

	}

}
