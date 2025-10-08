package day3;

public class Squrematrix {
	public static void main(String[] args) {
		int[][] matrix ={
				{1, 2, 3, 5},
				{4, 5, 6, 8},
				{7, 8, 9, 1},
				{5, 3, 9, 2}
				};
		
		int sum = 0;
		
		for (int i = 0; i < matrix.length; i++)
		{
			sum = sum + matrix[i][i];
		
		}
		System.out.println("sum of diagonal element is : "+sum);
	}

}
