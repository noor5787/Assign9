package in.ineuron.in;

public class MaxElementRecursive {

	    public static void main(String[] args) {
	        int[] arr = {1, 4, 3, -5, -4, 8, 6};
	        int max = findMax(arr, 0);
	        System.out.println("Maximum element: " + max);
	    }

	    public static int findMax(int[] arr, int index) {
	        if (index == arr.length - 1) {
	            return arr[index];  // Base case: when we reach the last element
	        } else {
	            int maxSoFar = findMax(arr, index + 1);  // Recursive call to find the maximum of the rest of the array
	            if (arr[index] > maxSoFar) {
	                return arr[index];  // Compare the current element with the maximum found so far
	            } else {
	                return maxSoFar;
	            }
	        }
	    }
	}


