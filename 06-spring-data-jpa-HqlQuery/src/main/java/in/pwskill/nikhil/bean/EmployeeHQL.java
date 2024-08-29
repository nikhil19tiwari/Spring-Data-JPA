package in.pwskill.nikhil.bean;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "empRepo")
public class EmployeeHQL implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private Integer eid;
	@Column(name = "ename")
private String ename;
	@Column(name = "eage")
private Integer eage;
	@Column(name = "eaddress")
private String eaddress;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getEage() {
		return eage;
	}
	public void setEage(Integer eage) {
		this.eage = eage;
	}
	public String getEaddress() {
		return eaddress;
	}
	@Override
	public String toString() {
		return "EmployeeHQL [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
	}
	public EmployeeHQL(Integer eid, String ename, Integer eage, String eaddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.eaddress = eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public EmployeeHQL() {
		// default constructor
	}
	
}
