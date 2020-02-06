package busticket.buslist;

import java.util.HashMap;
import java.util.Set;

public class TestNoOfBuslist {

	public static void main(String[] args) throws Exception {
		BusTicketManagerImplimentation Busimpl = new BusTicketManagerImplimentation();
		HashMap<String, Integer> names = Busimpl.noOfBuslist();
		Set<String> keyset = names.keySet();
		System.out.println("Bus No | Bus Name");
		System.out.println("-------------------");
		for (String name : keyset) {
			int num = names.get(name);
			// System.out.println( "Bus No: " +num + ",Bus Name: "+name );
			System.out.println(num + "\t" + name);
		}

	}

}
