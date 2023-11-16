package vu.com.genaral.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity

public class SuDungDichVu {
	
	@EmbeddedId
	private SuDungDichVuID id;

	
	@ManyToOne
	@JoinColumn(name = "maDv", insertable = false, updatable = false)
	private  DichVu dichVu;		
	@ManyToOne
	@JoinColumn(name="maKH", insertable = false, updatable = false)
	private KhachHang khachHang;
	
	private int soLuong;

	public SuDungDichVuID getId() {
		return id;
	}

	public void setId(SuDungDichVuID id) {
		this.id = id;
	}

	public DichVu getDichVu() {
		return dichVu;
	}

	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public SuDungDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuDungDichVu(SuDungDichVuID id, DichVu dichVu, KhachHang khachHang, int soLuong) {
		super();
		this.id = id;
		this.dichVu = dichVu;
		this.khachHang = khachHang;
		this.soLuong = soLuong;
	}

	
	

}
