// Lab 2 - Classes, Inheritance, and Polymorphism
// Alexander Mochizuki, partnered with Saranya Kolachana
// Simulates currency

package lab2;

import java.util.Scanner;

public class Lab2main {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Currency[] currencies = new Currency[2];
		currencies[0] = new Soum();
		currencies[1] = new Krone();
		
		char operation = ' ';
		char baseCurrency;
		int i = -1;
		double amtToChange;
		String currencyName;
		
		currencies[0].print();
		currencies[1].print();
		System.out.println();
		
		try {
			//Scanner takes input
			// char, char, dbl, str
			operation = scnr.next().charAt(0);
			operation = Character.toLowerCase(operation);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		while (operation != 'q') {
			// Take base currency, amt, and
			try {
				baseCurrency = scnr.next().charAt(0);
				baseCurrency = Character.toLowerCase(baseCurrency);
				amtToChange = scnr.nextDouble();
				currencyName = scnr.next();
				currencyName = currencyName.toLowerCase();
				// System.out.printf("baseCurrency: %c %namtToChange: %f %ncurrencyName: %s %n", baseCurrency, amtToChange, currencyName);
				
				// System.out.println("Entering switch (baseCurrrency)");
				switch (baseCurrency) {
				case 's':
					i = 0;
					break;
				case 'k':
					i = 1;
					break;
				default:
					System.out.println("I don't have a currency for " + baseCurrency);
				}
				// System.out.println("Exiting switch (baseCurrency)");
			
				Currency operandCurrency = null;
				// System.out.println("Entering switch (currencyName");
				switch (currencyName) {
					case "soum":
						operandCurrency = new Soum(amtToChange);
						break;
					case "krone":
						// System.out.println("case krone");
						operandCurrency = new Krone(amtToChange);
						break;
					default:
						System.out.println("I don't have a currency called "+ currencyName);
				}
				// System.out.println("Exiting switch (currencyName)");
				// System.out.print("operandCurrency: ");
				// operandCurrency.print();
				// System.out.println();
			
				switch (operation) {
					case 'a':
						//Add
						currencies[i].add(operandCurrency);
						break;
					case 's':
						//Subtract
						currencies[i].subtract(operandCurrency);
						break;
					default:
						System.out.println("I don't have a case for " + operation);
				
				}
			} catch (Exception excpt) {
				System.out.println(excpt.getMessage());
			}
				
			// At the end of each operation (besides q for quit), vals prt.
			currencies[0].print();
			currencies[1].print();
			System.out.println();
				
			try {
				operation = scnr.next().charAt(0);
			} catch (Exception getOpExcpt) {
				System.out.println(getOpExcpt.getCause());
				}
			
			// End of while (operation != 'q')
			}
		
			scnr.close();
	}
	

}
