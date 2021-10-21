package Algorithms;

class LinearSearch2D {
    public static int linearSearch2D(String[][] haystack, String target) {
        // write code here
        for(int i = 0; i < haystack.length; i++){
            for(int j = 0; j < haystack[i].length; j++){
                if(haystack[i][j].equals(target)){
                    System.out.println(target + " located at [" + i + "][" + j + "].");
                    return 1;
                }
            }
        }
        System.out.println("Couldn't find the " + target + " in the haystack.");
        return -1;
    }
    public static void main(String[] args) {
        String[][] haystack = {{"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"needle", "hay"}, {"needle", "hay"}};
        String target = "needle";
        linearSearch2D(haystack, target);
    }
}
