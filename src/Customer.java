
import java.util.Enumeration;
import java.util.Vector;

class Customer {
	
    private String name;
    private Vector<Rental> rentals = new Vector<>();
    
    public Customer (String newName){
        name = newName;
    };
    
    public void addRental(Rental rental) {
        rentals.addElement(rental);
    };
    
    public String getName (){
        return name;
    };
    
    public String statement() {
        Enumeration<Rental> enum_rentals = rentals.elements();	    
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration<Rental> rentalsEnum = rentals.elements();
		while(rentalsEnum.hasMoreElements()) {
			Rental each = rentalsEnum.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> rentalsEnum = rentals.elements();
		while(rentalsEnum.hasMoreElements()) {
			Rental each = rentalsEnum.nextElement();
			result += each.getCharge();
		}
		return result;
	}

}