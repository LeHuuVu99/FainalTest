package vu.com.genaral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vu.com.genaral.entity.May;
import vu.com.genaral.service.MaMayService;


@org.springframework.stereotype.Controller
public class TaoMayController {
	@Autowired
	MaMayService maMayService;

	@GetMapping(value = { "/", "/indexPage" })
	public String index(Model model) {
		return "IndexPage";
	}

	@GetMapping(value = { "/May" })
	 public String taoMay(Model model, @ModelAttribute("taoMay") May may) {
		 return "TaoMay";
	 }
	 
	@PostMapping(value = { "/addMay" })
	 public String addMay(Model model, @ModelAttribute("taoMay") May may,@RequestParam(name="maMay") String maMay) {
	  May may2 = maMayService.getById(maMay);
	  if(may2!=null) {
			String error = "Mã Máy  đã tồn tại";
			model.addAttribute("error", error);
			return "TaoMay";
	  }
		 maMayService.addTaoMay(may);
		 return "redirect:/listMay";
	 }
	
	@GetMapping(value = { "/listMay" })
	 public String listMay(Model model, @ModelAttribute("taoMay") May may) {
	   List<May>list =  maMayService.listMay();
	    model.addAttribute("listMay",list);
		 return "DanhSachMay";
	 }
	@GetMapping(value = { "/delete" })
	public String deleteMay(Model model, @ModelAttribute("taoMay") May may,@RequestParam(name="maMay") String maMay) {
		maMayService.deleteMay(maMay);
		 return "redirect:/listMay";
	}
	@GetMapping(value = { "/updatelm" })
	public String updateMay(Model model, @ModelAttribute("taoMay") May may,@RequestParam(name="maMay") String maMay) {
		May may1 =   maMayService.getById(maMay);
		 model.addAttribute("taoMay",may1);
		 return "TaoMay";
	}
	@GetMapping(value = { "/searchMay" })
	public String searchMay(Model model, @ModelAttribute("taoMay") May may,@RequestParam(name="maMay") String maMay) {
		May may1 =   maMayService.getById(maMay);
		if(may1==null) {
			 return "redirect:/listMay";
		}
		 model.addAttribute("taoMay1",may1);
		 may.setMaMay("");
		 return "DanhSachMay";
	}
}
