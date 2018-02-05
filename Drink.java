/**	Program: Milestone 3 Vending machine
*	File: Drink.java
*	Summary: Drink class with compareTo added
*	Authors: original code by Jason Borum and compareTo edit by Nicholas Thomas
*	Date: February 3, 2018
**/



public class Drink extends Product implements Comparable <Drink> {
	public Drink() {
		super.setCompanyName("Pepsi Co.");
		super.setBrandName("Mountain Dew");
		super.setOunces(12);
		super.setPrice(2.0);
		super.setCost(0.5);
	}
	
	public Drink(String companyName,  String brandName, double ounces,  double price,  double cost) {
		super.setCompanyName(companyName);
		super.setBrandName(brandName);
		super.setOunces(ounces);
		super.setPrice(price);
		super.setCost(cost);
	}
	
	public Drink(Drink copyDrink) {
		super.setCompanyName(copyDrink.getCompanyName());
		super.setBrandName(copyDrink.getBrandName());
		super.setOunces(copyDrink.getOunces());
		super.setPrice(copyDrink.getPrice());
		super.setCost(copyDrink.getCost());
	}
	
	@Override
	public int compareTo(Drink other){
		if (getBrandName().toUpperCase().compareTo(other.getBrandName().toUpperCase()) > 0) {
			return 1;
		} else if (getBrandName().toUpperCase().compareTo(other.getBrandName().toUpperCase()) < 0) {
			return -1;
		} else if (getPrice() > other.getPrice()) {
			return 1;
		} else if (getPrice() < other.getPrice()) {
			return -1;
		} else if (getOunces() > other.getOunces()) {
			return 1;
		} else if (getOunces() < other.getOunces()) {
			return -1;
		} else if (getCost() > other.getCost()) {
			return 1;
		} else if (getCost() < other.getCost()) {
			return -1;
		else return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Drink" + super.toString() + "]";
	}
}
