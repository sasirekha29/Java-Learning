package java_practise;

public class Bubblesort {
	public void sort(int arr[])
	
	{
		boolean issorted=true;
		for (int j=0;j<arr.length;j++)
		{
		for(int i=0;i<(arr.length)-i;i++)				
		{
			if(arr[i]>arr[i+1])
			{
				swap(arr,i,i+1);
				issorted=false;
			}
			
		}
		if(issorted)
		{
			display(arr);
			return;
			
		}
	}
	display(arr);
	}
	private void swap(int arr[],int index1, int index2)
	{
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

private void display(int[] arr)
{
	for(int i=0;i<(arr.length);i++)
	{
		System.out.println(arr[i]);
	}
}

}


