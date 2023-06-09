package in.ineuron.in;
import java.util.Scanner;
public class ArithmeticProgression {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the first term (a): ");
	        int a = scanner.nextInt();
	        
	        System.out.print("Enter the common difference (d): ");
	        int d = scanner.nextInt();
	        
	        System.out.print("Enter the value of N: ");
	        int N = scanner.nextInt();
	        
	        int nthTerm = a + (N - 1) * d;
	        System.out.println("The " + N + "th term of the series is: " + nthTerm);
	    }
	}


