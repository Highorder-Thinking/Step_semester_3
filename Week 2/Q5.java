import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q5 {
	public static void printFilteredWordFrequency(String feedback) {
		Set<String> stopWords = new HashSet<>(Arrays.asList(
				"the", "was", "and", "a", "is", "of", "in"));
		String normalizedFeedback = feedback.toLowerCase()
				.replace(".", "")
				.replace(",", "");
		String[] words = normalizedFeedback.split("\\s+");
		Map<String, Integer> wordFrequency = new HashMap<>();

		for (String word : words) {
			if (!stopWords.contains(word)) {
				wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
			}
		}

		List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordFrequency.entrySet());
		sortedWords.sort((first, second) -> {
			int countComparison = Integer.compare(second.getValue(), first.getValue());
			return countComparison != 0
					? countComparison
					: first.getKey().compareTo(second.getKey());
		});

		for (Map.Entry<String, Integer> entry : sortedWords) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		printFilteredWordFrequency("The mentor was great, the session was great and clear.");
	}
}
