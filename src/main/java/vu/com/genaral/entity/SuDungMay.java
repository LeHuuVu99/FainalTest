package vu.com.genaral.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class SuDungMay {

   @EmbeddedId
   private SuDungMayId id;

	
	@ManyToOne
	@JoinColumn(name = "maMay", insertable = false, updatable = false)
	private May may;
	

	@ManyToOne
	@JoinColumn(name = "maKH", insertable = false, updatable = false)
	private KhachHang khachHang;
	
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime thoiGianSuDung;

	public SuDungMayId getId() {
		return id;
	}

	public void setId(SuDungMayId id) {
		this.id = id;
	}

	public May getMay() {
		return may;
	}

	public void setMay(May may) {
		this.may = may;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public LocalTime getThoiGianSuDung() {
		return thoiGianSuDung;
	}

	public void setThoiGianSuDung(LocalTime thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}

	public SuDungMay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuDungMay(SuDungMayId id, May may, KhachHang khachHang, LocalTime thoiGianSuDung) {
		super();
		this.id = id;
		this.may = may;
		this.khachHang = khachHang;
		this.thoiGianSuDung = thoiGianSuDung;
	}
	
	

}
