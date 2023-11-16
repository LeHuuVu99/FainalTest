package vu.com.genaral.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vu.com.genaral.entity.DichVu;
import vu.com.genaral.entity.KhachHang;
import vu.com.genaral.entity.May;
import vu.com.genaral.entity.SuDungDichVu;
import vu.com.genaral.entity.SuDungDichVuID;
import vu.com.genaral.entity.SuDungMay;
import vu.com.genaral.entity.SuDungMayId;
import vu.com.genaral.model.QuanNetModel;

@Repository
public class QuanNetRepository {
  @Autowired
  SessionFactory sessionFactory;
  
  public List<KhachHang> khachHangID() {
	  Session session =  sessionFactory.getCurrentSession();
	  List<KhachHang>list = new ArrayList<>();
	  String hql = "select kh.maKH from KhachHang kh";
	  Query query = session.createQuery(hql);
	  list = query.getResultList();
	  return list;
  }
  
  public List<May> mayID() {
	  Session session =  sessionFactory.getCurrentSession();
	  List<May>list = new ArrayList<>();
	  String hql = "select m.maMay from May m";
	  Query query = session.createQuery(hql);
	  list = query.getResultList();
	  return list;
  }
  
  public List<DichVu>dichVuID() {
	  Session session =  sessionFactory.getCurrentSession();
	  List<DichVu>liDichVus = new ArrayList<>();
	  String hql = " select dv.maDv from DichVu dv";
	  Query query = session.createQuery(hql);
	    liDichVus = query.getResultList();
	     return liDichVus;
  }
  
  public void addQuanNet(QuanNetModel sddv) {	 
	  Session session = sessionFactory.getCurrentSession(); 
      SuDungDichVuID sdid = new SuDungDichVuID();
      sdid.setMaDV(sddv.getMaDv());
      sdid.setMaKH(sddv.getMaKH());
      sdid.setNgaySuDung(sddv.getNgaySuDung());
      sdid.setGioSuDung(sddv.getGioSuDung());
      SuDungDichVu sd = new SuDungDichVu();
      sd.setId(sdid);
      sd.setSoLuong(sddv.getSoLuong());
      session.saveOrUpdate(sd);
  
  }
  
  public void addSuDungMay(QuanNetModel ssm) {
	  Session session = sessionFactory.getCurrentSession();
	  SuDungMayId mid = new SuDungMayId();
	  mid.setMaKH(ssm.getMaKH());
	  mid.setMaMay(ssm.getMaMay());
	  mid.setNgayBatDauSuDung(ssm.getNgayBatDauSuDung());
	  mid.setGioBatDauSuDung(ssm.getGioBatDauSuDung());
	  SuDungMay sdm = new SuDungMay();
	  sdm.setId(mid);
	  sdm.setThoiGianSuDung(ssm.getThoiGianSuDung());
	  session.saveOrUpdate(sdm);
	  
  }
  
  public List<QuanNetModel>listModel(){
	  Session session = sessionFactory.getCurrentSession();
	  List<QuanNetModel>listModels = new ArrayList<>();
			  String hql ="SELECT new fa.com.genaral.model.QuanNetModel(m.maMay, m.viTri, m.trangThai, kh.maKH, kh.tenKH,"
			  		+ "			sdm.id.ngayBatDauSuDung, sdm.id.gioBatDauSuDung, sdm.thoiGianSuDung, dv.maDv, sddv.soLuong, dv.donGia,"
			  		+ "			sddv.id.ngaySuDung, sddv.id.gioSuDung) "
			  		+ "FROM May m join m.suDungMay sdm join sdm.khachHang kh join kh.suDungDichVus sddv join sddv.dichVu dv";
			  Query query = session.createQuery(hql);
			  listModels = query.getResultList();
			  return listModels;
  }
  
  public List<QuanNetModel>searchModel(String tenKH){
	  Session session = sessionFactory.getCurrentSession();
	  List<QuanNetModel>listModels = new ArrayList<>();
			  String hql ="SELECT new fa.com.genaral.model.QuanNetModel(m.maMay, m.viTri, m.trangThai, kh.maKH, kh.tenKH,"
			  		+ "			sdm.id.ngayBatDauSuDung, sdm.id.gioBatDauSuDung, sdm.thoiGianSuDung, dv.maDv, sddv.soLuong, dv.donGia,"
			  		+ "			sddv.id.ngaySuDung, sddv.id.gioSuDung) "
			  		+ "FROM May m join m.suDungMay sdm join sdm.khachHang kh join kh.suDungDichVus sddv join sddv.dichVu dv where kh.tenKH like :tenKH";		  
			  Query query = session.createQuery(hql);
			  query.setParameter("tenKH", "%" + tenKH + "%");
			  listModels = query.getResultList();
			  return listModels;
  }
  
}
