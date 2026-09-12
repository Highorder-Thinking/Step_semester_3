class Q1p {
	public static String playRound(String playerMove, String computerMove) {
		if (playerMove.equals(computerMove)) return "Draw";
		if ((playerMove.equals("Rock") && computerMove.equals("Scissors"))
				|| (playerMove.equals("Paper") && computerMove.equals("Rock"))
				|| (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
			return "Win";
		}
		return "Loss";
	}

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		java.util.Random random = new java.util.Random();
		String[] moves = {"Rock", "Paper", "Scissors"};
		String[][] summary = new String[5][4];
		int wins = 0, losses = 0, draws = 0;

		for (int i = 0; i < 5; i++) {
			String playerMove;
			do {
				System.out.print("Round " + (i + 1) + " - enter Rock, Paper, or Scissors: ");
				playerMove = scanner.nextLine().trim().toLowerCase();
			} while (!playerMove.equals("rock") && !playerMove.equals("paper")
					&& !playerMove.equals("scissors"));

			playerMove = Character.toUpperCase(playerMove.charAt(0)) + playerMove.substring(1);
			String computerMove = moves[random.nextInt(moves.length)];
			String result = playRound(playerMove, computerMove);
			summary[i] = new String[]{String.valueOf(i + 1), playerMove, computerMove, result};

			if (result.equals("Win")) wins++;
			else if (result.equals("Loss")) losses++;
			else draws++;
		}

		System.out.println("\nSummary");
		System.out.printf("%-7s %-15s %-17s %-10s%n", "Round", "Player Move", "Computer Move", "Result");
		for (String[] row : summary) {
			System.out.printf("%-7s %-15s %-17s %-10s%n", row[0], row[1], row[2], row[3]);
		}
		System.out.println("\nWins: " + wins);
		System.out.println("Losses: " + losses);
		System.out.println("Draws: " + draws);
		System.out.printf("Win Percentage: %.2f%%%n", wins * 100.0 / 5);
		scanner.close();
	}
}
