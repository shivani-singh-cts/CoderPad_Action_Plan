package com.coderpad.preparation;

import java.util.Scanner;

public class Matrices {

	static void matrixAdd(int[][] first, int[][] second, int r, int c) {
		int[][] result= new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j = 0; j< c; j++)
				result[i][j] = first[i][j] + second[i][j];
		}
		System.out.println("Addition of Matrices is: ");
		displayMatrix(result, r, c);
	}
	static void matrixSubtract(int[][] first, int[][] second, int r, int c) {
		int[][] result= new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j = 0; j< c; j++)
				result[i][j] = first[i][j] - second[i][j];
		}
		System.out.println("Addition of Matrices is: ");
		displayMatrix(result, r, c);
	}
	static void matrixMultiply(int[][] first, int[][] second, int r, int c, int r2) {
		int[][] result = new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j< c; j++) {
				for(int k =0; k< r2; k++) 
					result[i][j] += (first[i][k] * second[k][j]);
			}
		}
		System.out.println("Addition of Matrices is: ");
		displayMatrix(result, r, c);
	}
	static int[][] inputMatrix(int r, int c){
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[r][c];
		for(int i =0; i< r; i++) {
			System.out.println("Enter elements for row "+i);
			for(int j=0; j<c; j++)
				matrix[i][j] = input.nextInt();
		}
		return matrix;
	}
	static void displayMatrix(int[][] matrix, int r, int c) {
		for(int i =0; i< r; i++) {
			for(int j=0; j< c; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows and columns for Matrix 1:");
		int row1 = input.nextInt();
		int col1 = input.nextInt();
		System.out.println("Enter elements of Matrix 1:");
		int [][] matrix1 = inputMatrix(row1, col1);
		
		System.out.print("Enter number of rows and columns for Matrix 2:");
		int row2 = input.nextInt();
		int col2 = input.nextInt();
		System.out.println("Enter elements of Matrix 2:");
		int [][] matrix2 = inputMatrix(row2, col2);
		
		System.out.println("Select Matrix Operation to perform: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		
		int choice = input.nextInt();
		switch(choice) {
			case 1: if(row1 == row2 && col1 == col2)
						matrixAdd(matrix1, matrix2, row1, col1);
					else
						System.out.println("Addition of Matrices not possible");
					break;
			case 2: if(row1 == row2 && col1 == col2)
						matrixSubtract(matrix1, matrix2, row1, col1);
					else
						System.out.println("Subtraction of Matrices not possible");
					break;
			case 3: if(col1 == row2)
						matrixMultiply(matrix1, matrix2, row1, col2, row2);
					else
						System.out.println("Multiplication of Matrices not possible");
					break;
			default: System.out.println("Invalid option entered.");
		}
	}

}
