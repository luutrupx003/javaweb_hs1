package geso.training.servlets.hocsinh;

import geso.dms.center.util.Utility;
import geso.training.bean.hocsinh.IhocSinh;
import geso.training.bean.hocsinh.IhocSinhList;
import geso.training.bean.hocsinh.imp.HocSinh;
import geso.training.bean.hocsinh.imp.HocSinhList;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HocSinhSvl
 */
@WebServlet("/HocSinhSvl")
public class HocSinhSvl extends HttpServlet {
	private String MSHS;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HocSinhSvl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		// Khởi tạo session
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		String userName = (String) session.getAttribute("username");
		// Khởi tạo lớp của học sinh
		IhocSinhList obj = new HocSinhList();
		obj.setUserId(userId);
		obj.setUserName(userName);
		// Lấy dữ liệu danh sách lớp
		obj.init(); // Quan trọng ==> khởi tạo chính (danh sách hiện trên table)
		obj.creates(); // Tạo những cái dánh sách phụ hỗ trợ (mã lớp)
		// Chuyển thông tin ra view

		// /
		Utility util = new Utility();
		String querystring = request.getQueryString();
		if (userId.length() == 0)
			userId = util.antiSQLInspection(request.getParameter("userId"));
		String action = util.getAction(querystring);
		String Id = util.getId(querystring);
		MSHS = Id;

		IhocSinh hocsinh = new HocSinh();
		hocsinh.setMaHS(MSHS);
		System.out.println("day la action " + action + " day la id " + Id);
		if (action.equals("xoa")) {
			hocsinh.Delete();
			obj.setUserId(userId);
			obj.setUserName(userName);
			// Lấy dữ liệu danh sách lớp
			obj.init(); // Quan trọng ==> khởi tạo chính (danh sách hiện trên table)
			obj.creates(); // Tạo những cái dánh sách phụ hỗ trợ (mã lớp)
		}
		session.setAttribute("obj", obj);
		String nextJSP = "/TrainingGESO/pages/Erp/Hocsinhlist.jsp";
		response.sendRedirect(nextJSP);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		// Khởi tạo session
		HttpSession session = request.getSession();

		String userId = (String) session.getAttribute("userId");
		String userName = (String) session.getAttribute("userTen");

		// Lấy action
		String action = request.getParameter("action");
		System.out.println("day la <<<<action " + action);
		if (action == null) {
			action = "";
		}
		if (action.equals("taomoi")) {
			IhocSinh hocsinh = new HocSinh();
			hocsinh.setUserId(userId);
			hocsinh.creates();
			session.setAttribute("hocsinh", hocsinh);
			String nextJSP = "/TrainingGESO/pages/Erp/HocsinhNew.jsp";
			response.sendRedirect(nextJSP);
		} else {//quet ma lop action khac ơ day chinh là timkiem
			String maLop = request.getParameter("lop");
			IhocSinhList obj = new HocSinhList();
			obj.setUserName(userName);
			obj.setUserId(userId);
			obj.setMaLop(maLop);
			obj.init();
			obj.creates();
			session.setAttribute("obj", obj);
			String nextJSP = "/TrainingGESO/pages/Erp/Hocsinhlist.jsp";
			response.sendRedirect(nextJSP);
		}


	}

}
