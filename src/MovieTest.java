import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MovieTest {

	@Test
	public void titleTest() {
		String title = "MovieTitle";
		Movie movie = new Movie(title, 0);
		assertEquals(title, movie.getTitle());
	}
	
	@Test
	public void priceCodeTest() {
		int priceCode = 1;
		Movie movie = new Movie("MovieTitle", priceCode);
		priceCode = 0;
		movie.setPriceCode(priceCode);
		assertEquals(priceCode, movie.getPriceCode());
	}
	
}