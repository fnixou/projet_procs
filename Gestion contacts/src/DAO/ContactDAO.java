package DAO;

import DAO_Interfaces.ContactDAOInt;
import domain.Contact;


public class ContactDAO implements ContactDAOInt{
	
	public void AddContact (Contact contact){
		System.out.println("Contact: "+contact);
	}

	@Override
	public void UpdateContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveContact(Contact c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

}
