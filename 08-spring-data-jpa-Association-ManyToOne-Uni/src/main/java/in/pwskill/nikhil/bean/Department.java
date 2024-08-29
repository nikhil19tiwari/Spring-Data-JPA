package in.pwskill.nikhil.bean;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Department_Association_*--1_uni")
public class Department implements Serializable {
    Department(){
    	
    }
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer did;
	@Column(name = "departname")
	private String dname;
	public Integer getDid() {
		return did;
	}
	public Department(Integer did, String dname, String daddress) {
		super();
		this.did = did;
		this.dname = dname;
		this.daddress = daddress;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", daddress=" + daddress + "]";
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDaddress() {
		return daddress;
	}
	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	@Column(name = "departaddress")
	private String daddress;
	
 
}
