package ch11_1;

import java.util.Arrays;

//class Point {
//	int x, y;
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}

public class CloneOrg {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrCopy = arr.clone();
		
		for(int i : arrCopy) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arrCopy));	// 배열의 원소를 조회할수있다~
	}
}
