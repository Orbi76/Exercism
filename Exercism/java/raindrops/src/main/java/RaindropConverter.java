class RaindropConverter {

	String convert(int number) {

		String betu = "Pling";
		String betu2 = "Plang";
		String betu3 = "Plong";
		String betu4 = "PlingPlang";
		String betu5 = "PlangPlong";
		String betu6 = "PlingPlong";
		String betu7 = "PlingPlangPlong";

		/*
		 * if (number == 1) { return Integer.toString(number); }
		 */
		if ((number % 3 == 0) && (number % 5 == 0) && (number % 7 == 0)) {
			return betu7;
		}

		if (number % 3 == 0 && number % 5 == 0) {
			return betu4;
		}
		if (number % 5 == 0 && number % 7 == 0) {
			return betu5;
		}
		if (number % 3 == 0 && number % 7 == 0) {
			return betu6;
		}

		if (number % 3 == 0) {
			return betu;
		}
		if (number % 5 == 0) {
			return betu2;
		}
		if (number % 7 == 0) {
			return betu3;
		}
		if (number == 2 * 2 * 2) {
			return Integer.toString(number);
		}
		else
			return Integer.toString(number);
	}

}
