package geso.traning.servlets.donhang;

import geso.dms.center.util.Utility;
import geso.training.SP.ISanPham;
import geso.training.SP.imp.Sanpham;
import geso.traning.bean.donhang.IDonHang;
import geso.traning.bean.donhang.IDonhangList;
import geso.traning.bean.donhang.imp.DonHang;
import geso.traning.bean.donhang.imp.DonhangList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DonhangUpdateSvl
 */
@WebServlet("/DonhangUpdateSvl")
public class DonhangUpdateSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String iddonhang;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DonhangUpdateSvl() {
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		HttpSession session = request.getSession();
		String test = (String) session.getAttribute("uName");
		System.out.println("test " + test);
		Utility util = new Utility();
		String querystring = request.getQueryString();
		String userId = util.getUserId(querystring); // lấy thông tin của user

		if (userId.length() == 0)
			userId = util.antiSQLInspection(request.getParameter("userId"));

		String action = util.getAction(querystring);
		String maDonHang = util.getId(querystring); // lấy id
		iddonhang = maDonHang;

		System.out.println(action);
		/*
		 * IDonHang obj = new DonHang(); obj.setId(maDonHang); obj.init();
		 * session.setAttribute("action", "display");
		 * session.setAttribute("objnew", obj); String nextJSP =
		 * "/TrainingGESO/pages/Erp/DonHangNew.jsp";
		 * response.sendRedirect(nextJSP);
		 */

		if (action.equals("update")) {
			IDonHang obj = new DonHang();
			obj.setId(maDonHang);
			obj.init();
			obj.setTestthu("HIEU");
			//
			System.out.println(obj.getIdKH());
			//
			// for(ISanPham tam:obj.getListSP()){
			// System.out.println(tam.getMasanpham() );
			//
			// }
			session.setAttribute("obj", obj);
			String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew.jsp";
			response.sendRedirect(nextJSP);
		}
		if (action.equals("coppy")) {
			IDonHang obj = new DonHang();
			obj.setId(maDonHang);
			obj.init();
			obj.setTestthu("coppy");
			//
			System.out.println(obj.getIdKH());
			//
			// for(ISanPham tam:obj.getListSP()){
			// System.out.println(tam.getMasanpham() );
			//
			// }
			session.setAttribute("obj", obj);
			String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew.jsp";
			response.sendRedirect(nextJSP);
		}

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
		Utility util = new Utility();

		HttpSession session = request.getSession();
		String userId = util.antiSQLInspection(request.getParameter("userId"));
		String action = request.getParameter("action");
		System.out.println(action);
		action = (action == null) ? "" : action;

		IDonHang donHang = new DonHang();
		donHang.CreateRsKhachHang();
		donHang.setUserId(userId);
		String msg = "";

		// System.out.println(maDonHang);
		/*
		 * String maKhachHang =
		 * util.antiSQLInspection(request.getParameter("smartId"));
		 * donHang.setMaKH(maKhachHang);
		 */
		String ngayChungTu = util.antiSQLInspection(request
				.getParameter("tungay"));
		donHang.setNgayTao(ngayChungTu == null ? "" : ngayChungTu);

		String tongTien = util.antiSQLInspection(request
				.getParameter("SoTienCoVAT"));
		String tongtientam = tongTien.replaceAll(",", "");
		System.out.print(tongtientam);
		donHang.setTongTien(Float.parseFloat(tongtientam));

		donHang.setMsg(msg);
		// -------------------------------------------------

		if (action.equals("luumoi")) {
			// gan text
			donHang.setUserId(userId);
			String tungay = util.antiSQLInspection(request
					.getParameter("tungay"));
			donHang.setNgayTao(tungay);
			String makhachhang = util.antiSQLInspection(request
					.getParameter("khId"));
			donHang.setMaKH(makhachhang);
			String VAT = util.antiSQLInspection(request.getParameter("VAT"));
			donHang.setVAT(VAT);
			String tongTienmattam = tongTien.replaceAll(",", "");
			donHang.setTongTien(Float.parseFloat(tongTienmattam));

			// / quet ma sp tu table
			String[] maSanPham = request.getParameterValues("masp");
			String[] tenSanPham = request.getParameterValues("tensp1");
			String[] soLuong = request.getParameterValues("soluong");
			String[] donViTinh = request.getParameterValues("donvitinh1");
			String[] giaBan = request.getParameterValues("dongia1");
			String[] thanhtien = request.getParameterValues("thanhtien1");
			List<ISanPham> listSP = new ArrayList<ISanPham>();
			if (maSanPham != null) {
				for (int i = 0; i < maSanPham.length; i++) {
					if (tenSanPham[i].trim().length() > 0
							|| maSanPham[i].trim().length() > 0) {
						ISanPham sanPham = new Sanpham(maSanPham[i],
								tenSanPham[i], Integer.parseInt(soLuong[i]),
								donViTinh[i], Float.parseFloat((giaBan[i]).replaceAll(",", "")),
								Double.parseDouble((thanhtien[i]).replaceAll(",", ""))

						);
						listSP.add(sanPham);
					}
				}
			}
			
			donHang.setListSP(listSP);
			
			if (!donHang.save()) {
				// lưu không thành công
				donHang.CreateRsKhachHang();
				session.setAttribute("donHangMoi", donHang);
				String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew.jsp";
				response.sendRedirect(nextJSP);
				System.out.println(donHang.getMsg());
			} else {
				System.out.println(action + "else");

				IDonhangList donHangList = new DonhangList();
				donHangList.init();
				// khởi tạo ra 1 session
				session.setAttribute("uName", "Hieu");
				session.setAttribute("obj", donHangList);
				String nextJSP = "/TrainingGESO/pages/Erp/donhanglist.jsp";
				response.sendRedirect(nextJSP);
			}
		}
		if (action.equals("edit")) {
			// gan text

			donHang.setUserId(userId);
			donHang.setId(iddonhang);
			donHang.init();
			String tungay = util.antiSQLInspection(request
					.getParameter("tungay"));
			donHang.setNgayTao(tungay);
			String VAT = util.antiSQLInspection(request.getParameter("VAT"));
			donHang.setVAT(VAT);
			String tongTienmattam = tongTien.replaceAll(",", "");
			donHang.setTongTien(Float.parseFloat(tongTienmattam));

			// / quet ma sp tu table
			String[] maSanPham = request.getParameterValues("masp");
			String[] tenSanPham = request.getParameterValues("tensp1");
			String[] soLuong = request.getParameterValues("soluong");
			String[] donViTinh = request.getParameterValues("donvitinh1");
			String[] giaBan = request.getParameterValues("dongia1");
			String[] thanhtien = request.getParameterValues("thanhtien1");
			List<ISanPham> listSP = new ArrayList<ISanPham>();
			if (maSanPham != null) {
				for (int i = 0; i < maSanPham.length; i++) {
					if (tenSanPham[i].trim().length() > 0
							|| maSanPham[i].trim().length() > 0) {
						ISanPham sanPham = new Sanpham(maSanPham[i],
								tenSanPham[i], Integer.parseInt(soLuong[i]),
								donViTinh[i], Float.parseFloat((giaBan[i]).replaceAll(",", "")),
								Double.parseDouble((thanhtien[i]).replaceAll(",", ""))
						);
						listSP.add(sanPham);
					}
				}
			}
			donHang.setListSP(listSP);
			if (!donHang.update()) {
				// lưu không thành công
				donHang.CreateRsKhachHang();
				session.setAttribute("donHangMoi", donHang);
				String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew.jsp";
				response.sendRedirect(nextJSP);
				System.out.println(donHang.getMsg());
			} else {
				System.out.println(action + "else");
				IDonhangList donHangList = new DonhangList();
				donHangList.init();
				// khởi tạo ra 1 session
				session.setAttribute("obj", donHangList);
				String nextJSP = "/TrainingGESO/pages/Erp/donhanglist.jsp";
				response.sendRedirect(nextJSP);
			}
		} else {
			donHang.CreateRsKhachHang();
			IDonhangList donHangList = new DonhangList();
			donHangList.init();
			session.setAttribute("obj", donHangList);
			String nextJSP = "/TrainingGESO/pages/Erp/donhanglist.jsp";
			response.sendRedirect(nextJSP);
		}
	}
}
