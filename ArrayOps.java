public class ArrayOps {
	public static int sum(int[] arr) { //4a
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int largest(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}

	public static int[] sumRows(int[][] matrix) {
		int sum = 0;
		int result[] = new int[matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				sum = matrix[i][j];
				result[i] += sum;
			}
		}
		return result;
	}


}