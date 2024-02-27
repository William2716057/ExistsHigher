public class ExistsANumberHigher {
    public static boolean existsHigher(int[] arr, int n) {
	//if array is empty return false
        if (arr.length == 0) {
            return false;
        }
	//iterate through array
        for (int num : arr) {
	//If any number is greater than return true
            if (num >= n) {
                return true;
            }
        }
	//if no number is found greater than return false
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 15, 22, 4};
        int[] arr2 = {1, 2, 3, 6, 5};
	int[] arr3 = {};
	//display results
        System.out.println("existsHigher arr1: " + existsHigher(arr1, 10));
	System.out.println("existsHigher arr2: " + existsHigher(arr2, 10));
	System.out.println("existsHigher arr3: " + existsHigher(arr3, 10));
    }
}
