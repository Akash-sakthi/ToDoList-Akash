package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import dto.User;
@WebServlet("/userlogin")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		DAO dao = new DAO();
		
		try {
			User u = dao.findByEmail(email);
			
			if (u != null) {
				//password validation
				if (u.getUserpassword().equals(password)) {
					//login success
					//create session and set data
					HttpSession session = req.getSession();
					session.setAttribute("user",u);
					req.getRequestDispatcher("home.jsp").include(req, resp);
				} else {
					//password mismatch
					req.setAttribute("message", "password is wrong");
					req.getRequestDispatcher("login.jsp").include(req, resp);

				}
			} else {
				//wrong the email
				req.setAttribute("message", "email is wrong");
              req.getRequestDispatcher("login.jsp").include(req, resp);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
