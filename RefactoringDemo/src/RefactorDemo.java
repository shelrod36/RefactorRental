
public class RefactorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Movie cars=new Movie("Cars",0);
			Customer customer= new Customer("Tim");
			Rental movieRated=new Rental(cars,7);
			customer.addRental(movieRated);
			System.out.println(customer.statement());
	}

}
