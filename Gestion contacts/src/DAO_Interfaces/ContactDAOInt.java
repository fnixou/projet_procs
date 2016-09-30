package DAO_Interfaces;

import domain.Contact;
import services.ContactService;

public interface ContactDAOInt {
	
	public void AddContact(Contact contact);
	
	public void UpdateContact(Contact contact);
	
	public void RemoveContact(Contact contact);
	
	public void SearchContact(Contact contact);
	
}
