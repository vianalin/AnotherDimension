public class Tester { 
	public static ArrayOps arrayOps = new ArrayOps();
	public static Demo demo = new Demo();

    public static void main(String[] args) {
    	System.out.println(ArrayOps.sum(new int[] {1, 3, 4})); //4a
    	System.out.println(ArrayOps.largest(new int[] {1, 2, 9, 1, 7})); //4b
    	System.out.println(Demo.arrToString(ArrayOps.sumRows(new int[][] {{1}, {2,3}}))); // 4c
    	System.out.println(Demo.arrToString(ArrayOps.largestInRows(new int[][] {{1}, {2,3}}))); //4d
    }
}
