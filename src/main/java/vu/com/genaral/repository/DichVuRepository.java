package vu.com.genaral.repository;

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


@Repository
public class DichVuRepository {
	@Autowired
	SessionFactory sessionFactory;
	public void addDichVu(DichVu dv) {
		Session session = sessionFactory.getCurrentSession();	
		session.saveOrUpdate(dv);
		
	}
	public List<DichVu>listDichVu(){
		Session session = sessionFactory.getCurrentSession();
		List<DichVu>liKDichVu = new ArrayList<>();
		String hql  = "from DichVu";
		Query query = session.createQuery(hql);
		liKDichVu = query.getResultList();
		return liKDichVu;
	}
	public void deleteDichVu(String maDV) {
		Session session = sessionFactory.getCurrentSession();
		DichVu dichVu = session.get(DichVu.class, maDV);
		session.delete(dichVu);
	}
	
	public DichVu getByIdDv(String maDV) {
		Session session = sessionFactory.getCurrentSession();
		DichVu dichVu = session.get(DichVu.class, maDV);
		return dichVu;
	}
	
	public List<DichVu>searchDV(String tenDv) {
		Session session = sessionFactory.getCurrentSession();
		List<DichVu>listsearch = new ArrayList<>();
		String hql = "FROM DichVu dv where dv.tenDV like :tenDV ";
		Query query = session.createQuery(hql);
		query.setParameter("tenDV", "%" + tenDv + "%");
		listsearch = query.getResultList();
		return listsearch;
	}

}
