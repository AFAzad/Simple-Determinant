/*Problem Statement
You are given a 2X2 square matrix. You need to find the determinant of the matrix. */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
	int arr[][] = new int [2][2];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
	{
		arr[i][j] = sc.nextInt();
	}
	}
	int determinent =0;
	 determinent=(arr[0][0] * arr[1][1] ) - (arr[0][1] * arr[1][0]);
	System.out.print(determinent);

	
	}
}