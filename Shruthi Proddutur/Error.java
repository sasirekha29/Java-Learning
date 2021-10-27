import java.util.Scanner;

public class Error {
    static int arithmeticDivision(int a , int b){
        int i = a/b;
        return i;
    }
    static int exception(int a, int b){
        int res = 0;
        try {
            res = arithmeticDivision(a, b);
        } catch (ArithmeticException e){
            System.out.println("Enter the value without 0.");
            System.err.println("Arithmetic exception: " + e.getMessage());
            //e.printStackTrace();
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = 0; n < 4; n++) {
            System.out.println("Enter the a: ");
            int a = sc.nextInt();
            System.out.println("Enter the b: ");
            int b = sc.nextInt();

            try {
                int i = exception(a, b);
                System.out.println(i);

            } finally {
                System.out.println("Bye bye!!");
            }
        }
    }
}
