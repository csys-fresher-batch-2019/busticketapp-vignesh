package BusTicket.BusTiming;

import java.util.ArrayList;
import java.util.List;


public class TestlistBusTiming {

	public static void main(String[] args) throws Exception {
		BusTimingIplementation impl= new BusTimingIplementation();
		List<ListBusTiming> List=new ArrayList<ListBusTiming>();
		List=impl.BustimeDetails();
		for (ListBusTiming busdetail : List) {
			System.out.println(busdetail);
		}
	}

}
