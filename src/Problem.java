
public class Problem {

	public static void main(String[] args) {
		int zahl = 9; 
		while(zahl>1){
		if(zahl % 2 != 0){
			zahl= zahl*3+1;
		}
		else{zahl=zahl/2;}
		System.out.print(zahl+", ");
	}}

}
