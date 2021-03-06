package geso.training.bean.hocsinh.imp;

import geso.erp.db.sql.dbutils;
import geso.training.bean.hocsinh.ihocSinh;

import java.sql.ResultSet;

public class HocSinh implements ihocSinh {

	private String MaHS;
	@Override
	public String getMaHS() {
		return MaHS;
	}

	@Override
	public String getTenHS() {
		return TenHS;
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
	public void setMaHS(String maHS) {
		MaHS = maHS;
	}

	@Override
	public void setTenHS(String tenHS) {
		TenHS = tenHS;
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

	private String TenHS;
	private String MaLop;
	private String UserId;
	private String UserName;
	ResultSet RsLop;
	dbutils db;
	
	public HocSinh() {
		this.MaHS = "";
		this.TenHS = "";
		this.MaLop = "";
		db = new dbutils();
	}
	
	@Override
	public void DBClose() {
		try {
			if(this.RsLop != null)
				this.RsLop.close();
			if(this.db != null)
				this.db.shutDown();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void creates() {
		String query = "Select PK_SEQ, TENLOP from LOP";
		this.RsLop = this.db.get(query);
	}
	
	@Override
	public boolean Save() {
		String query="insert into HocSinh(TenHS, LOP) values(N'"+this.TenHS+"', '"+this.MaLop+"')";
		return this.db.update(query);
	}
	
	@Override
	public boolean Delete() {
		String query="Delete from HocSinh where MaHS='"+this.MaHS+"'";
		return this.db.update(query);
	}
	
	@Override
	public boolean Edit() {
		String query = "";
		if(this.MaLop==""&&this.TenHS!="") {
			query = "update HocSinh set TenHS=N'"+this.TenHS+"' where MaHS='"+this.MaHS+"'";
		}
		if(this.TenHS==""&&this.MaLop!="") {
			query = "update HocSinh set LOP='"+this.MaLop+"' where MaHS='"+this.MaHS+"'";
		}
		if(this.TenHS!="" && this.MaLop!="") {
			query = "update HocSinh set TenHS=N'"+this.TenHS+"', LOP='"+this.MaLop+"' where MaHS='"+this.MaHS+"'";
		}
		return this.db.update(query);
	}
	
	@Override
	public void Findnameid() {
		try {
			String query;
			query = "Select TenHS, Lop from HocSinh where MaHS='"+this.MaHS+"'";
			
			ResultSet rs = this.db.get(query);
			if(rs != null) {
				while(rs.next()) {
					this.TenHS = rs.getString("TenHS");
					this.MaLop = rs.getString("Lop");
				}
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
