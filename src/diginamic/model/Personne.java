package diginamic.model;

public class Personne {

	public static void main(String[] args) {
	
		long a = 85; // Ici java convertit 85 qui est de type int en long
		long b = 85L; // Ici java stock 85 qui est de type long
		long c = 9000000000L; // L obligatoire car 9 milliards n'est oas un int
		
		float d = 8.5F; // Par défaut un nbr à "virgule" est un double
		
		// Hiérarchie des types : double > float > long > int / char > short > byte
		
		double e = 8.5;
		double f = 8L; // Conversion implicite
		
		int g = 100_000_000; // Améliore la lisibilité des grand littéraux
		
		int h = 053; // Notation octale (base 8) 5*8+3
		int i = 53; // (base 10) 5*10+3
		int j = 0xAF; // hexadecimal (base 16) 0,1,....9, A, B, C, ..., F
		System.out.println(a);
	}

}
