public class Problem {

	
	public static void main(String args[]){
	  
    int zahl;   // Initialisierung der Variable, in der die Collatzberechnung stattfindet	
	
    
    
    
    
	for(int i = 5; i <=100;i++){ //Variable int = 5 wird hinzugef�gt und solange hochgez�hlt bis i 100 erreicht
			zahl = i;
		  System.out.print("Seed: "+i+"| "); //sch�nere Formatierung der Ausgabe in der Console
			
			while(zahl>1){ //w�hrend die Zahl gr��er als 1 ist
		  
		if(zahl % 2 != 0){  //wenn man "zahl" durch 2 teilt wird der Rest bestimmt. Wenn der Rest null ist else 
			zahl = zahl*3+1; //zahl mal 3+1
			}
		else{zahl = zahl/2;} //zahl / 2
		
	   System.out.print(zahl+", "); 
	 
	   
	   }
	  	System.out.println("");
	}
  } 
}