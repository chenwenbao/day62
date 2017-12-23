package cn.itcast.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="cst_customer")
public class Customer implements Serializable{
	
	@Id
	@Column(name="cus_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cusId;
	
	@Column(name="cus_name")
	private String cusName;
	
	@Column(name="cus_sourse")
	private String cusSource;
	
	@Column(name="cus_industy")
	private String cusIndustry;
	
	@Column(name="cus_level")
	private String cusLevel;
	
	@Column(name="cus_addess")
	private String cusAddress;
	
	@Column(name="cus_phone")
	private String cusPhone;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCusId() {
		return cusId;
	}
	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusSource() {
		return cusSource;
	}
	public void setCusSource(String cusSource) {
		this.cusSource = cusSource;
	}
	public String getCusIndustry() {
		return cusIndustry;
	}
	public void setCusIndustry(String cusIndustry) {
		this.cusIndustry = cusIndustry;
	}
	public String getCusLevel() {
		return cusLevel;
	}
	public void setCusLevel(String cusLevel) {
		this.cusLevel = cusLevel;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	public String getCusPhone() {
		return cusPhone;
	}
	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}
	
	
	

}
