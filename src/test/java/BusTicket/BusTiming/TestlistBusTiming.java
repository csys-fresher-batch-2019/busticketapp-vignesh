package busticket.bustiming;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.busticketapp.dao.impl.BusTimingIplementation;
import com.chainsys.busticketapp.model.ListBusTiming;


public class TestlistBusTiming {

	public static void main(String[] args) throws Exception {
		BusTimingIplementation impl= new BusTimingIplementation();
		List<ListBusTiming> list=new ArrayList<ListBusTiming>();
		list=impl.bustimeDetails();
		for (ListBusTiming busdetail : list) {
			System.out.println(busdetail);
		}
	}

}
