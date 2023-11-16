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
import vu.com.genaral.entity.KhachHang;
import vu.com.genaral.entity.May;
import vu.com.genaral.model.QuanNetModel;
import vu.com.genaral.service.QuanNetService;

@Controller
public class QuanNetController {
	@Autowired
	QuanNetService dichVuService;

	@GetMapping(value = { "/ViewSuDungDichVu" })
	public String viewSuDungDV(Model model, @ModelAttribute(name = "QuanNet") QuanNetModel quanNetModel) {
		List<KhachHang> khachHang =  dichVuService.khachHangID();
		model.addAttribute("khachHangList",khachHang);
		   List<DichVu> dichVu  = dichVuService.dichVuID();
		   model.addAttribute("dichVuList",dichVu);


	     	return "DKSuDungDV";
	}
	
	   @PostMapping( value = { "/addQuanNet" })
	   public String addQuanNet(Model model, @ModelAttribute(name = "QuanNet") QuanNetModel quanNetModel) {   
		dichVuService.addQuanNet(quanNetModel);
		 return "redirect:/TableAll";
	}
	   
	   @GetMapping(value = { "/ViewSuDungMay" })
	   public String ViewSuDungMay(Model model,@ModelAttribute(name = "QuanNet") QuanNetModel quanNetModel) {
		   List<May>may = dichVuService.mayID();
		   model.addAttribute("mayList", may);
			List<KhachHang> khachHang =  dichVuService.khachHangID();
			model.addAttribute("khachHangList",khachHang);
			return "DKSuDungMay";
	   }
	   
	   @PostMapping( value = { "/addSuDungMay" })
	   public String addSuDungMay(Model model,@ModelAttribute(name = "QuanNet") QuanNetModel quanNetModel) {
		   dichVuService.addSuDungMay(quanNetModel);
		   return "redirect:/TableAll";
	   }
	   
	   
		@GetMapping(value = { "/ViewAll" })
		public String viewAll(Model model, @ModelAttribute(name = "QuanNet") QuanNetModel quanNetModel) {
			return "redirect:/TableAll";
		}
		
		@GetMapping(value = { "/TableAll" })
		public String selectQuanNet(Model model, @ModelAttribute(name = "QuanNet") QuanNetModel quanNetModel) {
			List<QuanNetModel>listQuanNet = dichVuService.listModel();
			model.addAttribute("listQuanNet", listQuanNet);
			
			return "DanhSachAll";
			
		}
		@GetMapping(value = { "/searchAll" })
		public String searchQuanNet(Model model, @ModelAttribute(name = "QuanNet") QuanNetModel quanNetModel,@RequestParam(name="tenKH")String tenKH) {
			List<QuanNetModel>listQuanNet1 =  dichVuService.searchModel(tenKH);
			if(listQuanNet1==null) {
				return "redirect:/TableAll";
			}
			model.addAttribute("listQuanNet1", listQuanNet1);		
			quanNetModel.setTenKH("");
			return "DanhSachAll";
			
		}

}
