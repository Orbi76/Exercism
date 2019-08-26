import java.util.*;

class IsogramChecker {

	boolean isIsogram(String phrase) {
		String s = "";

		s = phrase.toLowerCase();
		//System.out.println(s);
		return (s.equals(phrase)) ? true : false;

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
