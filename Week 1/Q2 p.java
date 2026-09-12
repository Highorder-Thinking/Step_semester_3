import java.util.Scanner;

class Q2p {
	public static boolean isPalindromeIterative(String text) {
		for (int left = 0, right = text.length() - 1; left < right; left++, right--) {
			if (text.charAt(left) != text.charAt(right)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindromeRecursive(String text) {
		if (text.length() <= 1) {
			return true;
		}
		if (text.charAt(0) != text.charAt(text.length() - 1)) {
			return false;
		}
		return isPalindromeRecursive(text.substring(1, text.length() - 1));
	}

	public static boolean isPalindromeArrayReversal(String text) {
		char[] original = text.toCharArray();
		char[] reversed = original.clone();

		for (int left = 0, right = reversed.length - 1; left < right; left++, right--) {
			char temporary = reversed[left];
			reversed[left] = reversed[right];
			reversed[right] = temporary;
		}

		return java.util.Arrays.equals(original, reversed);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = scanner.nextLine();

		System.out.println("Iterative: " + isPalindromeIterative(text));
		System.out.println("Recursive: " + isPalindromeRecursive(text));
		System.out.println("Array reversal: " + isPalindromeArrayReversal(text));
		scanner.close();
	}
}
