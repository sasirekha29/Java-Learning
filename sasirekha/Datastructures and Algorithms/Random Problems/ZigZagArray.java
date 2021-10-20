package java_practise;

public class ZigZagArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr= {4,3,7,8,6,2,1};
		for(int i=1;i<arr.length;i=i+2)
		{
			if (arr[i]<arr[i-1])
			{
				Swap(arr[i],arr[i-1]);
				
			}
			if(arr[i]<arr[i+1])
			{
				Swap(arr[i],arr[i+1]);
				
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
		public static void Swap(int a,int b)
		{
			int temp=a;
			a=b;
			b=temp;
		

	}

}
