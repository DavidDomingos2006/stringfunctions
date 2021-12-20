
public class StringInterestingFunctions {
	
	public static void main (String[] args) {
		
		String Interesting = "Deus é O senhor dos EXÉRCITOS, o senhor REINA por toda a terra         ";
		
		String first = Interesting.toLowerCase();
		String second = Interesting.toUpperCase();
		String third = Interesting.trim();
		String fourty = Interesting.substring(2);
		String fivety = Interesting.substring(2,10);
		String sixty = Interesting.replace('E', 'i');
		String seventy = Interesting.replace("Deus", "O Senhor");
		int CapturaIndice = Interesting.indexOf("se");
		int CapturaIndice2 = Interesting.lastIndexOf("se");
		
						
		System.out.println("Lower Case - " + first);
		System.out.println("Upper Case - " +second);
		System.out.println("Effect Trim :" + third + " -");
		System.out.println("Effect Substring with index 2 :" + fourty);
		System.out.println("Effect substring with intitial index 2 and final index 9 : "+fivety);
		System.out.println("Using replace function, char case: "+sixty);
		System.out.println("Using replace function, string case: "+seventy);
		System.out.println("Using indexCapture, first ocorrency: "+CapturaIndice);
		System.out.println("Using indexCapture, last ocorrency: "+CapturaIndice2);
		
		String fruits = "orange potato apple lemon";
		String[] vect = fruits.split(" ");
		System.out.println();
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		

	}

}
