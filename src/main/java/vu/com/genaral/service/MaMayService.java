package vu.com.genaral.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vu.com.genaral.entity.May;
import vu.com.genaral.repository.MaMayRepository;

@Service
public class MaMayService {
   @Autowired
   MaMayRepository maMayRepository;
   
   @Transactional
   public void addTaoMay(May may) {
	   maMayRepository.addTaoMay(may);
   }
   @Transactional
   public List<May>listMay(){
	 return maMayRepository.listMay();
   }
   @Transactional
   public void deleteMay(String maMay) {
	   maMayRepository.deleteMay(maMay);
   }
   @Transactional
	public May getById(String maMay) {
	   return maMayRepository.getById(maMay);
   }
}
