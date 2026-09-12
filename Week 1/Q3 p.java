class Q3_p {
	String getBmiStatus(double bmi) {
		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi < 25.0) {
			return "Normal";
		} else if (bmi < 30.0) {
			return "Overweight";
		}
		return "Obese";
	}

	void printWellnessReport(double[] heights, double[] weights) {
		System.out.printf("%-8s %-12s %-12s %-10s %-15s%n",
				"Person", "Height (m)", "Weight (kg)", "BMI", "Status");

		for (int i = 0; i < heights.length; i++) {
			double bmi = weights[i] / (heights[i] * heights[i]);
			System.out.printf("%-8d %-12.2f %-12.2f %-10.2f %-15s%n",
					i + 1, heights[i], weights[i], bmi, getBmiStatus(bmi));
		}
	}

	public static void main(String[] args) {
		double[] heights = {1.60, 1.75, 1.68, 1.82, 1.55,
							1.70, 1.90, 1.65, 1.72, 1.78};
		double[] weights = {50.0, 72.0, 80.0, 95.0, 45.0,
							68.0, 110.0, 62.0, 88.0, 76.0};

		Q3_p report = new Q3_p();
		report.printWellnessReport(heights, weights);
	}
}
