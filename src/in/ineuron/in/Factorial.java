package in.ineuron.in;
import java.util.Scanner;
public class Factorial {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int N = scanner.nextInt();
	        scanner.close();
	        
	        int factorial = calculateFactorial(N);
	        System.out.println("Factorial of " + N + " is: " + factorial);
	    }
	    
	    public static int calculateFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        
	        int factorial = 1;
	        for (int i = 2; i <= n; i++) {
	            factorial *= i;
	        }
	        
	        return factorial;
	    }
	}


