package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ContactDAO;
import domain.Contact;

/**
 * Servlet implementation class UpdateContactServlet
 */
public class UpdateContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateContactServlet() {
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
		
		
		String id;
		id = request.getParameter("idContact");
		
		Contact c = new Contact(request.getParameter("prenom"),request.getParameter("nom"),request.getParameter("mail"));
		
		c.setId(Long.valueOf(id).longValue());
		
		ContactDAO DAO = new ContactDAO();
		DAO.UpdateContact(c);
		
		RequestDispatcher rd = request.getRequestDispatcher("Main.jsp");
		rd.forward(request, response);
		
	}

}
