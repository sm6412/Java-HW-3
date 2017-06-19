// Name: Samira Mantri
// Date: 10/30/16
// Assignment: #5
// Summary: this program will create, transform, and display matrices and arrays as they are called upon in TestMatrix

public class Matrix {
	// create instance variables
		private int rows;
		private int columns;
		private int[][] createdMatrix;
		
		// create method to make sure the entered rows and columns are within the correct bonds 
		public int inputChecker(int input){
			//make sure the rows are 1 if less than 1 or 5 if more than 5
			if (input<1){
				return 1;
			}
			else if(input>5){
				return 5;
			}
			else{
				return input;
			}
		}
		
		// create constructor that takes two arguments
		public Matrix(int r, int c){
			// send entered values to be checked for whether they are less than one or more than five
			rows= inputChecker(r);
			columns=inputChecker(c);
			
			//set the size of the matrix
			this.createdMatrix = new int[rows][columns];
			
			// assign random number between -10 and 10 to each location in the matrix
			for (int row=0; row<rows; row++){
				for (int col = 0; col < columns; col++){
					int randomNum= (int)(-11+Math.random()*22);
					createdMatrix[row][col]= randomNum;
				}
			}
		}
		
		// create a constructor that only takes one entered value
		public Matrix(int dimensions){
			this(dimensions,dimensions);
		}
		
		// create method that returns number of rows
		public int getNumOfRows(){
			return rows;
		}
		
		// create method that returns number of columns
		public int getNumOfColumns(){
			return columns;
		}
		
	
		// create a method that prints the original matrix as a string
		public String toString(){
			String displayedString="";
			for (int row=0; row<createdMatrix.length; row++){
				for (int col = 0; col < createdMatrix[row].length; col++){
					int num= createdMatrix[row][col];
					displayedString+=String.format("%3d ",num);
				}
				displayedString+=String.format("\n");
			}
			return displayedString;
			
		}
		
		
		// create method that counts the integers in each column of the matrix
		public int[] columnSum(){
			// create an array with the same number of elements as are columns in matrix
			int[] columnSum= new int[createdMatrix[0].length];
			
			// use a for loop to extract the sum of the columns on each line and enter them into the new array
			for (int row=0; row<createdMatrix.length; row++){
				
				for (int col = 0; col < createdMatrix[row].length; col++){
					columnSum[col]+=createdMatrix[row][col];
				}
				
			}
			return columnSum;
		}
		
		// create method that returns the largest value of each row
		public int[] rowMax (){
			// create an array with the same number of elements as are rows in the matrix
			int[] maxArray= new int[createdMatrix.length];
			
			// find max integer in each row
			for (int row=0; row<createdMatrix.length; row++){
				int maxValue=createdMatrix[row][0];
				for (int col = 0; col < createdMatrix[row].length; col++){
					if (createdMatrix[row][col]>maxValue)
					maxValue=createdMatrix[row][col];
					
				}
				// put max integer into array
				maxArray[row] = maxValue;
			}
			
			return maxArray;
		}
		
		// create the transpose method to swap the rows and columns
		public int[][] transpose() {
			// create new matrix with the number of columns and rows swapped
			int[][] newMatrix= new int[createdMatrix[0].length][createdMatrix.length];
			
			// give values to new matrix by utilizing the original
			for (int row=0; row<createdMatrix.length; row++){
				for (int col = 0; col < createdMatrix[row].length; col++){
					newMatrix[col][row]= createdMatrix[row][col];
					
				}
			}
			createdMatrix=newMatrix;
			return newMatrix;
			
		}
		
		// create the add method to determine if matrices can be added, and if so, add them together
		public boolean add(Matrix matrix){
			if (createdMatrix.length==matrix.getNumOfRows()&&createdMatrix[0].length==matrix.getNumOfColumns()){
				// add the integers 
				for (int row=0; row<createdMatrix.length; row++){
					for (int col = 0; col < createdMatrix[row].length; col++){
						createdMatrix[row][col]+=matrix.createdMatrix[row][col];
					}
				}
				return true;
			}
			else{
				return false;
			}
		}
		
		// create a method that performs multiplication
		public void multiply(int integer){
			for (int row=0; row<createdMatrix.length; row++){
				for (int col = 0; col < createdMatrix[row].length; col++){
					createdMatrix[row][col]=createdMatrix[row][col]*integer;
				}
			}
		}
	
		//create a method that returns the highest value of a matrix in the created array
		public int getMax(){
			//create a max value
			int maxValue=0;
			for (int row=0; row<createdMatrix.length; row++){
				for (int col = 0; col < createdMatrix[row].length; col++){
					// if the integer in the matrix is higher at that
					// particular position, make it the max value
					if (createdMatrix[row][col]>maxValue){
					maxValue=createdMatrix[row][col];
					}
				}
			}
			return maxValue;
		}

}
	

	
	


