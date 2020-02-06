package busticket.buslist;

public class TestNoOfBuses {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BusTicketManagerImplimentation Busimpl=new BusTicketManagerImplimentation();
		
		int count=Busimpl.noOfBuses();
		System.out.println(count);
	

	}

}
