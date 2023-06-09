package in.ineuron.in;
import java.util.Scanner;
public class ExponentCalculator {



	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number: ");
	        int number = input.nextInt();

	        System.out.print("Enter the power: ");
	        int power = input.nextInt();

	        long result = calculateExponent(number, power);
	        System.out.println("Result: " + result);

	        input.close();
	    }

	    private static long calculateExponent(int number, int power) {
	        if (power == 0) {
	            return 1;
	        } else if (power == 1) {
	            return number;
	        } else {
	            long result = number;
	            for (int i = 2; i <= power; i++) {
	                result *= number;
	            }
	            return result;
	        }
	    }
	}


