package geso.traning.servlets.donhang;

import geso.dms.center.util.Utility;
import geso.traning.bean.donhang.IDonHang;
import geso.traning.bean.donhang.IDonhangList;
import geso.traning.bean.donhang.imp.DonHang;
import geso.traning.bean.donhang.imp.DonhangList;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DonhangSvl
 */
@WebServlet("/DonhangSvl")
public class DonhangSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DonhangSvl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		String trangthaitimkiem="1";
		// khởi tạo đơn hàng
		IDonhangList obj = new DonhangList();
		obj.setUserId(userId);
		obj.init();
		Utility util = new Utility();
		String querystring = request.getQueryString();
		String userId1 = util.getUserId(querystring); // lấy thông tin của user

		if (userId1.length() == 0)
			userId1 = util.antiSQLInspection(request.getParameter("userId"));
		String action = util.getAction(querystring);
		String maDonHang = util.getId(querystring); // lấy id
		//
		System.out.println("action" + action + " madh " + maDonHang);
		if (action.equals("accounting")) {
			IDonHang donhang = new DonHang();
			donhang.setId(maDonHang);
			donhang.capnhattrangthai(maDonHang);
			obj.setUserId(userId);
			obj.init();
			// khởi tạo ra 1 session

		}
		session.setAttribute("trangthaitimkiem", trangthaitimkiem);
		session.setAttribute("obj", obj);
		String nextJSP = "/TrainingGESO/pages/Erp/donhanglist.jsp";
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
		String trangthaitimkiem="1";
		String userId = (String) session.getAttribute("userId");
		String userName = "hieu";
		String action = request.getParameter("action");
		session.setAttribute("trangthaitimkiem", trangthaitimkiem);
		if (action == null) {
			action = "";
		}
		if (action.equals("new")) {
			IDonHang obj = new DonHang();
			obj.setUserId(userId);
			session.setAttribute("uName", userName);
			session.setAttribute("obj", obj);
			String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew.jsp";
			response.sendRedirect(nextJSP);
		}
	/*	if (action.equals("timkiem")) {
			IDonhangList obj = new DonhangList();
			obj.setUserId(userId);
			String makhach = request.getParameter("khId");
			System.out.print(makhach+"00");
			obj.setKhachhang(makhach);
			if(makhach!="")
			{obj.init(makhach);}
			else
				obj.init();
			session.setAttribute("obj", obj);
			String nextJSP = "/TrainingGESO/pages/Erp/donhanglist.jsp";
			response.sendRedirect(nextJSP);
		}*/
		if (action.equals("timkiemdulieu")) {
			IDonhangList obj = new DonhangList();
			obj.setUserId(userId);
			//lay ngay va makh
			String tungay=request.getParameter("tungay");
			String denngay=request.getParameter("denngay");
			String sodonhang=request.getParameter("sodonhang");
			String makh="";
			makh=request.getParameter("khId");
			obj.setKhachhang(makh);
			obj.setSodonhang(sodonhang);
			obj.Findata(tungay, denngay);
			trangthaitimkiem="0";
			session.setAttribute("obj", obj);
			session.setAttribute("trangthaitimkiem", trangthaitimkiem);
			String nextJSP = "/TrainingGESO/pages/Erp/donhanglist.jsp";
			response.sendRedirect(nextJSP);
		}
		if (action.equals("clear")) {
			IDonhangList obj = new DonhangList();
			obj.setUserId(userId);
			obj.init();
			//lay ngay va makh
			trangthaitimkiem="1";
			session.setAttribute("obj", obj);
			session.setAttribute("trangthaitimkiem", trangthaitimkiem);
			String nextJSP = "/TrainingGESO/pages/Erp/donhanglist.jsp";
			response.sendRedirect(nextJSP);
		}
		
	}

}
