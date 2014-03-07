import java.util.*;

public class StringReverseInPlace {
	public static void main(String[] args) {
		if(args[0] != null) {
			String unReversedString = args[0];
			char[] charArray = unReversedString.toCharArray();
			char character;

			for(int i = 0, j = unReversedString.length() - 1; i < unReversedString.length() / 2; i++, j--) {
				character = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = character;
			}

			System.out.println(new String(charArray));
		}
		else {
			System.out.println("Please supply a string to reverse");
		}
	}
}