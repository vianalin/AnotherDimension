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

	public static int sum(int[][] arr) { //4e
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static int sumCol(int[][] matrix, int col) {
		int sum = 0;
		for(int i = 0; i < matrix.length; i++) {
			sum += matrix[i][col];
		}
		return sum;
	}

	public static int[] sumCols(int[][] matrix) {
		int[] result = new int[matrix[0].length];
		for(int i = 0; i < matrix[0].length; i++) {
			result[i] = sumCol(matrix, i);
		}
		return result;
	}

	//public static boolean isRowMagic(int[][] matrix) {

	//}

	//public static boolean isColMagic(int[][] matrix) {

	//}

	//public static boolean isLocationMagic(int[][] matrix, int row, int col) {

	//}

}


