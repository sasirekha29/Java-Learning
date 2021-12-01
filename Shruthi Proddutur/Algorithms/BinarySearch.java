package Algorithms;

public class BinarySearch
{
    public static int binarySearch(int[] arr, int left, int right, int target)
    {
        /*
        Our base case will run if the element is not in our array. We determine this by checking if our value for left
        is greater than our value for right. This means that we have exhausted our search. If so, return a value of -1.
         */
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        // Base condition (target value is found)
        if (target == arr[mid]) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }

        // discard all elements in the left search space
        // including the mid element
        if (target > arr[mid]) {
            return binarySearch(arr, mid + 1, right, target);
        }
        // if not present
        return -1;
        }
    public static void main(String[] args)
    {
        int[] arr = { 2, 5, 6, 8, 9, 10 };
        int target = 8;

        int left = 0;
        int right = arr.length - 1;

        int index = binarySearch(arr, left, right, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

}

