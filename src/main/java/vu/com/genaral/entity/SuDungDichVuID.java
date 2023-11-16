package vu.com.genaral.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;
@Embeddable
public class SuDungDichVuID implements Serializable {
	
	private String maKH;
	private String maDV;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaySuDung;
	@DateTimeFormat(pattern = "HH:mm")	
	private LocalTime gioSuDung;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public LocalDate getNgaySuDung() {
		return ngaySuDung;
	}
	public void setNgaySuDung(LocalDate ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}
	public LocalTime getGioSuDung() {
		return gioSuDung;
	}
	public void setGioSuDung(LocalTime gioSuDung) {
		this.gioSuDung = gioSuDung;
	}
	public SuDungDichVuID() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuDungDichVuID(String maKH, String maDV, LocalDate ngaySuDung, LocalTime gioSuDung) {
		super();
		this.maKH = maKH;
		this.maDV = maDV;
		this.ngaySuDung = ngaySuDung;
		this.gioSuDung = gioSuDung;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gioSuDung, maDV, maKH, ngaySuDung);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuDungDichVuID other = (SuDungDichVuID) obj;
		return Objects.equals(gioSuDung, other.gioSuDung) && Objects.equals(maDV, other.maDV)
				&& Objects.equals(maKH, other.maKH) && Objects.equals(ngaySuDung, other.ngaySuDung);
	}
	
	

	
	

}
