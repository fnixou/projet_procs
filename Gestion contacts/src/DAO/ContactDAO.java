package DAO;


import org.hibernate.Query;
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
		/*session.save(contact);  
		session.save(add);*/
		session.persist(contact);

		//contact=(Contact) session.load(Contact.class, contact.getId());   
		session.getTransaction().commit();
		//session.close();
	}

	@Override
	public void UpdateContact(Contact contact) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();    
		session.beginTransaction();            
		//session.update(contact);  
		
		 String hql = "UPDATE Contact set" 
			      +" firstName = :FIRSTNAME,"
			      +" lastName = :LASTNAME,"
			      +" email = :EMAIL"
			      +" WHERE id = :ID_CONTACT";
			  Query query = session.createQuery(hql);
			  query.setParameter("FIRSTNAME", contact.getFirstName());
			  query.setParameter("LASTNAME", contact.getLastName());
			  query.setParameter("EMAIL", contact.getEmail());
			  query.setParameter("ID_CONTACT", contact.getId());
			  query.executeUpdate();
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
