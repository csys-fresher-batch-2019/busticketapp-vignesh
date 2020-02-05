package BusTicket.BusList;


	public class ListOfBuses extends BusTicketManagerImplimentation {
		
		public int BusNo;
		public String BusName;
		public String BusSource;
		public String BusDestination;
		public String Class;
		@Override
		public String toString() {
			return "ListOfBuses [BusNo=" + BusNo + ", BusName=" + BusName + ", BusSource=" + BusSource + ", BusDestination="
					+ BusDestination + ", Class=" + Class + "]";
			
		}
		
	
}
//out.println("<tr><td>"+i++ +"</td><td>"+in.BusName+"</td><td>"+in.BusNo+"</td><td>"+in.Class+"</td></thead>");