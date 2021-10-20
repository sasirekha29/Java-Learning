package java_practise;

public class Insertionsort {
	public void sort(int[] arr)
	{
		for (int i=1;i<arr.length;i++)
		{
			var current=arr[i];
			var j=i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		display(arr);
	}

private void display(int[] arr)
{
	for(int i=0;i<(arr.length);i++)
	{
		System.out.println(arr[i]);
	}
}

}
