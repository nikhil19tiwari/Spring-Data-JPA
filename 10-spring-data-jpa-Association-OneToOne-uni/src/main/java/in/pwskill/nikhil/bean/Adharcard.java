package in.pwskill.nikhil.bean;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Adharcard_Association_1---1_uni")
public class Adharcard implements Serializable {
	Adharcard(){
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	@Column(name = "aadharname")
	private String aname;
	@Column(name = "adharage")
	private Integer aage;
	@Column(name = "aadharaddress")
	private String aaddress;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Integer getAage() {
		return aage;
	}
	public void setAage(Integer aage) {
		this.aage = aage;
	}
	public String getAaddress() {
		return aaddress;
	}
	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}
	@Override
	public String toString() {
		return "Adharcard [aid=" + aid + ", aname=" + aname + ", aage=" + aage + ", aaddress=" + aaddress + "]";
	}
	public Adharcard(Integer aid, String aname, Integer aage, String aaddress) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.aage = aage;
		this.aaddress = aaddress;
	}

}
