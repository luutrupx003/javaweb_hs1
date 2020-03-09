package geso.training.bean.hocsinh.imp;

import geso.erp.db.sql.dbutils;
import geso.training.bean.hocsinh.ihocSinhList;

import java.sql.ResultSet;

public class HocSinhList implements ihocSinhList {

	private String MaHocSinh;
	@Override
	public String getMaHocSinh() {
		return MaHocSinh;
	}

	@Override
	public String getTenHocSinh() {
		return TenHocSinh;
	}

	@Override
	public String getMaLop() {
		return MaLop;
	}

	@Override
	public String getUserId() {
		return UserId;
	}

	@Override
	public String getUserName() {
		return UserName;
	}

	@Override
	public ResultSet getRsLop() {
		return RsLop;
	}

	@Override
	public ResultSet getRsHocSinhList() {
		return RsHocSinhList;
	}

	@Override
	public void setMaHocSinh(String maHocSinh) {
		MaHocSinh = maHocSinh;
	}

	@Override
	public void setTenHocSinh(String tenHocSinh) {
		TenHocSinh = tenHocSinh;
	}

	@Override
	public void setMaLop(String maLop) {
		MaLop = maLop;
	}

	@Override
	public void setUserId(String userId) {
		UserId = userId;
	}

	@Override
	public void setUserName(String userName) {
		UserName = userName;
	}

	@Override
	public void setRsLop(ResultSet rsLop) {
		RsLop = rsLop;
	}

	@Override
	public void setRsHocSinhList(ResultSet rsHocSinhList) {
		RsHocSinhList = rsHocSinhList;
	}
	private String TenHocSinh;
	private String MaLop;
	private String UserId;
	private String UserName;
	private ResultSet RsLop;
	private ResultSet RsHocSinhList;
	dbutils db;
	
	public HocSinhList() {
		this.MaHocSinh = "";
		this.TenHocSinh = "";
		this.MaLop = "";
		this.db = new dbutils();
	}
	
	@Override
	public void creates() {
		String query = "select PK_SEQ, TENLOP from LOP";
		this.RsLop = this.db.get(query);
	}
	@Override
	public void DBClose() {
		try {
			if(this.RsLop != null)
				this.RsLop.close();
			if(this.RsHocSinhList != null)
				this.RsHocSinhList.close();
			if(this.db != null)
				this.db.shutDown();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	@Override
	public void init()
	{
	String query="select a.MAHS, a.TENHS, b.TENLOP from HOCSINH a inner join LOP b on a.LOP=b.PK_SEQ";
	//Xóa khoảng trắng trước và sau chuỗi trim()
	if (this.MaLop.trim().length()>0)
		query+=" and a.LOP="+this.MaLop;	
	this.RsHocSinhList=this.db.get(query);
	}
	
}
