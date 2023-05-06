// Lab 2 - Classes, Inheritance, and Polymorphism
// Alexander Mochizuki, partnered with Saranya Kolachana
// Simulates currency

package lab2;

public class Soum extends Currency {
	private final String currencyName = "Soum";
	
	public Soum() {
		super();
	}
	
	public Soum(double amt) throws Exception {
		super(amt);
	}
	
	// Gets currencyName ("Soum").
	// Pre: none.
	// Post: none.
	// Return: currencyName ("Soum").
	@Override
	public String getCurrencyName() {
		return currencyName;
	}
	
}
