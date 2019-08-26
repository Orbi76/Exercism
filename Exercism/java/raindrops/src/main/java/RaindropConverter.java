class RaindropConverter {

    String convert(int number) {
        String msg = "";
        if (number % 3 == 0) {
            msg += "Pling";
    // nem ad meg returnt ezért megy tovább az if és figyelembeveszi a következő if-et is.
   // és csak a végéd adja meg a returnt és igy kiír mindent         
        }

        if (number % 5 == 0) {
            msg += "Plang";
        }

        if (number % 7 == 0) {
            msg += "Plong";
        }

        return ("".equals(msg)) ? String.valueOf(number) : msg;
 //     returne ha "" egyenlo msg-vel akkor legzen ay eredmeny a number értékét stringben egyebkent legyen ay eredmeny msg.  
    }

}


/*
class RaindropConverter {

	String convert(int number) {

		String betu = "Pling";
		String betu2 = "Plang";
		String betu3 = "Plong";
		String betu4 = "PlingPlang";
		String betu5 = "PlangPlong";
		String betu6 = "PlingPlong";
		String betu7 = "PlingPlangPlong";

//		/*
		 if (number == 1) { return Integer.toString(number); }
//		 
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
*/