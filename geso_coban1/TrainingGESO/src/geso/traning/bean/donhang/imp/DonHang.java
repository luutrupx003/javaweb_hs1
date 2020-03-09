package geso.traning.bean.donhang.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import geso.erp.db.sql.dbutils;
import geso.training.SP.ISanPham;
import geso.training.SP.imp.Sanpham;
import geso.traning.bean.donhang.IDonHang;

public class DonHang implements IDonHang {
	private String id;
	private String ma;
	private String ngayCT;
	private String tenKH;
	private String maKH;
	private String trangThai;
	private float tongTien;
	private String ngayTao;
	private String nguoiTao;
	private String userId;
	private String msg;
	private String VAT;
	private ResultSet rsKH;
	private ResultSet rsData;
	private List<ISanPham> listSP;
	private String idKH;
	private String testthu;
	dbutils db;

	public DonHang() {
		this.id = "";
		this.ma = "";
		this.maKH="";
		this.ngayCT = "";
		this.tenKH = "";
		this.trangThai = "";
		this.tongTien = 0;
		this.ngayTao = "";
		this.nguoiTao = "";
		this.userId = "";
		this.msg = "";
		this.listSP = new ArrayList<ISanPham>();
		this.db = new dbutils();
		this.VAT="0";
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setMa(String ma) {
		// TODO Auto-generated method stub
		this.ma = ma;
	}

	@Override
	public String getMa() {
		// TODO Auto-generated method stub
		return this.ma;
	}

	@Override
	public void setNgayCT(String ngay) {
		// TODO Auto-generated method stub
		this.ngayCT = ngay;
	}

	@Override
	public String getNgayCT() {
		// TODO Auto-generated method stub
		return this.ngayCT;
	}

	@Override
	public void setTenKH(String tenKH) {
		// TODO Auto-generated method stub
		this.tenKH = tenKH;
	}

	@Override
	public String getTenKH() {
		// TODO Auto-generated method stub
		return this.tenKH;
	}

	@Override
	public void setTrangThai(String trangThai) {
		// TODO Auto-generated method stub
		this.trangThai = trangThai;
	}

	@Override
	public String getTrangThai() {
		// TODO Auto-generated method stub
		return this.trangThai;
	}

	@Override
	public void setTongTien(float tongTien) {
		// TODO Auto-generated method stub
		this.tongTien = tongTien;
	}

	@Override
	public float getTongTien() {
		// TODO Auto-generated method stub
		return this.tongTien;
	}

	@Override
	public void setNgayTao(String ngayTao) {
		// TODO Auto-generated method stub
		this.ngayTao = ngayTao;
	}

	@Override
	public String getNgayTao() {
		// TODO Auto-generated method stub
		return this.ngayTao;
	}

	@Override
	public void setNguoiTao(String nguoiTao) {
		// TODO Auto-generated method stub
		this.nguoiTao = nguoiTao;
	}

	@Override
	public String getNguoiTao() {
		// TODO Auto-generated method stub
		return this.nguoiTao;
	}

	@Override
	public void setRsData(ResultSet rsData) {
		// TODO Auto-generated method stub
		this.rsData = rsData;
	}

	@Override
	public ResultSet getRsData() {
		// TODO Auto-generated method stub
		return this.rsData;
	}

	@Override
	public void setUserId(String userId) {
		// TODO Auto-generated method stub
		this.userId = userId;
	}

	@Override
	public String getUserId() {
		// TODO Auto-generated method stub
		return this.userId;
	}

	@Override
	public void setMsg(String msg) {
		// TODO Auto-generated method stub
		this.msg = msg;
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return this.msg;
	}

	@Override
	public void init() {
		String query="";
		// TODO Auto-generated method stub
		try {
			query = "select S.pk_seq,ma,ten,SOLUONG,DONVI,DS.GIAMUA,S.GIAMUA*SOLUONG as Thanhtien "
						+"from DONHANG_SANPHAM DS join erp_SANPHAM S on DS.SANPHAM_FK=PK_SEQ "
						+ "where DONHANG_FK='"+this.id+"'";
			listSP.clear();
			ResultSet rsSP = db.get(query);
			while (rsSP.next()) {
				ISanPham sp = new Sanpham();
				sp.setId(rsSP.getString("pk_seq"));
				sp.setTensanpham(rsSP.getString("ten"));
				sp.setMasanpham(rsSP.getString("ma"));
				sp.setDonvitinh(rsSP.getString("DONVI"));
				sp.setDongia(rsSP.getFloat("GIAMUA"));
				sp.setSoluong(rsSP.getInt("SOLUONG"));
				sp.setThanhtien(rsSP.getDouble("Thanhtien"));
				listSP.add(sp);
			}
			rsSP.close();
			String str="select VAT,D.NGAYTAO,K.Ma,d.KHACHHANG_FK,Ten,DiaChi from DONHANG D join ERP_KHACHHANG k on D.KHACHHANG_FK=k.PK_SEQ where D.PK_SEQ='"+this.id+"'";
			 ResultSet rs =this.db.get(str);
			 if(rs!=null)
			 {
				 while(rs.next())
				 {
					 
					 this.VAT=rs.getString("VAT");
					 this.ngayTao=rs.getString("NGAYTAO");
					 this.maKH=rs.getString("Ma");
					 this.idKH=rs.getString("KHACHHANG_FK");
					 String ten=rs.getString("Ten");
					 String diachi=rs.getString("DiaChi");
					 this.tenKH=ten+"-"+diachi;
				 }
			 }
			 rs.close();
			
			 
			 
			 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void CreateRsKhachHang() {
		// TODO Auto-generated method stub
		String query = "select pk_seq,ten from KHACHHANG";
		this.rsKH = db.get(query);
	}

	@Override
	public ResultSet getRsKhachHang() {
		// TODO Auto-generated method stub
		return this.rsKH;
	}

	@Override
	public boolean save() {
		try {
			
			db.getConnection().setAutoCommit(false);
			
			String query = "insert into DONHANG(NGAYNHAP,NGAYTAO,TRANGTHAI,NGUOITAO,VAT,TONGGIATRI,KHACHHANG_FK) VALUES"
					+ "('" + this.ngayTao + "','" + this.ngayTao + "','0','" + this.userId + "','" + this.VAT+ "','"
					+ this.tongTien + "','" + this.maKH + "')";
			if (!db.update(query)) {
				db.getConnection().rollback();
				this.msg = "Không thể thực hiện dòng lệnh : " + query;
				return false;
			}
			
			//lay madon hang vua dc tao
			
			query = "select SCOPE_IDENTITY() as dhid";
			ResultSet rsDck = db.get(query);
			if (rsDck.next()) {
				 this.ma = rsDck.getString("dhid");
			}
			rsDck.close();
			
			
			 // theo vao don hang cac san pham
			
		/*	 for(ISanPham tam:listSP){
				
				 //insert donhang_sanpham
			 String querycapnhat="insert into DONHANG_SANPHAM(SANPHAM_FK,DONHANG_FK,SOLUONG,GIAMUA,DONVI) values "
					 + "(select pk_seq from erp_SANPHAM where ma='"+tam.getMasanpham() +"'," + this.ma+ ",'"+tam.getSoluong()+"','" + tam.getThanhtien() + "',N'" + tam.getDonvitinh()+"')";
			 if (!db.update(querycapnhat)) {
					db.getConnection().rollback();
					this.msg = "Không thể thực hiện dòng lệnh : " + querycapnhat;
					return false;
				}
			 
			 }*/
			 if(listSP.size()>0){
			 
			 String querydonhang="";
			 for( int i=0,length=listSP.size();i<length;i++){
				 ISanPham tam=listSP.get(i);
				if(i==length-1) //dong cuoi cung
				{
					querydonhang+= "select (select pk_seq from erp_SANPHAM where ma='"+tam.getMasanpham() +"')," + this.ma+ ",'"+tam.getSoluong()+"','" + tam.getDongia() + "',N'" + tam.getDonvitinh()+"' ";
				}
				else
				{
					querydonhang+= "select (select pk_seq from erp_SANPHAM where ma='"+tam.getMasanpham() +"')," + this.ma+ ",'"+tam.getSoluong()+"','" + tam.getDongia() + "',N'" + tam.getDonvitinh()+"' union ";

				}
				 
			 }
			 
			 querydonhang="insert into DONHANG_SANPHAM(SANPHAM_FK,DONHANG_FK,SOLUONG,GIAMUA,DONVI)  "+ querydonhang;
			 if (!db.update(querydonhang)) {
					db.getConnection().rollback();
					this.msg = "Không thể thực hiện dòng lệnh : " + querydonhang;
					return false;
				}
			 }
			 
			 
			 
			 //cau kieu moi
			 db.getConnection().commit();
			 db.getConnection().setAutoCommit(true);
			 
			
		} catch (Exception e) {
			db.update("rollback");
			this.msg = "Lỗi : " + e.getMessage();
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update() {
		try {
			db.getConnection().setAutoCommit(false);
			db.update("delete from DONHANG_SANPHAM where DONHANG_FK='"+this.id+"'  ");
			 if(listSP.size()>0){
			 String querydonhang="";
			 for( int i=0,length=listSP.size();i<length;i++){
				 ISanPham tam=listSP.get(i);
				if(i==length-1) //dong cuoi cung
				{
					querydonhang+= "select (select pk_seq from erp_SANPHAM where ma='"+tam.getMasanpham() +"')," + this.id+ ",'"+tam.getSoluong()+"','" + tam.getDongia() + "',N'" + tam.getDonvitinh()+"' ";
				}
				else
				{
					querydonhang+= "select (select pk_seq from erp_SANPHAM where ma='"+tam.getMasanpham() +"')," + this.id+ ",'"+tam.getSoluong()+"','" + tam.getDongia() + "',N'" + tam.getDonvitinh()+"' union ";

				}
				 
			 }
			 
			 querydonhang="insert into DONHANG_SANPHAM(SANPHAM_FK,DONHANG_FK,SOLUONG,GIAMUA,DONVI)  "+ querydonhang;
			 if (!db.update(querydonhang)) {
					db.getConnection().rollback();
					this.msg = "Không thể thực hiện dòng lệnh : " + querydonhang;
					return false;
				}
			 }
			//cap nhat don hang
			 String querycapnhat = "update DONHANG set "
						+ "NGAYSUA='" + this.ngayTao + "' , VAT="+ this.VAT + ", TONGGIATRI = "+this.tongTien+", KHACHHANG_FK ="
						+ this.idKH+", Nguoisua='"+this.userId+"' where PK_SEQ='"+this.id+"'" ;
				if (!db.update(querycapnhat)) {
					db.getConnection().rollback();
					this.msg = "Không thể thực hiện dòng lệnh : " + querycapnhat;
					return false;
				}
			
			db.getConnection().commit();
			db.getConnection().setAutoCommit(true);
		} catch (Exception e) {
			db.update("rollback");
			this.msg = "Lỗi : " + e.getMessage();
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public void DBclose() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ISanPham> getListSP() {
		// TODO Auto-generated method stub
		return this.listSP;
	}

	@Override
	public void setListSP(List<ISanPham> listSP) {
		// TODO Auto-generated method stub
		this.listSP = listSP;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String ma) {
		this.maKH = ma;
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String VAT) {
		this.VAT = VAT;
	}

	public String getIdKH() {
		return idKH;
	}

	public void setIdKH(String idKH) {
		this.idKH = idKH;
	}

	@Override
	public void capnhattrangthai(String mahd) {
		String query="Update donhang set trangthai='1' where PK_SEQ='"+mahd+"'";
		 this.db.update(query);
		
	}

	public String getTestthu() {
		return testthu;
	}

	public void setTestthu(String testthu) {
		this.testthu = testthu;
	}

}
