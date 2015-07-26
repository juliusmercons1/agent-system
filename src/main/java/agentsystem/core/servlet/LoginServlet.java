package agentsystem.core.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agentsystem.core.services.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword"); 
		String userCode = request.getParameter("userCode");
		
		LoginService loginService = new LoginService();
		boolean isAccountValid = loginService.authenticateLogin(userName, userPassword, userCode);
		
		//TODO: Add the values from the XML reply.
		if(isAccountValid){
			response.sendRedirect("accountdetails.jsp");
			return;
		} else {
			response.sendRedirect("login.jsp");
			return;
		}
		
	}

}
