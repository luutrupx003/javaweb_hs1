package geso.training.bean.hocsinh.imp;

import java.sql.ResultSet;

import geso.erp.db.sql.dbutils;
import geso.training.bean.hocsinh.IhocSinhList;

public final class HocSinhList implements IhocSinhList {
	private String MaHocSinh;
	private String TenHocSinh;
	private String MaLop;
	private String UserId;
	private String UserName;
	private ResultSet RsLop;
	private ResultSet RsHocSinhList;
	dbutils db;
	public HocSinhList(){
		this.MaHocSinh="";
		this.TenHocSinh="";
		this.MaLop="";
		this.db=new dbutils();
	}
	public String getMaHocSinh(){
		return MaHocSinh;
	}
	public void setMaHocSinh(String MaHocSinh){
		this.MaHocSinh=MaHocSinh;
	}
	public String getTenHocSinh(){
		return TenHocSinh;
	}
	public void setTenHocSinh(String TenHocSinh){
		this.TenHocSinh=TenHocSinh;
	}
	public String getUserId(){
		return UserId;
	}
	public void setUserId(String UserId){
		this.UserId=UserId;
	}
	public String getUserName(){
		return UserName;
	}
	public void setUserName(String UserName){
		this.UserName=UserName;
	}
	public String getMaLop(){
		return MaLop;
	}
	public void setMaLop(String MaLop){
		this.MaLop=MaLop;
	}
	public ResultSet getRsLop(){
		return RsLop;
	}
	public void setTenHocSinh(ResultSet RsLop){
		this.RsLop=RsLop;
	}
	public ResultSet getRsHocSinhList(){
		return RsHocSinhList;
	}
	public void setRsHocSinhList(ResultSet RsHocSinhList){
		this.RsHocSinhList=RsHocSinhList;
	}

	public void creates()
	{
		String query="select PK_SEQ,TENLOP from LOP";
		this.RsLop=this.db.get(query);
				
	}
	public void DBClose(){
		try{
			if (this.RsLop!=null)this.RsLop.close();
			if(this.RsHocSinhList != null) this.RsHocSinhList.close();
			if (this.db!=null)this.db.shutDown();			
		}catch (Exception e){}
	}
	public void init()
	{
	String query="select a.MAHS, a.TENHS, b.TENLOP from HOCSINH a inner join LOP b on a.LOP=b.PK_SEQ";
	//Xóa khoảng trắng trước và sau chuỗi trim()
	if (this.MaLop.trim().length()>0)
		query+=" and a.LOP="+this.MaLop;	
	this.RsHocSinhList=this.db.get(query);
	}
	@Override
	public void setRsLop(ResultSet RsLop) {
		this.RsLop=RsLop;
		
	}
	
}
