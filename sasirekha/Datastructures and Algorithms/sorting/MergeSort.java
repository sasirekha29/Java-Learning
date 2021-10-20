package com.learn.java;
class Sorting{
    public void sort(int[] array, int left,int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            sort(array,left,mid);
            sort(array,mid+1,right);
            merge(array,left,mid,right);
        }
    }
    public void merge(int[] array,int left,int mid,int right)
    {
        int[] newarray= new int[array.length];
        int i=left,j=mid+1,k=left;
        while(i<=mid && j<=right)
        {
            if(array[i]<array[j])
            {
                newarray[k]=array[i];
                i++;
            }
            else
            {
                newarray[k]=array[j];
                j++;
            }
            k++;
        }
        while (i<=mid)
        {
            newarray[k]=array[i];
            i++;
            k++;
        }
        while (j<=right)
        {
            newarray[k]=array[j];
            j++;
            k++;
        }
        if (right + 1 - left >= 0) System.arraycopy(newarray, left, array, left, right + 1 - left);

    }
    public void printArray(int[] array){
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
}

public class MergeSort {

    public static void main(String[] args) {
        Sorting merging= new Sorting();
        int[] arr = { 12, 11, 13, 13, 6, 7 };
        System.out.println("Given Array");
        merging.printArray(arr);
        merging.sort(arr,0,arr.length-1);
        System.out.println("sorted Array");
        merging.printArray(arr);
    }
}
