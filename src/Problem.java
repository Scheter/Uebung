public class Problem {

	
	public static void main(String args[]){
	  
    int zahl;   // Initialisierung der Variable, in der die Collatzberechnung stattfindet	
	
    
    
    
    
	for(int i = 5; i <=100;i++){ //Variable int = 5 wird hinzugefügt und solange hochgezählt bis i 100 erreicht
			zahl = i;
		  System.out.print("Seed: "+i+"| ");
			
			while(zahl>1){
		  
		if(zahl % 2 != 0){
			zahl = zahl*3+1;
			}
		else{zahl = zahl/2;}
		
	   System.out.print(zahl+", ");
	 
	   
	   }
	  	System.out.println("");
	}
  } 
}