package in.ineuron.in;

public class ProductArrayElements {

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        long product = getProductOfArrayElements(arr);
	        System.out.println("Product: " + product);
	    }

	    public static long getProductOfArrayElements(int[] arr) {
	        long product = 1;
	        for (int i = 0; i < arr.length; i++) {
	            product *= arr[i];
	        }
	        return product;
	    }
	}


