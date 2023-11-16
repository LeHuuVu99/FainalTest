package vu.com.genaral.model;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

public class QuanNetModel {
	private String maMay;
	private String viTri;
	private String trangThai;
	private String maKH;
	private String tenKH;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngayBatDauSuDung;
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime gioBatDauSuDung;
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime thoiGianSuDung;
	private String maDv;
	private String tenDV;
	private int soLuong;
	 private int donGia;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaySuDung;
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime gioSuDung;
	private int tongTien;
	public String getMaMay() {
		return maMay;
	}
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
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
	public LocalTime getThoiGianSuDung() {
		return thoiGianSuDung;
	}
	public void setThoiGianSuDung(LocalTime thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}
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
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
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
	public int getTongTien() {
		return tongTien;
	}
	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}
	public QuanNetModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuanNetModel(String maMay, String viTri, String trangThai, String maKH, String tenKH,
			LocalDate ngayBatDauSuDung, LocalTime gioBatDauSuDung, LocalTime thoiGianSuDung, String maDv, int soLuong,
			int donGia, LocalDate ngaySuDung, LocalTime gioSuDung) {
		super();
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.ngayBatDauSuDung = ngayBatDauSuDung;
		this.gioBatDauSuDung = gioBatDauSuDung;
		this.thoiGianSuDung = thoiGianSuDung;
		this.maDv = maDv;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.ngaySuDung = ngaySuDung;
		this.gioSuDung = gioSuDung;
	}
	
	

}
