package geso.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DangKiSvl
 */
@WebServlet("/DangKiSvl")
public class DangKiSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DangKiSvl() {
    	
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String hoTen = request.getParameter("hoTen");
		String email =request.getParameter("email");
		
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.setAttribute("hoTen", hoTen);
		request.setAttribute("email", email);
		RequestDispatcher dis = request.getRequestDispatcher("KetQuaDangKi.jsp");
		dis.forward(request, response);
	}

}
