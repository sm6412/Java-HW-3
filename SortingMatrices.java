// Name: Samira Mantri
// Date: 10/30/16
// Assignment: #5
// Summary: this program will sort an array of matrices according to the max value contained within them

// create a method to sort matrices in an array
public class SortingMatrices {
	public static Matrix[] sortArray(Matrix [] array){
	    for (int x = 0; x < array.length - 1; x++) {
	      // set min value between offset x and array.length-1
	      int currentMin = x;
	      
	      // find the lowest value that is less then the currentMin location
	      for (int j = x + 1; j < array.length; j++) {
	        // replace location if less than the current min location
	    	 if ((array[j]).getMax() < (array[currentMin]).getMax()) {
	          currentMin = j;
	        }
	      }

	     if(currentMin != x) { 
	        // Swap the lowest value found in the inner
	        // loop with the x'th position of the array
	        Matrix smallerMatrix= array[currentMin];
	        array[currentMin] = array[x];
	        array[x]= smallerMatrix;
	      }
	    }
	    return array;
	}
	
	public static void main(String[] args){
		// create an array with 5 open spaces
		Matrix[] matrixArray= new Matrix[5]; 
		
		// create matrices to fill array
		for (int x=0; x<matrixArray.length;x++){
			// generate random dimensions
			int randomNum1= 1+(int)(Math.random()*6);
			int randomNum2= 1+(int)(Math.random()*6);
			matrixArray[x]= new Matrix(randomNum1,randomNum2);
		}
		
		System.out.println("Matrices that are not sorted: \n");
		// print the matrices
		for (int x=0; x<matrixArray.length; x++){
			System.out.println(matrixArray[x]);
		}
		
		// sort the array by sending it to the sort method
		Matrix[] sortedArray=sortArray(matrixArray);
		
		System.out.println("Matrices that are sorted: \n");
		// print the sorted matrices
		for (int x=0; x<sortedArray.length; x++){
			System.out.println(sortedArray[x]);
		}
	}
	
}
