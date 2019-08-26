import java.util.*;

class IsogramChecker {

	boolean isIsogram(String phrase) {
		String s = "";
		char[] ch = null;
		Set<Character> set = new HashSet<>();
		
		
//		char valami = "a";
		s = phrase.toLowerCase();
		ch = s.toCharArray();
//		phrase = phrase.toLowerCase();
		
//		System.out.println(ch);
//		System.out.println(ch + "  " +s + " char ");
		System.out.println(Arrays.toString(ch) + "  " +s);		
//		System.out.println(s);

		//		ch.stream().distinct().forEach(System.out::println);
		
/*		for (int i=0; i<ch.length; i++ ){
			if (array[i] != array)
			System.out.println(ch);
*/			
			
		for (char element : ch) {
			if (!set.add(element)) {
				return false;
			}
		}
		return true;
		
		
//		return (s.equals(phrase)) ? true : false;

		/*
		 * 
		 * List<String> list = Arrays.asList("ter","vez","ni");
		 * list.stream().distinct().forEach(System.out::println);
		 * 
		 * 
		 * 
		 * if (phrase == s) { return true; // } // return ("".equals(phrase)) ? true :
		 * false;
		 * 
		 * } else return false; }
		 */
	}
}
