package Algorithms;

public class LinearSearch1 {
        public static int linearAllergyFoodSearch(String[] arr, String allergy)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (allergy.equals(arr[i])) {
                    System.out.print("I found " + allergy + " listed as ingredient " + (i + 1) + ".");
                    return 1;
                }
            }
            System.out.print("Element is not present in ingredients");
            return -1;
        }
        public static void main(String[] args)
        {
            String[] arr = { "wheat", "honey", "sugar", "eggs", "nuts" };
            String allergy = "nuts";
            // method call
            linearAllergyFoodSearch(arr, allergy);
        }
}
