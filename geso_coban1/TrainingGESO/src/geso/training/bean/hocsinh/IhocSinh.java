package geso.training.bean.hocsinh;

import java.sql.ResultSet;

public interface IhocSinh {
	public String getMaHS();
	public void setMaHS (String MaHS);
	public String getTenHS();
	public void setTenHS (String TenHS);
	public String getMaLop();
	public void setMaLop (String MaLop);
	public String getUserId();
	public void setUserId (String UserId);
	public String getUserName();
	public void setUserName (String UserName);
	public ResultSet getRsLop();
	public void setRslop(ResultSet rsLop);
	public void DBClose();
	public void creates();
	public boolean Save();
	public boolean Delete();
	public boolean Edit();
	public void Findnameid();
	
}
