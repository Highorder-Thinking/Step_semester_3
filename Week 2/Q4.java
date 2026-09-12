public class Q4 {
	public static String normalizeCode(String raw) {
		String trimmedCode = raw.trim();
		if (trimmedCode.length() < 3) {
			return trimmedCode;
		}

		return trimmedCode.substring(0, 3).toUpperCase()
				+ trimmedCode.substring(3);
	}

	public static String validateAndFormat(String code) {
		if (code.length() != 13) {
			return "Invalid: code must be exactly 13 characters";
		}

		for (int index = 0; index < 3; index++) {
			if (!Character.isLetter(code.charAt(index))) {
				return "Invalid: publisher code must be 3 letters";
			}
		}

		for (int index = 3; index < 13; index++) {
			if (!Character.isDigit(code.charAt(index))) {
				return "Invalid: year and catalog must be 10 digits";
			}
		}

		StringBuilder formattedCode = new StringBuilder();
		formattedCode.append("[").append(code.substring(0, 3)).append("] ");
		formattedCode.append("YEAR: ").append(code.substring(3, 7));
		formattedCode.append(" | CATALOG: ").append(code.substring(7));
		return formattedCode.toString();
	}

	public static void main(String[] args) {
		String validInput = normalizeCode("pen2026004251");
		String invalidInput = normalizeCode("12N2026004251");

		System.out.println(validateAndFormat(validInput));
		System.out.println(validateAndFormat(invalidInput));
	}
}
