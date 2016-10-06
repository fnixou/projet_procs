package DAO;


import org.hibernate.Session;

import DAO_Interfaces.ContactDAOInt;
import domain.Contact;
import util.HibernateUtil;


public class ContactDAO implements ContactDAOInt{
	
	public void AddContact (Contact contact){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();    
		session.beginTransaction();            
		session.save(contact);            
		contact=(Contact) session.load(Contact.class, contact.getId());   
		session.getTransaction().commit();
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
