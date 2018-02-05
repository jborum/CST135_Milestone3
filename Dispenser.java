import java.util.Arrays;

public class Dispenser {
	private String[] productsArray = new String[100];
	//private Product[] productsArray = new Product[100];
	private int numberOfProducts;

	public Dispenser() {
		int singleProductCapcity = 5;
		
		// Create Products to store in the dispenser
		Product candy1 = new Candy();
		Product candy2 = new Candy("Mars, Inc.", "Snickers",3.0, 1.5,0.13);
		Candy candy3 = new Candy((Candy)candy2);
		Product chips1 = new Chips();
		Product chips2 = new Chips("Frito Lay", "Cheetos",1.0, 1.0,0.22);
		Chips chips3 = new Chips((Chips)chips2);
		Product drink1 = new Drink();
		Product drink2 = new Drink("Pepsi Co.", "Sierra Mist",12, 2.0,0.35);
		Drink drink3 = new Drink((Drink)drink2);
		Product gum1 = new Gum();
		Product gum2 = new Gum("Wrigley", "Big Red",0.25, 1.0,0.03);
		Gum gum3 = new Gum((Gum)gum2);
		
		//add products strings to dispenser
		for (int i = 0; i < singleProductCapcity; i++) { // start of loop
			this.addProduct(candy1.toString());
			this.addProduct(candy2.toString());
			this.addProduct(candy3.toString());
			this.addProduct(chips1.toString());
			this.addProduct(chips2.toString());
			this.addProduct(chips3.toString());
			this.addProduct(drink1.toString());
			this.addProduct(drink2.toString());
			this.addProduct(drink3.toString());
			this.addProduct(gum1.toString());
			this.addProduct(gum2.toString());
			this.addProduct(gum3.toString());
		} // end of for loop
	} // End of dispenser constructor
		
	// display products method
	public void displayProducts() {
		int x = 1;
		for (int i = 0; i < this.getNumberOfProducts(); i++) { // start of loop
			System.out.println(x++ + " - " + productsArray[i].toString()); // print values of the players array
		} // End of For Loop
	}

	public void addProduct(String product) {// Start of addProducts method
		productsArray[numberOfProducts] = product;
		numberOfProducts++;
	} // End of addProducts method
	
	public String[] getProducts() {// Start of getProducts method
		return productsArray;
	} // End of getProducts method

	public int getNumberOfProducts() { // Start of getNumberOfProducts method
		return numberOfProducts;
	} // End of getNumberOfProducts method

	// toString Method
	@Override
	public String toString() { // Start of toString Method
		return "Dispenser Products [Products=" + Arrays.toString(productsArray) + ", Number of Products="
				+ numberOfProducts + "]";
	} // End of toString method
			
} // End of Dispenser Class

