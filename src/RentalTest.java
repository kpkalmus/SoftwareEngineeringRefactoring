import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RentalTest {

	Movie movie;
	int days = 10;
	Rental rental;
	
	@Before
	public void setUp() {
		movie = new Movie("MovieTitle", 0);
		rental = new Rental(movie, days);
	}
	
	@Test
	public void daysRentedTest() {
		assertEquals(days, rental.getDaysRented());
	}
	
	@Test
	public void movieTest() {
		assertEquals(movie, rental.getMovie());
	}
	
}