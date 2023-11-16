package vu.com.genaral.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vu.com.genaral.entity.KhachHang;
import vu.com.genaral.page.PageAble;
import vu.com.genaral.repository.KhachHangRepository;

@Service
public class KhachHangService {
	@Autowired
	KhachHangRepository khachHangRepository;
	
	
	@Transactional
	public void addKhachHang(KhachHang kh) {
		khachHangRepository.addKhachHang(kh);
	}
	@Transactional
	public List<KhachHang>listKhachHang(){
		return khachHangRepository.listKhachHang();
	}
	
	  @Transactional
	  public void deleteKhachHang(String maKH) {
		  khachHangRepository.deleteDichVu(maKH);
	  }
	  @Transactional
	  public KhachHang getById(String maKH) {
		return  khachHangRepository.getById(maKH);
	  }
	  @Transactional
	  public List<KhachHang>searchKh(String tenKH){
		  return khachHangRepository.searchKh(tenKH);
	  }
		@Transactional
		public int totalPages(PageAble pageAble) {
			long totalRecord = khachHangRepository.count();
			return (int) Math.ceil((double) totalRecord / pageAble.getSize());
		}
		@Transactional
		public List<KhachHang> findWithPageAble(PageAble pageAble) {
			return khachHangRepository.findWithPageAble(pageAble);
		}


}
