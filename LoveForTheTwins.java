/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/love-for-the-twins/0
import java.util.*;
import java.lang.*;
import java.io.*;

class LoveForTheTwins{
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while (t-->0){
		    int n=Integer.parseInt(br.readLine().trim());
		    int ar[]=new int[n];
		    String[] str=br.readLine().split(" ");
		    for (int i=0;i<n;i++){
		        ar[i]=Integer.parseInt(str[i]);
		    }
		    HashMap<Integer,Integer> hm=new HashMap<>();
		    for (int i=0;i<n;i++){
		        int a=ar[i];
		        if (hm.containsKey(a))
		            hm.put(a,hm.get(a)+1);
		        else
		            hm.put(a,1);
		    }
		    //cnt the value
		    int cnt=0;
		    for (Map.Entry<Integer,Integer> entry:hm.entrySet()){
		        cnt+=entry.getValue()/2;
		    }
		    System.out.println(cnt*2);
		}
	}
}
