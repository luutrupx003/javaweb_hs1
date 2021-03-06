package geso.erp.beans.donbanhang_kiet02;

import java.sql.ResultSet;
import java.util.List;

public interface IDonHang {

	public String getUserId();
	public void setUserId(String userId);
 	  
	public String getTrangThai();
	public void setTrangThai(String trangThai);
	 	
	
	public String getMaDonHang ();
	public void setMaDonHang (String maDonHang);
	
	
	public String getMaKhachHang();
	public void setMaKhachHang(String maKhachHang);
 
	public String getNgayChungTu();
	public void setNgayChungTu(String ngayChungTu);
	
	public float getTongTien();
	public void setTongTien(float tongTien);
	 
	public void setMsg(String msg);
	public String getMsg();
	
	public List<ISanPham> getDanhSachSanPham();
	public void setDanhSachSanPham(List<ISanPham> danhSachSanPham);
	
	public void CreateRsKH();
	
	public ResultSet getDataList();
	public ResultSet getResultSetKH();
	public void init(String search);
	public void DBclose();
	public boolean save();

	public boolean deleteDonHang();
	public boolean chotDonHang();
	
}
