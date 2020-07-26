/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k/0/
import java.util.*;
import java.lang.*;
import java.io.*;

class LongestSubArrayWithSumDivisibleByk{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    HashMap<Integer,Integer> hm=new HashMap<>();
		    hm.put(0,0);
		    int cumsum=0;
		    int max=0;
		    for (int i=0;i<n;i++){
		        int x=sc.nextInt();
		        cumsum+=x;
				//this is remainder is valid for both -ve and +ve number.
		        int mod=(cumsum%k+k)%k;
		        if (hm.containsKey(mod))
		        {
		            int check=i-hm.get(mod)+1;
		            if (max<check) max=check;
		        }
		        if (!hm.containsKey(mod))
		            hm.put(mod,i+1);
		    }
		    System.out.println(max);
		}
	}
}