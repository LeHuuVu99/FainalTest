package vu.com.genaral.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class May {
	@Id
	private String maMay;
	
	private String viTri;
	private String trangThai;
	
	

	@OneToMany(mappedBy = "may",cascade = CascadeType.ALL)
	private List<SuDungMay>suDungMay;

	

	public String getMaMay() {
		return maMay;
	}



	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}



	public String getViTri() {
		return viTri;
	}



	public void setViTri(String viTri) {
		this.viTri = viTri;
	}



	public String getTrangThai() {
		return trangThai;
	}



	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}



	public List<SuDungMay> getSuDungMay() {
		return suDungMay;
	}



	public void setSuDungMay(List<SuDungMay> suDungMay) {
		this.suDungMay = suDungMay;
	}



	public May() {
		super();
		// TODO Auto-generated constructor stub
	}



	public May(String maMay, String viTri, String trangThai, List<SuDungMay> suDungMay) {
		super();
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
		this.suDungMay = suDungMay;
	}



	@Override
	public String toString() {
		return "May [maMay=" + maMay + ", viTri=" + viTri + ", trangThai=" + trangThai + ", suDungMay=" + suDungMay
				+ "]";
	}

	
	

}
