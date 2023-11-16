package vu.com.genaral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vu.com.genaral.entity.DichVu;
import vu.com.genaral.service.DichVuService;

@Controller
public class DichVuController {
	@Autowired
  DichVuService dichVuService;
	
	@GetMapping(value = { "/ViewDichVu" })
	 public String DichVu(Model model, @ModelAttribute("dichVu")DichVu dichVu) {
		 return "DichVu";
	 }
	
	@PostMapping(value = { "/addDichVu" })
	 public String addDichVu(Model model, @ModelAttribute("dichVu")DichVu dichVu,@RequestParam(name="maDv")String maDV) {
		DichVu dichVu2 = dichVuService.getByIdDv(maDV);
		if(dichVu2!=null) {
			String error = "Mã Dịch Vụ  đã tồn tại";
			model.addAttribute("error", error);
			return "DichVu";
		}
		dichVuService.addDichVu(dichVu);
		 return "redirect:/listDichVu";
	 }
	@GetMapping(value = {"/listDichVu"})
		public String listDichVu(Model model, @ModelAttribute("dichVu")DichVu dichVu) {
			List<DichVu>list = dichVuService.listDichVu();
			model.addAttribute("listdv", list);
			return "DanhSachDV";
		}
	
	@GetMapping(value = {"/deleteDV"})
	public String deleteDichVu(Model model, @ModelAttribute("dichVu")DichVu dichVu,@RequestParam(name="maDv")String maDV) {
		dichVuService.deleteDichVu(maDV);
		 return "redirect:/listDichVu";
	}
	
	@GetMapping(value = {"/updateDV"})
	public String updateDichVu(Model model, @ModelAttribute("dichVu")DichVu dichVu,@RequestParam(name="maDv")String maDV) {
	 DichVu dichVu2 = dichVuService.getByIdDv(maDV);
	 model.addAttribute(dichVu2);
		 return "DichVu";
	}
	@GetMapping(value = { "/searchDV" })
	public String seachKH (Model model, @ModelAttribute("dichVu")DichVu dichVu,@RequestParam(name="tenDV")String tenDV) {
		List<DichVu>dichVus = dichVuService.searchDV(tenDV);
		model.addAttribute("listSearchDV", dichVus);
		dichVu.setTenDV("");
		return "DanhSachDV";
		
	}

}
