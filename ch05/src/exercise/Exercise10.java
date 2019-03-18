package exercise;

import java.util.Arrays;

public class Exercise10 {

	public static void main(String[] args) {
		int[][] leftMatrix = {{1,2,3},{4,5,6}};
		int[][] rightMatrix = {{1,2},{2,3},{4,5}};
		matPrint(leftMatrix); matPrint(rightMatrix);
		int[][] result = matMul(leftMatrix, rightMatrix);
		if (result != null)
			matPrint(result);
		else
			System.out.println("x 행렬의 열수와 y 행렬의 행수가 같아야 함");
	}
	public static int[][] matMul(int[][] x, int[][] y) { //2차원 배열 2개를 받음
		if (x[0].length != y.length)  //matrix연산을 하기위해 크기가 맞는지 확인
			return null;
		int row = x.length; // 첫번째 matrix 열의 수
		int col = y[0].length; // 두번째 matrix 행의 수
		int size = y.length;
		int[][] result = new int[row][col]; // 연산결과 배열 선언
		
		for (int r=0; r < row; r++) {
			for (int c=0; c < col; c++) {
				int sum = 0;
				for (int i=0; i < size; i++) {
					sum += x[r][i] * y[i][c];
				}
				result[r][c] = sum;
			}
		}
		
		return result;
		
	}
	public static void matPrint(int[][] mat) {
		for(int[] matRow: mat)
			System.out.println(Arrays.toString(matRow));
	}

}
