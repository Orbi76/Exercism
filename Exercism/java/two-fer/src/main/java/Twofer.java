class Twofer {
	String twofer(String name) {
		String res = ("One for " + (((name == null) ? "you" : name) + ", one for me."));
		return res;
	}

}