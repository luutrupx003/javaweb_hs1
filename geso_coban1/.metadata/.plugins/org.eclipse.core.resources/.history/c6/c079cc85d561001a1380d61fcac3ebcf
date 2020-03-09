package geso.traning.bean.donhang.imp;

import geso.erp.db.sql.dbutils;
import geso.traning.bean.donhang.IDonhangList;

import java.sql.ResultSet;

public class DonhangList implements IDonhangList {
	String userId;
	String tungay;
	String denngay;
	String trangthai;
	String sodonhang;
	String khachhang;
	String msg;
	ResultSet dhRs;
	ResultSet khRs;

	public ResultSet getDhRs() {
		return dhRs;
	}

	public void setDhRs(ResultSet dhRs) {
		this.dhRs = dhRs;
	}

	public ResultSet getKhRs() {
		return khRs;
	}

	public void setKhRs(ResultSet khRs) {
		this.khRs = khRs;
	}

	dbutils db;

	public DonhangList() {
		this.tungay = "";
		this.denngay = "";
		this.trangthai = "";
		this.sodonhang = "";
		this.khachhang = "";
		this.msg = "";
		this.db = new dbutils();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTungay() {
		return tungay;
	}

	public void setTungay(String tungay) {
		this.tungay = tungay;
	}

	public String getDenngay() {
		return denngay;
	}

	public void setDenngay(String denngay) {
		this.denngay = denngay;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public String getSodonhang() {
		return sodonhang;
	}

	public void setSodonhang(String sodonhang) {
		this.sodonhang = sodonhang;
	}

	public String getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(String khachhang) {
		this.khachhang = khachhang;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void init(String search) {
		if (this.db == null)
			db = new dbutils();
		this.khRs = db
				.get("select b.PK_SEQ,b.TEN from DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO");
		// Lay danh sach donhang
		String query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
				+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO Where a.KHACHHANG_FK='"
				+ search + "'";
		this.dhRs = db.get(query);
	}

	public void DBclose() {
		this.db.shutDown();
	}

	@Override
	public void init() {
		if (this.db == null)
			db = new dbutils();
		this.khRs = db
				.get("select b.PK_SEQ,b.TEN from DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO");
		// Lay danh sach donhang
		String query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
				+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO";
		this.dhRs = db.get(query);
	}

	@Override
	public String Findata(String ngaybd, String ngaykt) {
		if (this.db == null)
			db = new dbutils();
		this.khRs = db.get("select b.PK_SEQ,b.TEN from DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO");
		db = new dbutils();
		// Lay danh sach donhang
		System.out.println(this.khachhang);
		String query = "0";
		
		
		if(this.sodonhang.equals(""))
		{
		if (this.khachhang.equals("123") ||this.khachhang.equals("")||!this.sodonhang.equals("")) {
			if (ngaybd != "" && ngaykt == "") {
				query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
						+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO where a.NGAYTAO>= '"
						+ ngaybd + "'";
			}
			if (ngaykt != "" && ngaybd == "") {
				query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
						+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO where a.NGAYTAO<= '"
						+ ngaykt + "'";
			}
			if (ngaykt != "" && ngaybd != "") {
				query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
						+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO where a.NGAYTAO<= '"
						+ ngaykt + "' and a.NGAYTAO>= '" + ngaybd + "'";
			}
		}
		else {
			if (ngaybd != "" && ngaykt == "") {
				query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
						+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO where a.NGAYTAO>= '"
						+ ngaybd + "' and KHACHHANG_FK='"+this.khachhang+"'";
			}
			if (ngaykt != "" && ngaybd == "") {
				query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
						+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO where a.NGAYTAO<= '"
						+ ngaykt + "' and KHACHHANG_FK='"+this.khachhang+"'";
			}
			if (ngaykt != "" && ngaybd != "") {
				query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
						+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO where a.NGAYTAO<= '"
						+ ngaykt + "' and a.NGAYTAO>= '" + ngaybd + "' and KHACHHANG_FK='"+this.khachhang+"'";
			}
			
			}
			
			
		}
		else{
			query = "select a.PK_SEQ,b.TEN,isnull(a.TONGGIATRI,0) TONGGIATRI , a.TRANGTHAI,a.NGAYNHAP,a.NGAYTAO,c.TEN as NguoiTao, a.NGAYSUA,(case when a.NGAYSUA is not null and a.NGUOISUA is not null then c.TEN else null end)as NGUOISUA "
					+ "\nfrom DONHANG a join ERP_KHACHHANG b on a.KHACHHANG_FK=b.PK_SEQ join NHANVIEN c on c.PK_SEQ=a.NGUOITAO where a.PK_SEQ='"+this.sodonhang+"'";
		
		}
		this.dhRs = db.get(query);
		this.tungay = ngaybd;
		this.denngay = ngaykt;
		return query;
		
	}

}