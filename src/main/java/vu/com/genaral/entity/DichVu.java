package vu.com.genaral.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DichVu {
	@Id
	private String maDv;

	private String tenDV;

	@OneToMany(mappedBy = "dichVu", cascade = CascadeType.ALL)
	private List<SuDungDichVu> suDungDichVu;

	private String donViTinh;
	private int donGia;
	public String getMaDv() {
		return maDv;
	}
	public void setMaDv(String maDv) {
		this.maDv = maDv;
	}
	public String getTenDV() {
		return tenDV;
	}
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	public List<SuDungDichVu> getSuDungDichVu() {
		return suDungDichVu;
	}
	public void setSuDungDichVu(List<SuDungDichVu> suDungDichVu) {
		this.suDungDichVu = suDungDichVu;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DichVu(String maDv, String tenDV, List<SuDungDichVu> suDungDichVu, String donViTinh, int donGia) {
		super();
		this.maDv = maDv;
		this.tenDV = tenDV;
		this.suDungDichVu = suDungDichVu;
		this.donViTinh = donViTinh;
		this.donGia = donGia;
	}

	
}
