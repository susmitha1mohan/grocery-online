package model.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Past;


@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	
	@Column(name="ProductName")
	private String pName = null;
	
	@Column(name="ProductCost")
	private String pCost;
	
	private int pQty;
	@Past
	private Date pDOM;

	private String email;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public Date getpDOM() {
		return pDOM;
	}
	public void setpDOM(Date pDOM) {
		this.pDOM = pDOM;
	}
	public Product() {
		
	}
	
	
	public Product(String pName, String pCost, int pQty, Date pDOM, String email) {
		super();
		this.pName = pName;
		this.pCost = pCost;
		this.pQty = pQty;
		this.pDOM = pDOM;
		this.email = email;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCost() {
		return pCost;
	}
	public void setpCost(String pCost) {
		this.pCost = pCost;
	}
	

}
