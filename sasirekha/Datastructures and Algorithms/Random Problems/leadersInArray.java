package java_practise;

public class leadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arr= {16,19,4,7,5,2};
		for(int i=0;i<(arr.length);i++)
			
		{
			int j;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				
					break;
			}
				if(j==arr.length)
				{
					System.out.println(arr[i]);
				}
				
			
		}
		*/
		int[] arr= {16,19,4,7,5,2};
		int max=arr[(arr.length)-1];
		System.out.println(max);
		for(int i=(arr.length)-1;i>0;i--)
		{
			if(arr[i]>max)
			{
				System.out.println(arr[i]);
				max=arr[i];
			}
		}

	}

}

