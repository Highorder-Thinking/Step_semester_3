public class Q2 {
	public static String reverseEachWord(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder reversedSentence = new StringBuilder();

		for (int index = 0; index < words.length; index++) {
			if (index > 0) {
				reversedSentence.append(" ");
			}
			reversedSentence.append(new StringBuilder(words[index]).reverse());
		}

		return reversedSentence.toString();
	}

	public static void main(String[] args) {
		String sentence = "hello club";
		System.out.println(reverseEachWord(sentence));
	}
}
