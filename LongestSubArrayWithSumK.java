/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k/0
import java.util.*;
import java.lang.*;
import java.io.*;

class LongestSubArrayWithSumK{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    HashMap<Integer,Integer> hm=new HashMap<>();
		    int max=0;
		    int sum=0;
		    hm.put(0,0);
		    for (int i=0;i<n;i++){
		        sum+=sc.nextInt();
		        if (hm.containsKey(sum-k)){
		            int x=i-hm.get(sum-k)+1;
		            if (max<x) max=x;
		        }
			// if hashmap doesnt contains then we insert it in hashmap
		        if (!hm.containsKey(sum))
		            hm.put(sum,i+1);
		    }
		    System.out.println(max);
		}
	}
}
