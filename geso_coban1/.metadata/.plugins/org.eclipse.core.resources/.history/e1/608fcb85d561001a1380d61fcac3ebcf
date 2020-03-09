package geso.training.servlets.hocsinh;

import geso.dms.center.util.Utility;
import geso.erp.beans.THONTINHOCSINH.IHoSoTuVanUpdate;
import geso.erp.beans.THONTINHOCSINH.IHoSoUpdate;
import geso.erp.beans.THONTINHOCSINH.IHocSinhList;
import geso.erp.beans.THONTINHOCSINH.imp.HoSoTuVanUpdate;
import geso.erp.beans.THONTINHOCSINH.imp.HoSoUpdate;
import geso.training.bean.hocsinh.IhocSinh;
import geso.training.bean.hocsinh.IhocSinhList;
import geso.training.bean.hocsinh.imp.HocSinh;
import geso.training.bean.hocsinh.imp.HocSinhList;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HocSinhUpdateSvl
 */
@WebServlet("/HocSinhUpdateSvl")
public class HocSinhUpdateSvl extends HttpServlet {
	private String MAHSS;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HocSinhUpdateSvl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		// dung để điều hướng
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		Utility util = new Utility();
		String querystring = request.getQueryString();
		String userId = util.getUserId(querystring);
		System.out.println("day la user " + userId);
		if (userId.length() == 0)
			userId = util.antiSQLInspection(request.getParameter("userId"));
		String action = util.getAction(querystring);
		System.out.println("day la action " + action);
		String Id = util.getId(querystring);
		MAHSS=Id;
		

		if (action.equals("display")) {
			response.sendRedirect("/TrainingGESO/pages/Erp/HocsinhNew.jsp");
		} else if (action.equals("update")) {
			IhocSinh hocsinh = new HocSinh();
			hocsinh.setUserId(userId);
			hocsinh.setMaHS(MAHSS);
			hocsinh.Findnameid();
			System.out.println(hocsinh.getTenHS());
			hocsinh.getTenHS();
			hocsinh.creates();
			session.setAttribute("hocsinh", hocsinh);
			String nextJSP = "/TrainingGESO/pages/Erp/HocsinhNew.jsp";
			response.sendRedirect(nextJSP);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		// Khởi tạo session
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		String userName = (String) session.getAttribute("userTen");
		//
		IhocSinh hocsinh = new HocSinh();
		hocsinh.setUserId(userId);
		hocsinh.setUserName(userName);
		String maLop = request.getParameter("lop");
		String tenHS = request.getParameter("tenhocsinh");
		hocsinh.setMaLop(maLop);
		hocsinh.setTenHS(tenHS);
		hocsinh.setMaHS(MAHSS);
		// lấy giá trị action
		String action = request.getParameter("action");
		if (action == null) {
			action = "";
		}
		if (action.equals("luumoi")) {
			// ham lưu
			// nếu lưu không thanh công trả ve trang tạo mới
			if (hocsinh.Save()) {
				hocsinh.creates();
				// truyen gia trị den trang view
				IhocSinhList obj = new HocSinhList();
				obj.setUserId(userId);
				obj.setUserName(userName);
				// lấy dữ liệu danh sách lớp
				obj.init();
				obj.creates();
				// chuyển thông tin ra trang view
				session.setAttribute("obj", obj);
				String nextJSP = "/TrainingGESO/pages/Erp/Hocsinhlist.jsp";
				response.sendRedirect(nextJSP);
				
			}
			// lưu thanh cong trả về trang tổng
			else {
				// Khởi tạo Lớp học sinh
				session.setAttribute("hocsinh", hocsinh);
				String nextJSP = "/TrainingGESO/pages/Erp/HocsinhNew.jsp";
				response.sendRedirect(nextJSP);
			}
		}
		if (action.equals("chinhsua")) {
			// ham lưu
			// lưu thanh cong trả về trang tổng
			if (hocsinh.Edit()) {
				hocsinh.creates();
				// truyen gia trị den trang view
				IhocSinhList obj = new HocSinhList();
				obj.setUserId(userId);
				obj.setUserName(userName);
				// lấy dữ liệu danh sách lớp
				obj.init();
				obj.creates();
				session.setAttribute("obj", obj);
				String nextJSP = "/TrainingGESO/pages/Erp/Hocsinhlist.jsp";
				response.sendRedirect(nextJSP);
			}
			// nếu lưu không thanh công trả ve trang tạo mới
			else {
				// Khởi tạo Lớp học sinh
				IhocSinhList obj = new HocSinhList();
				obj.setUserId(userId);
				obj.setUserName(userName);
				// lấy dữ liệu danh sách lớp
				obj.init();
				obj.creates();
				// chuyển thông tin ra trang view
				session.setAttribute("obj", obj);
				String nextJSP = "/TrainingGESO/pages/Erp/Hocsinhlist.jsp";
				response.sendRedirect(nextJSP);
			}
		}

	}

}
