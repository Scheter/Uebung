
public class Fizz_Buzz {

	public static void main(String[] args) {
		for(int i = 1; i < 1001; i++ ){
			if(i % 3 ==0){
				System.out.println(i+"   Fizz");
				if(i % 5==0){
					System.out.println(i + "   Buzz");
				}
			}
				else
				{
					if(i % 5 ==0){
						System.out.println(i+"   Buzz");
						
					}
					else
						System.out.println(i);
				}
			
		}

	}
	}

