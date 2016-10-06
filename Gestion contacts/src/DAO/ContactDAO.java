package DAO;


import org.hibernate.Session;

import DAO_Interfaces.ContactDAOInt;
import domain.Address;
import domain.Contact;
import util.HibernateUtil;


public class ContactDAO implements ContactDAOInt{
	
	public void AddContact (Contact contact){
		
		Address add = contact.getAdd();
		
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();    
		session.beginTransaction();            
		session.save(contact);  
		session.save(add);

		contact=(Contact) session.load(Contact.class, contact.getId());   
		session.getTransaction().commit();
		//session.close();
	}

	@Override
	public void UpdateContact(Contact contact) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();    
		session.beginTransaction();            
		session.update(contact);   
		session.getTransaction().commit();
	}

	@Override
	public void RemoveContact(Contact contact) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();    
		session.beginTransaction();            
		session.delete(contact);   
		session.getTransaction().commit();
		//session.close();
		
	}

	@Override
	public void SearchContact(Contact contact) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();    
		session.beginTransaction();                       
		contact=(Contact) session.get(Contact.class, contact.getId());   
		session.getTransaction().commit();
		
		System.out.println("ID Contact: "+contact.getId() +" Prenom: "+contact.getFirstName() +" Nom: "+contact.getLastName() +" Email: "+ contact.getEmail());		
	}

}
