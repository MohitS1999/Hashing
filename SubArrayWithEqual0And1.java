/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1
import java.util.*;
import java.lang.*;
import java.io.*;

class SubArrayWithEqual0And1{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int ar[]=new int[n];
			//array contains only 0 and 1
		    for (int i=0;i<n;i++)
		        ar[i]=sc.nextInt();
			//makes all the 0 -> -1
			for (int i=0;i<ar.length;i++)
            		ar[i]=(ar[i]==0) ? -1 : 1;
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
