package vu.com.genaral.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vu.com.genaral.entity.DichVu;
import vu.com.genaral.entity.KhachHang;
import vu.com.genaral.entity.May;
import vu.com.genaral.entity.SuDungDichVu;
import vu.com.genaral.model.QuanNetModel;
import vu.com.genaral.repository.QuanNetRepository;

@Service
public class QuanNetService {
	@Autowired
	QuanNetRepository quanNetRepository;
	
	@Transactional
	public List<KhachHang> khachHangID(){
		return quanNetRepository.khachHangID();
	}
    @Transactional
    public List<DichVu>dichVuID() {
    	return quanNetRepository.dichVuID();
    }
    
    @Transactional
    public List<May> mayID() {
    	return quanNetRepository.mayID();
    }
    
    @Transactional
    public void addQuanNet(QuanNetModel sddv) {
    	quanNetRepository.addQuanNet(sddv);
    }
    @Transactional
    public void addSuDungMay(QuanNetModel ssm) {
    	quanNetRepository.addSuDungMay(ssm);
    }
    @Transactional
    public List<QuanNetModel>listModel(){
    	return quanNetRepository.listModel();
    }
    @Transactional
    public List<QuanNetModel>searchModel(String tenKH){
    	return quanNetRepository.searchModel(tenKH);
    }
}
