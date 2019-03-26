package epam_algos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class DesendingWeight {

	 public static void main(String args[] ) throws Exception {
	        
	        Scanner s = new Scanner(System.in);
	        int n,k,a[];
	        n=s.nextInt();
	        k=s.nextInt();
	        a=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=s.nextInt();
	        }
	        LinkedList<Integer> bucket[] = new LinkedList[n];
	 
	        for(int i = 0; i < n; i++)
	        bucket[i] = new LinkedList();
	 
	       for(int i = 0; i < n; i++) {
	       int index = (a[i]%k);
	       bucket[index].add(a[i]);
	       }
	      for(int i = 0; i < n; i++) {
	      Collections.sort(bucket[i]);
	      }
	 
	      int d = 0;
	 
	      for(int i = n-1; i >= 0; i--) {
	        for(int j = 0; j < bucket[i].size(); j++) {
	          a[d++] = bucket[i].get(j);
	        }
	      }
	      for(int i = 0; i < a.length; i++) {
	      System.out.print(a[i] + " ");
	    }
	 
	    }
	}