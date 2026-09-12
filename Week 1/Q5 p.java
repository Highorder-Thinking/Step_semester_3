class Q5 {
	public static String reverseCustomerName(String customerName) {
		return new StringBuilder(customerName).reverse().toString();
	}

	public static void main(String[] args) {
		String customerName = "Divya";
		String reversedName = reverseCustomerName(customerName);

		System.out.println("Original name: " + customerName);
		System.out.println("Reversed name: " + reversedName);
	}
}
