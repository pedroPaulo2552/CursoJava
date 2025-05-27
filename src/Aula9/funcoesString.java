package Aula9;

public class funcoesString {

	public static void main(String[] args) {
		/*String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		int s08 = original.indexOf("bc");
		int s09 = original.lastIndexOf("bc");*/
		
		String s = "Potato Apple Lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
