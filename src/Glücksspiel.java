
public class Glücksspiel {
	 static boolean geschlecht = true;
	 static int alter = 16;
	 static String name = "Raoul";
	 
		public static void main(String[] args) {
			if(alter < 18){
				System.out.println("Hallo " + name + "!");
				System.out.println("Du hast  " +wuerfeln());
			}else if (!geschlecht){ 
				System.out.println("Lieber Herr "+name +"!");
				System.out.println("Sie haben  " +wuerfeln());
			}else{
				System.out.println("Liebe Frau"+ name +"!");
				System.out.println("Sie haben  " +wuerfeln());
			}
		
		}
			
		
			public static String wuerfeln(){
				double random = Math.random();
				if(random<= 0.42 ){
				return"Verloren";
				}
					else{return"Gewonnen";
			}
				
	}

}
