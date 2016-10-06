package servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ContactDAO;
import domain.Address;
import domain.Contact;
import domain.PhoneNumber;

/**
 * Servlet implementation class AddContactServlet
 */
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Contact contact = new Contact(request.getParameter("prenom"),request.getParameter("nom"),request.getParameter("mail"));
		Address add = new Address(request.getParameter("street"),request.getParameter("city"),request.getParameter("country"),request.getParameter("zip"));
		
		PhoneNumber phone1 = new PhoneNumber("mobile",request.getParameter("mobile"));
		phone1.setContact(contact);
		PhoneNumber phone2 = new PhoneNumber("maison",request.getParameter("maison"));
		phone2.setContact(contact);
		PhoneNumber phone3 = new PhoneNumber("bureau",request.getParameter("bureau"));
		phone3.setContact(contact);
		
		contact.getProfiles().add(phone1);
		contact.getProfiles().add(phone2);
		contact.getProfiles().add(phone3);
		
		/*Set<PhoneNumber> profiles = new HashSet();
		profiles.add(phone1);
		profiles.add(phone2);
		profiles.add(phone3);
		
		contact.setProfiles(profiles);	*/	
		contact.setAdd(add);
		
		ContactDAO DAO = new ContactDAO();
		DAO.AddContact(contact);
		
		RequestDispatcher rd = request.getRequestDispatcher("Main.jsp");
		rd.forward(request, response);
	}

}
