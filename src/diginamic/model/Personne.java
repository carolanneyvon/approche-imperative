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
		
		int nb = 8; // 8/2 = 4 et il reste 0 donc 8%2 est égal à 0
		System.out.println(nb%2);
		
		nb++; // équivalent à nb = nb + 1
		System.out.println(nb);
		nb--;
		System.out.println(nb);
		
		int x = 0;
		int y = 1;
		boolean resultat = (x >= 0) && (y < 1);
		System.out.println(resultat);
		
		boolean comparaison1 = x >= 0;
		System.out.println(comparaison1);
		
		boolean comparaison2 = y < 1;
		System.out.println(comparaison2);
		
		boolean res = comparaison1 || comparaison2;
		System.out.println("Résultat = " + res);
		
		boolean res2 = comparaison1 && comparaison2; // résultat true si comparaison1==true et comparaison2==true
		System.out.println("Résultat 2 = " + res2);
	}

}
