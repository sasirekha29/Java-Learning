package SearchingAlgo;
import java.util.Arrays;
public class BinarySearch {
	 int searchelement(int[] arr,int l,int n,int search_number)
	{
		if (n>=l)
		{
			int middle=l+(n-l)/2;
			if (arr[middle]==search_number)
			{
				return middle;
			}
			if (arr[middle]>search_number)
			{
				return searchelement(arr,l,middle-1,search_number);
			}
			if(arr[middle]<search_number)
			{
				return searchelement(arr,middle+1,n,search_number);
				
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 3, 4, 10, 40 };
		int n=arr.length;
		int search_number=10;
		BinarySearch br=new BinarySearch();
		int result=br.searchelement(arr,0,n-1,search_number);
		if (result==-1)
		{
			System.out.print("The element is not found");
		}
		else
		{
			System.out.print("The element is found at "+result);
		}
	}

}
