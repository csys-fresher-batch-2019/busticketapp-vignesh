package com.chainsys.busticketapp.dao.impl.mail;
import java.io.IOException;

import com.chainsys.busticketapp.DBException;
import com.chainsys.busticketapp.model.ListReservation;

public class SendMail {
public static void main(String[] args) throws IOException, DBException {    
	ListReservation obj = new ListReservation();
Mail.send("vignesh280519@gmail.com","6369541046","vigneshn1995@gmail.com"," Your Ticket is Booked ","Thanks for using this application",obj.getPassengerId());
}
}
