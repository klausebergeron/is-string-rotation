package rotationequal;
import java.util.Scanner;

public class main {

	public static void main(final String[] arguments) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word: ");
		String s1 = scan.next();					//ex: "hannah" or "banana"
		System.out.println("Enter second word: ");
		String s2 = scan.next();					//ex: "ahhann"
		String noSpacesS1 = s1.replace(" ", "");
		String noSpacesS2 = s2.replace(" ", ""); 	//just in case there are spaces
		scan.close();
		
		noSpacesS1 += noSpacesS1;					//ex: "hannahhanna" or "bananabanana"
		if (noSpacesS1.contains(noSpacesS2)) {	
			System.out.println(s2 + " is a rotation of " + s1);
		}	//ex: "hannahhannah" contains ahhann (hann'ahhann'ah)
		else
			System.out.println(s2 + " is not a rotation of " + s1);
			//no "ahhann" in "bananabanana"
		return;	
	}
}
