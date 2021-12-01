package Algorithms;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target)
        {
            //int n = arr.length;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == target)
                    return i;
            }
            return -1;
        }

        public static void main(String args[])
        {
            int arr[] = { 2, 3, 4, 10, 40 };
            int target = 10;
            int result = linearSearch(arr, target);
            if(result == -1){
                System.out.println("Element is not present in the array");
            }
            else{
                System.out.println("Element is present at index " + result);

            }
        }
}
