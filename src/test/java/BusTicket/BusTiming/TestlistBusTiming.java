package busticket.bustiming;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.busticketapp.model.ListBusTiming;


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
