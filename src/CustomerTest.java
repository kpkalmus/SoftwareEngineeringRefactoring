import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void statementTest() {
		Customer customer = new Customer("Horst");
		Movie m1 = new Movie("a",0);
		Movie m2 = new Movie("b",1);
		Movie m3 = new Movie("c",2);
		
		Rental r1 = new Rental(m1,4);
		Rental r2 = new Rental(m2,5);
		Rental r3 = new Rental(m3,6);
		
		customer.addRental(r1);
		customer.addRental(r2);
		customer.addRental(r3);
		
		String expect = "Rental Record for Horst\n" +
						"\tTitle		Days	Amount\n" +
						"\ta		4	5.0\n" +
						"\tb		5	15.0\n" +
						"\tc		6	6.0\n" +
						"Amount owed is 26.0\n" +
						"You earned 4 frequent renter points";
		
		assertEquals(expect, customer.statement());
	}
	
}