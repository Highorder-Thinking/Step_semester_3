class Q4p {
	public static char findFirstNonRepeatingChar(String text) {
		java.util.Map<Character, Integer> frequency = new java.util.HashMap<>();

		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			frequency.put(character, frequency.getOrDefault(character, 0) + 1);
		}

		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (frequency.get(character) == 1) {
				return character;
			}
		}

		return '\0';
	}

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String text = scanner.nextLine();
		char result = findFirstNonRepeatingChar(text);

		if (result == '\0') {
			System.out.println("No non-repeating character exists.");
		} else {
			System.out.println("First non-repeating character: " + result);
		}
		scanner.close();
	}
}
