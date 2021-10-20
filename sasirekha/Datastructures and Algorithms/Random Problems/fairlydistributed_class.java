package java_practise;

import java.util.Arrays;

public class fairlydistributed_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,1,9,40,7,9,20};
		int m=5;
		int n=arr.length;
		int min= Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<=n-m;i++)
		{
			int left=arr[i];
			int right=arr[i+m-1];
			int diff=right-left;
		
		if (diff<min)
		{
			min=diff;
		}
		}
		System.out.println(min);

	}

}
