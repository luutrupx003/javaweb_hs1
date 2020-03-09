package geso.training.bean.hocsinh.imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import sun.invoke.empty.Empty;
import geso.erp.db.sql.dbutils;
import geso.training.bean.hocsinh.IhocSinh;

public class HocSinh implements IhocSinh {
	private String MaHS;
	private String TenHS;
	private String MaLop;
	private String UserId;
	private String UserName;
	ResultSet Rslop;
	dbutils db;
	public HocSinh()
	{
	this.MaHS="";
	this.TenHS="";
	this.MaLop="";
	db=new dbutils();
	}
	
	@Override
	public String getMaHS() {
		// TODO Auto-generated method stub
		return MaHS;
	}

	@Override
	public void setMaHS(String MaHS) {
		// TODO Auto-generated method stub
		this.MaHS=MaHS;
		
	}

	@Override
	public String getTenHS() {
		// TODO Auto-generated method stub
		return TenHS;
	}

	@Override
	public void setTenHS(String TenHS) {
		// TODO Auto-generated method stub
		this.TenHS=TenHS;
		
	}

	@Override
	public String getMaLop() {
		// TODO Auto-generated method stub
		return MaLop;
	}

	@Override
	public void setMaLop(String MaLop) {
		// TODO Auto-generated method stub
		this.MaLop=MaLop;
		
	}

	@Override
	public String getUserId() {
		// TODO Auto-generated method stub
		return UserId;
	}

	@Override
	public void setUserId(String UserId) {
		// TODO Auto-generated method stub
		this.UserId=UserId;
		
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return UserName;
	}

	@Override
	public void setUserName(String UserName) {
		// TODO Auto-generated method stub
		this.UserName=UserName;
		
	}

	@Override
	public ResultSet getRsLop() {
		// TODO Auto-generated method stub
		return Rslop;
	}

	@Override
	public void setRslop(ResultSet rsLop) {
		// TODO Auto-generated method stub
		this.Rslop=rsLop;
		
	}

	@Override
	public void DBClose() {
		// TODO Auto-generated method stub
		try{
			if(this.Rslop != null) this.Rslop.close();
			if(this.db != null) this.db.shutDown();
			}catch(Exception e){}
	}
	public void creates()
	{
		String query= "select PK_SEQ,TENLOP from LOP";
		this.Rslop=this.db.get(query);
	}
	public boolean Save()
	{
	String query="insert into HocSinh(TENHS,LOP) values(N'"+this.TenHS+"','"+this.MaLop+"')";
	return this.db.update(query);
	}
	public boolean Delete()
	{
	String query="Delete from Hocsinh where MAHS='"+this.MaHS+"'";
	return this.db.update(query);
	}
	public boolean Edit()
	{
		String query="";
		if(this.MaLop==""&&this.TenHS!=""){
			query="update HocSinh set TENHS=N'"+this.TenHS+"'where MAHS='"+this.MaHS+"'";
		}
		if(this.TenHS==""&&this.MaLop!=""){
			 query="update HocSinh set LOP='"+this.MaLop+"' where MAHS='"+this.MaHS+"'";
		}
		if(this.TenHS!="" && this.MaLop!="")
		{ query="update HocSinh set TENHS=N'"+this.TenHS+"',LOP='"+this.MaLop+"' where MAHS='"+this.MaHS+"'";
		}
		return this.db.update(query);
	}
	public void Findnameid()
	{
	try
	{
	String query;
	
	query="Select TENHS,LOP from Hocsinh where MAHS='"+this.MaHS+"'";
	 
	 ResultSet rs =this.db.get(query);
	 if(rs!=null)
	 {
		 while(rs.next())
		 {
			 this.TenHS=rs.getString("TENHS");
			 this.MaLop=rs.getString("LOP");
		 }
	 }
	 rs.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
