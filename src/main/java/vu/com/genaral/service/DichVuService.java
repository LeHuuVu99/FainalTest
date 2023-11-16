package vu.com.genaral.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vu.com.genaral.entity.DichVu;
import vu.com.genaral.repository.DichVuRepository;

@Service
public class DichVuService {
	@Autowired
    DichVuRepository dichVuRepository;
	
	@Transactional
	public void addDichVu(DichVu dv) {
		dichVuRepository.addDichVu(dv);
	}
	@Transactional
	public List<DichVu>listDichVu(){
		return dichVuRepository.listDichVu();
	}
  @Transactional
  public void deleteDichVu(String maDV) {
	  dichVuRepository.deleteDichVu(maDV);
  }
  @Transactional
  public DichVu getByIdDv(String maDV) {
	  return  dichVuRepository.getByIdDv(maDV);
  }
  @Transactional
  public List<DichVu>searchDV(String tenDv){
	  return dichVuRepository.searchDV(tenDv);
  }
}
