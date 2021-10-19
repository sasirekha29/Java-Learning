package AllAboutArrays;

import java.util.Arrays;

public class ComTransCondLogic {
    public static void main(String[] args) {
        int[][] imageData={{100,90,255,80,70,255,60,50},
                {255,10,5,255,10,5,255,255},
                {255,255,255,0,255,255,255,75},
                {255,60,30,0,30,60,255,255}};

        //First, we want to crop the image down to a 4x6 image, removing the right 2 columns.
        // Declaring and initializing a new 2D array of integers with 4 rows and 6 columns called `newImage`.
        int[][] newImage = new int[4][6];


        //Now that we have your empty image, using the nested **for** loops to copy over the data from the
        // original image to the new image.
        for(int outer = 0; outer < newImage.length; outer++){
            for(int inner = 0; inner < newImage[outer].length; inner++){
                newImage[outer][inner] = imageData[outer][inner];
            }
        }

        System.out.println(Arrays.deepToString(newImage));
        //Now want to decrease the brightness of the new image by 50 units.
        // The way this works is that for every integer in the new 2D array, we will subtract the value by 50.
        // Remember that the value range for the pixel is 0-255, so if the result tries to go below 0, just set it equal to 0.
        for(int outer = 0; outer < newImage.length; outer++){
            for(int inner = 0; inner < newImage[outer].length; inner++){
                if(newImage[outer][inner]-50<0){
                    newImage[outer][inner] = 0;
                } else{
                    newImage[outer][inner] -=50;
                }
            }
        }


        System.out.println(Arrays.deepToString(newImage));
    }
}
