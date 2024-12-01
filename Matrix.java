/*
 *  Written by Shamiya Mack
 */
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in); 
		System.out.println("Welcome to the matrix adder program!");
		System.out.println("Please enter the length and width of the first matrix ");
		
		int length = k.nextInt();
		int width = k.nextInt(); 
		
		int [][] matrix1 = new int [length][width]; 
		int [][] matrix3 = new int [length][width];
		
	
	for(int i = 0; i < width; i++)
	{
		for(int j = 0; j < length; j++)
		{
			System.out.println("Enter values at index " +i+" "+j);
			matrix1 [i][j] = k.nextInt();
		}
	}
	System.out.println("Please enter the length and width of the second matrix");
	int length1 = k.nextInt();
	int width1 = k.nextInt();
	int [][] matrix2 = new int [length1][width1];
	
	if(length != length1 || width != width1)
	{
		System.out.println("not compute addition!");
		System.exit(1);
	}

	for(int i = 0; i < width; i++)
	{
		for(int j = 0; j < length; j++)
		{
			System.out.println("Enter values at index " +i+" "+j);
			matrix2 [i][j] = k.nextInt();
		}	
		}
	for(int i = 0; i < width; i++)
	{
		for(int j = 0; j < length; j++)
		{
			System.out.print(matrix1 [i][j] + " ");

		}
		System.out.println("");
	}
	System.out.println("+");
	for(int i = 0; i < width1; i++)
	{
		for(int j = 0; j < length1; j++)
		{
			System.out.print(matrix2 [i][j] + " ");

		}
		System.out.println("");
	}
	System.out.println("=");
	for(int i = 0; i < width; i++)
	{
		for(int j = 0; j < length; j++)
		{
			matrix3[i][j]= matrix1[i][j]+matrix2[i][j];
			System.out.print(matrix3 [i][j] + " ");

		}
		System.out.println("");
	}



}
}
