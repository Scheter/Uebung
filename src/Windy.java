import java.util.Scanner ;
public class Windy {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hier kmh eingeben:  ");
		int kmh = s.nextInt();
		System.out.println("Knoten:      "+getknots(kmh));
		System.out.println("Beaufort:    "+beaufort(kmh));
		if(kmh<=2){
			System.out.println("Windstärke:  Windstill");
			
		}
		else{ if(kmh<100){
			System.out.println("Windtsärke:  Normal");}}
		
		if(kmh>100){
			System.out.println("Windstärke:  ORKAN");
		}}
	
		

	
	public static double getknots(double kmh){
		return (kmh*0.54);
	}
	public static double beaufort(double kmh){
		return Math.round(Math.pow((kmh/3.6)/0.836,0.6666667));
	}
	

	}
