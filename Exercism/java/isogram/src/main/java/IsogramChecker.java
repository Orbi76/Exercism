import java.util.*;
import java.util.stream.Collectors;

class IsogramChecker {

	boolean isIsogram(String phrase) {
		String s = "";
		char[] ch = null;
		Set<Character> set = new HashSet<>();

		s = phrase.toLowerCase();
		ch = s.toCharArray();

		System.out.println(Arrays.toString(ch) + "  " + s);

		for (char element : ch) {

			if (!set.add(element)) {

				return false;
			}
		}
		return true;
	}
}
