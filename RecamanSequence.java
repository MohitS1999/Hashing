/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/recamans-sequence/0
import java.util.*;
import java.lang.*;
import java.io.*;

class RecamanSequence{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
		    HashSet<Integer> set=new HashSet<Integer>();
		    int n=sc.nextInt();
		    int ar[]=new int[n+1];
		    ar[0]=0;
		    for (int i=1;i<n;i++){
		        int k=(ar[i-1]-i);
		        if ((k>0)&&(!set.contains(k)))
		        {
		            ar[i]=ar[i-1]-i;
		            set.add(ar[i]);
		        }
		        else{
		            ar[i]=ar[i-1]+i;
		            set.add(ar[i]);
		        }
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(ar[i]+" ");
		    }
		    System.out.println();
		}
	}
}