public class Q3 {
	public static void parseInventoryRecord(String csvLine) {
		String[] fields = csvLine.split(",");

		if (fields.length != 3) {
			System.out.println("Invalid Record");
		} else {
			System.out.println("Product: " + fields[0].trim()
					+ " | SKU: " + fields[1].trim()
					+ " | Qty: " + fields[2].trim());
		}
	}

	public static void main(String[] args) {
		parseInventoryRecord("Laptop, SKU123, 50");
		parseInventoryRecord("Mouse, SKU456");
	}
}
