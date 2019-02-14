public class Selection_Sort {

	static int[] chaos = {4,11,3,5,54,76,78,98,23,423,434,562,7,44,87,115,17,19,1};
	static int counterselec = 0; 
	static int sortiert[];
		public static void main(String args[]){
			selectionSort(chaos);
			
		}
			public static void selectionSort(int[] sort){
				for(int i=0; i<sort.length; i++){
					for(int j=i+1; j<sort.length; j++){
						if(sort[j] < sort[i]){
							int speicher = sort[i];
							sort[i] = sort[j];
							sort[j] = speicher;
							counterselec++; 
							
								for(int k=0; k<sort.length; k++){
									System.out.print(sort[k]+", ");
								}
								System.out.println("         Der Vorgang dauert nun schon:"+ counterselec +" Schritte");
						}
						
					}
				
		}
	}
			public void output(){
				 
			}
}
