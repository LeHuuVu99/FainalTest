package vu.com.genaral.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vu.com.genaral.entity.KhachHang;
import vu.com.genaral.page.PageAble;

@Repository
public class KhachHangRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	public void addKhachHang(KhachHang kh) {
		Session session = sessionFactory.getCurrentSession();

		session.saveOrUpdate(kh);
		

	}
	
	public List<KhachHang>listKhachHang(){
		Session session = sessionFactory.getCurrentSession();
		List<KhachHang>liKhachHang = new ArrayList<>();
		String hql  = "from KhachHang";
		Query query = session.createQuery(hql);
		liKhachHang = query.getResultList();
		return liKhachHang;
	}

	public void deleteDichVu(String maKH) {
		Session session = sessionFactory.getCurrentSession();
		KhachHang khachHang = session.get(KhachHang.class, maKH);
		session.delete(khachHang);
	}
	
	public KhachHang getById(String maKH) {
		Session session = sessionFactory.getCurrentSession();
		KhachHang khachHang = session.get(KhachHang.class, maKH);
		return khachHang;
	}
	
	public List<KhachHang>searchKh(String tenKH) {
		Session session = sessionFactory.getCurrentSession();
		List<KhachHang>listsearch = new ArrayList<>();
		String hql = "FROM KhachHang kh where kh.tenKH like :tenKH ";
		Query query = session.createQuery(hql);
		query.setParameter("tenKH", "%" + tenKH + "%");
		listsearch = query.getResultList();
		return listsearch;
	}
	public List<KhachHang> findWithPageAble(PageAble pageAble) {
		Session session = sessionFactory.getCurrentSession();
		List<KhachHang> KhachHangs = session.createQuery("SELECT m FROM KhachHang m", KhachHang.class)
				.setFirstResult(pageAble.getOffset())// Offset
				.setMaxResults(pageAble.getSize()) // limit
				.getResultList();

		     return KhachHangs;
	}
	public long count() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("SELECT COUNT(*) FROM KhachHang m", Long.class).getSingleResult();
	}

}
