package vu.com.genaral.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vu.com.genaral.entity.KhachHang;
import vu.com.genaral.entity.May;

@Repository
public class MaMayRepository {

	@Autowired
	SessionFactory sessionFactory;
	
  public void addTaoMay(May may) {
	  Session session = sessionFactory.getCurrentSession();
	     session.saveOrUpdate(may);
  }
   
  public List<May>listMay(){
	  Session session = sessionFactory.getCurrentSession();
	  List<May>listMay = new ArrayList<>();
	  String hql = "from May";
	  Query query = session.createQuery(hql);
	  listMay = query.getResultList();
	  return listMay;
  }
  
	public void deleteMay(String maMay) {
		Session session = sessionFactory.getCurrentSession();
		May may = session.get(May.class, maMay);
		session.delete(may);
	}
	
	public May getById(String maMay) {
		Session session = sessionFactory.getCurrentSession();
		May may = session.get(May.class, maMay);
		return may;
	}
	

  
}
