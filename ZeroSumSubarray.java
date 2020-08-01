/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/zero-sum-subarrays/0
import java.util.*;
import java.lang.*;
import java.io.*;

class ZeroSumSubarray{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for (int i=0;i<n;i++)
		        ar[i]=sc.nextInt();
		    System.out.println(count(ar,n));
		}
	}
	public static int count(int ar[],int n){
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    int sum=0;
	    int cnt=0;
	    hm.put(0,1);
	    for (int i=0;i<n;i++){
	        sum+=ar[i];
	        if (hm.containsKey(sum))
	            cnt+=hm.get(sum);
	        if (!hm.containsKey(sum))
	            hm.put(sum,1);
	        else
	            hm.put(sum,hm.get(sum)+1);
	    }
	    return cnt;
	}
}