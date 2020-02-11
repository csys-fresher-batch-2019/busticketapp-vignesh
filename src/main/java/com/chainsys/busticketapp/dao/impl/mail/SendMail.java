package com.chainsys.busticketapp.dao.impl.mail;
import java.io.IOException;

import com.chainsys.busticketapp.DBException;

public class SendMail {
public static void main(String[] args) throws IOException, DBException {    

Mail.send("sivanathan011198@gmail.com","8608872041","sivanathan1998@gmail.com"," Your Ticket is Booked ","Thanks for using this application",1001);
}
}
