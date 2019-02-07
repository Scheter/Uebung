
public class Weihnachtsbaum {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b = 10;
		int a = 1;
		
		while(b>0){
		for(int j = 0; j < b/2; j++){
		
			System.out.print(" ");
		}
		
			b--;
		for(int i = 0; i < a; i++){
			System.out.print("O");
		}
		System.out.println();
		a++;
	}

}
}