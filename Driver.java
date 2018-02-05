public class Driver {
	public static void main(String[] args) {
		String[] productArray = new String[100];
		Dispenser dispenser = new Dispenser();
		dispenser.displayProducts();
		productArray = dispenser.getProducts();
		
		Drink drink1 = new Drink("Pepsi Co.", "Sierra Mist",12, 2.0,0.35);
		Drink drink2 = new Drink("Pepsi Co.", "Sierra Mist",12, 2.0,0.35);
		
		Snack candy1 = new Candy("Little Debbie", "zebra cake",3.0, 1.5,0.13);
		Snack candy2 = new Candy("Mars, Inc.", "Snickers",3.0, 1.5,0.13);
		
		System.out.println("candy1 compared to candy2 = " + candy2.compareTo(candy1));
		System.out.println("drink1 compared to drink2 = " + drink1.compareTo(drink2));
	}
}
