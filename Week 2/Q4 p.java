class Q4p {
	public static String maskPhoneNumber(String phone) {
		if (phone.length() != 10) {
			return "Invalid phone number";
		}

		for (int index = 0; index < phone.length(); index++) {
			char digit = phone.charAt(index);
			if (digit < '0' || digit > '9') {
				return "Invalid phone number";
			}
		}

		StringBuilder maskedPhone = new StringBuilder();
		maskedPhone.append("XXXXXX-").append(phone.substring(6));
		return maskedPhone.toString();
	}

	public static void main(String[] args) {
		System.out.println(maskPhoneNumber("9876543210"));
		System.out.println(maskPhoneNumber("98765"));
	}
}
