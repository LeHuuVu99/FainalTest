package vu.com.genaral.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;
@Embeddable
public class SuDungMayId implements Serializable {
	
	private String maKH;
	private String maMay;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayBatDauSuDung;
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime gioBatDauSuDung;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getMaMay() {
		return maMay;
	}
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}
	public LocalDate getNgayBatDauSuDung() {
		return ngayBatDauSuDung;
	}
	public void setNgayBatDauSuDung(LocalDate ngayBatDauSuDung) {
		this.ngayBatDauSuDung = ngayBatDauSuDung;
	}
	public LocalTime getGioBatDauSuDung() {
		return gioBatDauSuDung;
	}
	public void setGioBatDauSuDung(LocalTime gioBatDauSuDung) {
		this.gioBatDauSuDung = gioBatDauSuDung;
	}
	public SuDungMayId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuDungMayId(String maKH, String maMay, LocalDate ngayBatDauSuDung, LocalTime gioBatDauSuDung) {
		super();
		this.maKH = maKH;
		this.maMay = maMay;
		this.ngayBatDauSuDung = ngayBatDauSuDung;
		this.gioBatDauSuDung = gioBatDauSuDung;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gioBatDauSuDung, maKH, maMay, ngayBatDauSuDung);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuDungMayId other = (SuDungMayId) obj;
		return Objects.equals(gioBatDauSuDung, other.gioBatDauSuDung) && Objects.equals(maKH, other.maKH)
				&& Objects.equals(maMay, other.maMay) && Objects.equals(ngayBatDauSuDung, other.ngayBatDauSuDung);
	}
	
	

    
    
}
