package vu.com.genaral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vu.com.genaral.entity.KhachHang;
import vu.com.genaral.page.PageAble;
import vu.com.genaral.service.KhachHangService;

@Controller
public class KhachHangController {
	@Autowired
	KhachHangService hangService;

	@GetMapping(value = { "/Viewkhachhang" })
	public String taoMay(Model model, @ModelAttribute("khachHang") KhachHang khachHang) {
		return "KhachHang";
	}

	@PostMapping(name = "/addkhachhang")
	public String addKhachHang(Model model, @ModelAttribute(name = "khachHang") KhachHang khachHang,@RequestParam(name = "maKH") String maKH) {
		KhachHang khachHang2 = hangService.getById(maKH);
		if(khachHang2!=null) {
			String error = "Mã khách hàng đã tồn tại";
			model.addAttribute("error", error);
			return "redirect:/Viewkhachhang";
		}
		hangService.addKhachHang(khachHang);
		return "redirect:/listKhachHang";
	}

	@GetMapping(name = "/listKhachHang")
	public String listKhachHang(Model model, @ModelAttribute(name = "khachHang") KhachHang khachHang) {
		List<KhachHang> list = hangService.listKhachHang();
		model.addAttribute("list", list);
		return "DanhSachKH";
	}

	@GetMapping(value = { "/deleteKH" })
	public String deleteKhachHang(Model model, @ModelAttribute(name = "khachHang") KhachHang khachHang,
			@RequestParam(name = "maKH") String maKH) {

		hangService.deleteKhachHang(maKH);
		return "redirect:/listKhachHang";
	}

	@GetMapping(value = { "/updateKH" })
	public String updateKhachHang(Model model, @ModelAttribute(name = "khachHang") KhachHang khachHang,@RequestParam(name = "maKH") String maKH) {
	    KhachHang khHang =   hangService.getById(maKH);
	    model.addAttribute(khHang);
		return "KhachHang";
	}
    
	@GetMapping(value = { "/searchKH" })
	public String seachKH (Model model, @ModelAttribute(name = "khachHang") KhachHang khachHang,@RequestParam(name = "tenKH") String tenKH) {
		List<KhachHang>khachHang2 = hangService.searchKh(tenKH);
		model.addAttribute("listSearchKh", khachHang2);
		khachHang.setTenKH("");
		return "DanhSachKH";
		
	}
	
	@GetMapping("/list")
	public String getAllmayWithPageAble(Model model, @RequestParam(defaultValue = "1") Integer page) {
		PageAble pageAble = new PageAble(page);
		List<KhachHang> khachHangs = hangService.findWithPageAble(pageAble);
		model.addAttribute("khachHangs", khachHangs);
		model.addAttribute("totalPages", hangService.totalPages(pageAble));
		model.addAttribute("currentPage", page);
		return "redirect:/listKhachHang";
	}
	


}
