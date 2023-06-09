package in.ineuron.in;

public class PowerOfTwo {

	    public static boolean isPowerOfTwo(int n) {
	        if (n <= 0) {
	            return false;
	        }
	        
	        // Count the number of set bits in n
	        int count = 0;
	        while (n > 0) {
	            if ((n & 1) == 1) {
	                count++;
	            }
	            n >>= 1;
	        }
	        
	        // If there is only one set bit, n is a power of two
	        return count == 1;
	    }
	    
	    public static void main(String[] args) {
	        int n = 1;
	        System.out.println(isPowerOfTwo(n)); // Output: true
	        
	        n = 16;
	        System.out.println(isPowerOfTwo(n)); // Output: true
	    }
	}


