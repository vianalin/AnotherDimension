public class ArrayOps {
	public static int sum(int[] arr) { //4a
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int largest(int[] arr) { //4b
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}

	public static int[] sumRows(int[][] matrix) { //4c
		int result[] = new int[matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				result[i] += matrix[i][j];
			}
		}
		return result;
	}

	public static int[] largestInRows(int[][] matrix) { //4d
		int result[] = new int[matrix.length];
		if(matrix.length != 0) {
			for(int i = 0; i < matrix.length; i++) {
				if(matrix[i].length != 0) {
					int max = 0;
					for(int j = 0; j < matrix[i].length; j++) {
						if(matrix[i][j] > max) max = matrix[i][j];
					}
					result[i] += max;
				}
			}	
		}
		return result;
	}
}


