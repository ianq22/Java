public class StringToInteger {
	/**
	 * I was wondering how Java did String to Integer conversion, so I gave it a hand and tried it myself.
	 * After remembering that chars are easily converted to ints, the rest came pretty easily.
	 */
	public static void main(String[] args) {
		char[] stringArray = args[0].toCharArray();
		int integerValue = 0;
		boolean negative = false;

		if(stringArray[0] == '-') {
			negative = true;
		}

		for(int i = stringArray.length - 1, j = 0; (negative ? i > 0 : i >= 0); i--, j++) {
			integerValue += (stringArray[i] - '0') * (Math.pow(10, j));
		}

		if(negative) {
			System.out.println(-integerValue);
		}
		else {
			System.out.println(integerValue);
		}
	}
}