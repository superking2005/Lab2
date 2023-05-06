// Lab 2 - Classes, Inheritance, and Polymorphism
// Alexander Mochizuki, partnered with Saranya Kolachana
// Simulates currency

package lab2;

public class Krone extends Currency {
	protected final String currencyName = "Krone";
	
	public Krone() {
		super();
	}
	
	public Krone(double amt) throws Exception {
		super(amt);
	}
	
	// Gets currencyName ("Krone").
	// Pre: none.
	// Post: none.
	// Return: currencyName ("Krone").
	@Override
	public String getCurrencyName() {
		return currencyName;
	}

}
