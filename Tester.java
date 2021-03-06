public class Tester { 
	public static ArrayOps arrayOps = new ArrayOps();
	public static Demo demo = new Demo();

    public static void main(String[] args) {
    	System.out.println(ArrayOps.sum(new int[] {1, 3, 4})); //4a
    	System.out.println(ArrayOps.largest(new int[] {1, 2, 9, 1, 7})); //4b
    	System.out.println(Demo.arrToString(ArrayOps.sumRows(new int[][] {{1}, {2,3}}))); // 4c
    	System.out.println(Demo.arrToString(ArrayOps.largestInRows(new int[][] {{1}, {2,3}, {}}))); //4d
    	System.out.println(ArrayOps.sum(new int[][] {{1}, {2,3}})); //4e
    	System.out.println(Demo.arrToString(ArrayOps.sumCols(new int[][] {{1, 2}, {2,3}}))); //5a
    	System.out.println(ArrayOps.isRowMagic(new int[][] {{1, 2}, {2,3}})); //5b
    	System.out.println(ArrayOps.isRowMagic(new int[][] {{2, 2}, {0, 4}})); //5b
    	System.out.println(ArrayOps.isColMagic(new int[][] {{2, 3}, {2, 1}, {2, 2}})); //5c
    	System.out.println(ArrayOps.isLocationMagic(new int[][]{{2, 4, 2}, {2, 2, 2}}, 0, 1)); //5d
    	System.out.println(ArrayOps.isLocationMagic(new int[][]{{2, 4, 2}, {2, 2, 2}}, 1, 1)); //5d
    }
}
