package AllAboutArrays;


public class Array {
    // Declaration, Initialization, and Assignment of arrays
    public static void main(String[] args) {
        // Declaring a 2d array of float values called floatTwoD
        float[][] floatTwoD;
        // Initializing the 2d array from the last step to an empty 2d array consisting of 4 arrays with 10 elements each
        floatTwoD = new float[4][10];
        // Declaring and initializing an empty 2d array of integers consisting of 15 rows and 8 columns called dataChart
        int[][] dataChart = new int[15][8];
        // Creating a 2D char array called ticTacToe representing the provided tic-tac-toe board using initializer lists. Use the characters 'X', 'O', and ' '.
        char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};
        // When no one is looking, you want to modify the game to where you, 'O', wins the game. Replace the game board so that all X’s are O’s and all O’s are X’s. Do this in one line with initializer lists.
        ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};

    }
}
