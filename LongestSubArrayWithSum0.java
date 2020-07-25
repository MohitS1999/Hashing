/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1/
import java.util.*;
import java.lang.*;
import java.io.*;

class LongestSubArrayWithSum0{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for (int i=0;i<n;i++)
		        ar[i]=sc.nextInt();
		    System.out.println(maxLen(ar,n));
		}
	}
	//max length of longest sub array
	public static int maxLen(int[] arr, int N)
    {
        // Your code here
        for (int i=0;i<N;i++)
            arr[i]=(arr[i]==0) ? -1 : 1 ;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,0);
        int max=0;
        int sum=0;
        for (int i=0;i<N;i++){
            sum+=arr[i];
            if (hm.containsKey(sum))
            {
                int check=i-hm.get(sum)+1;
                if (max<check) max=check;
            }else
                hm.put(sum,i+1);
        }
        return max;
    }
}
