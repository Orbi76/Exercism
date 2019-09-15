import java.lang.reflect.Array;

public class PigLatinTranslator {

	String translate(String input) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char[] consonant = { 'q', 'w', 'r', 't', 'y', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v',
				'b', 'n', 'm' };
		char first = input.charAt(0);
		char second = input.charAt(1);
		char third = input.charAt(2);
		char[] inputarr = input.toCharArray();

		for (int i = 0; i < vowels.length; i++) {
			if (first == vowels[i]) {

				// System.out.println(input + "ay");
				return input + "ay";
			}
		}
		for (int i = 0; i < consonant.length; i++) {
			if (first == consonant[i]) {

				if (first == 'c' && second == 'h') {

					String str2 = input.substring(2);
				//	System.out.println(str2 + first + second + "ay");
					return str2 + first + second + "ay";
				}
				if (first == 'q' && second == 'u') {

					String str2 = input.substring(2);
				//	System.out.println(str2 + first + second + "ay");
					return str2 + first + second + "ay";
				}
				if (first == 't' && second == 'h') {

					String str2 = input.substring(2);
					System.out.println(str2 + first + second + "ay");
					System.out.println("ez is");
					return str2 + first + second + "ay";
				}
				if (first == consonant[i] && second == 'q' && third == 'u') {

					String str3 = input.substring(3);
			//		System.out.println(str3 + first + second + third + "ay");
					return str3 + first + second + third + "ay";
				}
				if (first == 't' && second == 'h' && third == 'r') {

					String str3 = input.substring(3);
					System.out.println(str3 + first + second + third + "ay");
					System.out.println(str3);
					System.out.println("Hello");
					return str3 + first + second + third + "ay";
				}

				String str1 = input.substring(1);
		//		System.out.println(str1 + first + "ay");
				return str1 + first + "ay";
			}
		}
		return input;
	}

}
/*
 * 
 * char [] vowels = {'a', 'e', 'i', 'o', 'u'}; char first = input.charAt(0);
 * 
 * if (first == 'a') {
 * 
 * System.out.println(input + "ay");
 * 
 * return input + "ay";
 * 
 * } System.out.println(input + "ar"); return input;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */