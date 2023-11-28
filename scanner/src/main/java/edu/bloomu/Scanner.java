package edu.bloomu;

import java.util.regex.Pattern;

/**
 * Scans a given string of text for validity against the pattern:
 * A $, any number of astericks, 0 followed or not followed by a demical place
 * or 1 through 9 followed by up to two 0-9 digits and any number of groups
 * following the format `, digit digit digit`, all followed or not followed by
 * a decimal place
 * 
 * @author fayth quinn
 */

public class Scanner {

	public Scanner() {}

	public boolean regex(String s) {
		return Pattern.compile("^\\$[*]*(0|[1-9]\\d{0,2}(,\\d{3})*)(\\.\\d{2})?$").matcher(s).matches();
	}

	public boolean scan(String s) {

		int i = 0;

		// CHECK FOR $
		if (s.charAt(i) != '$')
			return false;

		// CHECK FOR STRING TERMINATION
		if (hasNext(s, i))
			i++;

		// CHECK FOR * (ANY NUMBER)
		while (hasNext(s, i) && s.charAt(i) == '*')
			i++;

		// IF NON-ZERO DIGIT
		if (isNZDigit(s.charAt(i))) {

			if (hasNext(s, i)) {

				// IF ADDITIONAL DIGIT
				if (isDigit(s.charAt(++i)) && hasNext(s, i)) {

					// IF ADDITIONAL DIGIT
					if (isDigit(s.charAt(++i)) && hasNext(s, i))
						i++;

				}

				// SCAN FOR GROUPS
				while (s.charAt(i) == ',') {

					if (!hasNext(s, i) || !isDigit(s.charAt(++i)))
						return false;
					else {

						if (!hasNext(s, i) || !isDigit(s.charAt(++i)))
							return false;
						else {

							if (!hasNext(s, i) || !isDigit(s.charAt(++i)))
								return false;
							else if (hasNext(s, i))
								i++;

						}

					}

				}

			}

		}
		// IF ZERO
		else if (s.charAt(i) == '0') {

			if (hasNext(s, i)) {
				if (isDigit(s.charAt(++i))) {
					return false;
				}
			}

		} else
			return false;

		if (!isDigit(s.charAt(i))) {

			// DECIMAL SCANNER
			if (s.charAt(i) == '.') {

				if (!hasNext(s, i) || !isDigit(s.charAt(++i)))
					return false;
				else {

					if (!hasNext(s, i) || !isDigit(s.charAt(++i)))
						return false;

				}

			} else
				return false;

		}

		if (hasNext(s, i))
			return false;

		return true;

	}

	private boolean hasNext(String s, int i) {
		return (i + 1 < s.length());
	}

	private boolean isNZDigit(char c) {

		switch (c) {

			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return true;
			default:
				return false;
		}

	}

	private boolean isDigit(char c) {
		return (c == '0' || isNZDigit(c));
	}

}
