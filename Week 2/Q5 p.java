class Q5p {
	public static String normalizeReference(String raw) {
		String trimmedReference = raw.trim();
		if (trimmedReference.length() < 3) {
			return trimmedReference;
		}

		return trimmedReference.substring(0, 3).toUpperCase()
				+ trimmedReference.substring(3);
	}

	public static String validateAndFormat(String reference) {
		if (reference.length() != 14) {
			return "Invalid: reference must be exactly 14 characters";
		}

		for (int index = 0; index < 3; index++) {
			if (!Character.isLetter(reference.charAt(index))) {
				return "Invalid: bank code must be 3 letters";
			}
		}

		for (int index = 3; index < 14; index++) {
			if (!Character.isDigit(reference.charAt(index))) {
				return "Invalid: date and sequence must be 11 digits";
			}
		}

		StringBuilder formattedReference = new StringBuilder();
		formattedReference.append("[").append(reference.substring(0, 3)).append("] ");
		formattedReference.append("DATE: ")
				.append(reference.substring(3, 5)).append("/")
				.append(reference.substring(5, 7)).append("/")
				.append(reference.substring(7, 9));
		formattedReference.append(" | SEQ: ").append(reference.substring(9));
		return formattedReference.toString();
	}

	public static void main(String[] args) {
		String validReference = normalizeReference("hdf03022600042");
		String invalidReference = normalizeReference("12F03022600042");

		System.out.println(validateAndFormat(validReference));
		System.out.println(validateAndFormat(invalidReference));
	}
}
