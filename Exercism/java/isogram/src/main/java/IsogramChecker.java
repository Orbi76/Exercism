import java.util.*;
import java.util.stream.Collectors;

class IsogramChecker {

	boolean isIsogram(String phrase) {
		String s = "";
		char[] ch = null;
		Collection<String> sar = Arrays.asList("A", "B");
		Set<Character> set = new HashSet<>();
		
		// char valami = "a";
		s = phrase.toLowerCase();
		ch = s.toCharArray();
//		String sarc = new String(ch); 
//		System.out.println("sarc string "+ sarc);
		// phrase = phrase.toLowerCase();

		// System.out.println(ch);
		// System.out.println(ch + " " +s + " char ");
		System.out.println(Arrays.toString(ch) + "  " + s);
		// System.out.println(s);

		// ch.stream().distinct().forEach(System.out::println);

		/*
		 * for (int i=0; i<ch.length; i++ ){ if (array[i] != array)
		 * System.out.println(ch);
		 */

//		String disEl = sarc.stream().distinct().collect(Collectors.toList());
//		System.out.println(disEl);
		
		for (char element : ch) {
			
			if (!set.add(element)) {
				
//				System.out.println("for false");
				return false;
			}
		}
//		System.out.println("for ture");
		return true;

		// return (s.equals(phrase)) ? true : false;

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
