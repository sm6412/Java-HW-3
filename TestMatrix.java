// Name: Samira Mantri
// Date: 10/30/16
// Assignment: #5
// Summary: this class will be utilized to test the Matrix class
public class TestMatrix {
	
	// create a method to print arrays
	public static void toStringArray(int [] array){
		for (int x=0; x<array.length; x++){
			System.out.print(" "+array[x]);
		}
		
	}
	
	public static void main(String[] args) {
		
			// test to make sure the entered integers are changed if they are less than 1 or larger than 5
		
			// create a matrix with values that are less than 1 or greater than five
			Matrix inBoundsMatrix= new Matrix(2);
			System.out.println("When a matrix is created with 2 rows and 2 columns, the rows and columns are the following");
			// print rows
			System.out.println("Rows: "+inBoundsMatrix.getNumOfRows());
			// print the columns
			System.out.println("Columns: "+inBoundsMatrix.getNumOfColumns()+"\n");
			System.out.println("Here is the matrix:");
			System.out.println(inBoundsMatrix.toString()+"\n");
			
			// create a matrix where the number of rows is too small
			Matrix smallRowsMatrix= new Matrix(0,3);
			System.out.println("When a matrix is created with 0 rows and 3 columns, the rows and columns are the following");
			// print rows
			System.out.println("Rows: "+smallRowsMatrix.getNumOfRows());
			// print the columns
			System.out.println("Columns: "+smallRowsMatrix.getNumOfColumns()+"\n");
			System.out.println("Here is the matrix:");
			System.out.println(smallRowsMatrix.toString()+"\n");
			
			// create a matrix where the number of rows is too large
			Matrix largeRowsMatrix= new Matrix(6,2);
			System.out.println("When a matrix is created with 6 rows and 2 columns, the rows and columns are the following");
			// print rows
			System.out.println("Rows:"+largeRowsMatrix.getNumOfRows());
			// print the columns
			System.out.println("Columns: "+largeRowsMatrix.getNumOfColumns()+"\n");
			System.out.println("Here is the matrix:");
			System.out.println(largeRowsMatrix.toString()+"\n");
			
			// create a matrix where the number of columns is too small
			Matrix smallColMatrix= new Matrix(2,-1);
			System.out.println("When a matrix is created with 2 rows and -1 columns, the rows and columns are the following");
			// print rows
			System.out.println("Rows: "+smallColMatrix.getNumOfRows());
			// print the columns
			System.out.println("Columns: "+smallColMatrix.getNumOfColumns()+"\n");
			System.out.println("Here is the matrix:");
			System.out.println(smallColMatrix.toString()+"\n");
			
			// create a matrix where the number of columns is too large
			Matrix largeColMatrix= new Matrix(2,6);
			System.out.println("When a matrix is created with 2 rows and 6 columns, the rows and columns are the following");
			// print rows
			System.out.println("Rows: "+largeColMatrix.getNumOfRows());
			// print the columns
			System.out.println("Columns: "+largeColMatrix.getNumOfColumns()+"\n");
			System.out.println("Here is the matrix:");
			System.out.println(largeColMatrix.toString()+"\n");
			
			// test the class methods
			System.out.println("Test the Matrix methods \n");
			//demonstrate the use of the methods in the Matrix class
			System.out.println("Original Matrix:");
			Matrix testerMatrix= new Matrix(2,3);
			System.out.println(testerMatrix.toString()+"\n");
			
			// print matrix using the columnSum method in the Matrix class
			System.out.println("The following is the sum of the integers in each column:" );
			toStringArray(testerMatrix.columnSum());
			System.out.println("\n");
			
			// print matrix using the rowMax method in the Matrix class
			System.out.println("The following is the max value of each row in the matrix:" );
			toStringArray(testerMatrix.rowMax());
			System.out.println("\n");
			
			// print matrix using the transpose method in the Matrix class
			System.out.println("The following is the transposed matrix:" );
			testerMatrix.transpose();
			System.out.println(testerMatrix.toString()+"\n");
			
			// print the new original matrix
			System.out.println("As you can see, after the matrix is transposed the original matrix is now:");
			System.out.println(testerMatrix.toString()+"\n");
			
			// test to see whether the matrices can be added together
			System.out.println("Test matrix addition \n");
			// create a new matrix
			Matrix m1= new Matrix(3,3);
			// print the matrix
			System.out.println("Here is the first matrix:");
			System.out.println(m1.toString());
			
			// create a new matrix
			Matrix m2= new Matrix(3,3);
			// print the matrix
			System.out.println("Here is the second matrix:");
			System.out.println(m2.toString()+"\n");
			
			// test to see whether the matrices can be added by using the add method in the matrix class
			System.out.println("Can these matrices be added?");
			System.out.println("Answer:"+m1.add(m2)+"\n");
			// print matrix
			System.out.println("The first matrix is now:");
			System.out.println(m1.toString()+"\n");
			
			// test two more matrices
			System.out.println("Let's test two more matrices \n");
			
			// create a third matrix
			Matrix m3= new Matrix(2,3);
			// print the matrix
			System.out.println("Here is the first matrix:");
			System.out.println(m3.toString()+"\n");
			
			// create a fourth matrix
			Matrix m4= new Matrix(3,3);
			// print the matrix
			System.out.println("Here is the second matrix:");
			System.out.println(m4.toString()+"\n");
			
			// test to see whether the matrices can be added by using the add method in the matrix class
			System.out.println("Can these matrices be added?");
			System.out.println("Answer:"+m3.add(m4)+"\n");
			
			// demonstrate how the matrices are unchanged
			System.out.println("Since the matrices could not be added they are unchanged \n");
			System.out.println(m3.toString()+"\n");
			System.out.println(m4.toString()+"\n");
			
			// multiply the matrix values by a positive and negative number as well as zero
			
			// create a tester matrices
			System.out.println("Multiplication testing \n");
			Matrix multiplyMatrix = new Matrix(3,4);
			
			// print the original matrix
			System.out.println("Here is the original matrix: \n");
			System.out.println(multiplyMatrix.toString()+"\n");
			
			// multiply by a positive number
			System.out.println("Here is the previous matrix when multiplied by 2: \n");
			multiplyMatrix.multiply(2);
			System.out.println(multiplyMatrix.toString()+"\n");
			
			// multiply by a negative number
			System.out.println("Here is the previous matrix when multiplied by -3: \n");
			multiplyMatrix.multiply(-3);
			System.out.println(multiplyMatrix.toString()+"\n");
			
			// multiply by zero
			System.out.println("Here is the previous matrix when multiplied by 0: \n");
			multiplyMatrix.multiply(0);
			System.out.println(multiplyMatrix.toString()+"\n");
		
				
	}			

}
