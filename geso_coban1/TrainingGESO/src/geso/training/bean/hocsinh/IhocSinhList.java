package geso.training.bean.hocsinh;

import java.sql.ResultSet;

public interface IhocSinhList {
	public void setMaHocSinh(String MaHocSinh);
	public String getMaHocSinh();
	public void setTenHocSinh(String TenHocSinh);
	public String getTenHocSinh();
	public void setMaLop(String MaLop);
	public String getMaLop();
	public void setUserId(String MaUserId);
	public String getUserId();
	public void setUserName(String UserName);
	public String getUserName();
	public void setRsLop(ResultSet RsLop);
	public ResultSet getRsLop();
	public void setRsHocSinhList(ResultSet RsHocSinhList);
	public ResultSet getRsHocSinhList();
	public void creates();
	public void DBClose();
	public void init();
}
