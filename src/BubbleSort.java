public class BubbleSort {
	
	static int[] A = {4,11,3,5,54,76,78,98,23,423,434,562,7,44,87,115,17,19,1};
	static int temp;
	static int counterselec = 0;
	public static void main(String[] args) {
		for(int k=0; k<A.length; k++){
			System.out.print(A[k]+" ");
	}	
		System.out.println("");
		System.out.println("wird sortiert zu ...");
		bubbleSort(A);
		
		
		for(int k=0; k<A.length; k++){
			System.out.print(A[k]+" ");
	}		
		System.out.println("");
		System.out.println("W‰hrend der Sortierung wurde " + counterselec + " mal soertiert!");
	}	
		public static void bubbleSort(int[] A){
		  for (int n=A.length; n>1; n--){
		    for (int i=0; i<n-1; i++){
		      if (A[i] > A[i+1]){
		    	  temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					counterselec++;
					
					
					}
		      } // Ende if
		    } // Ende innere for-Schleife
		  } // Ende ‰uﬂere for-Schleife
		
		

}
