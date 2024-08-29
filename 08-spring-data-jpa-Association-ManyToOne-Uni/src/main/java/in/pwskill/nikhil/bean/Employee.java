package in.pwskill.nikhil.bean;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Employee_Association_*--1_uni")
public class Employee implements Serializable {

	  Employee(){
		  
	  }
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer eid;
	@Column(name = "empname")
   private String ename;
	@Column(name = "empage")
   private Integer eage;
	@Column(name = "empaddress")
   private String eaddress;
   
	@ManyToOne
	@JoinColumn(name = "dFk")
   private Department depart;

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

public Employee(Integer eid, String ename, Integer eage, String eaddress, Department depart) {
	this.eid = eid;
	this.ename = ename;
	this.eage = eage;
	this.eaddress = eaddress;
	this.depart = depart;
}

public String getEaddress() {
	return eaddress;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + ", depart="
			+ depart + "]";
}

public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}

public Department getDepart() {
	return depart;
}

public void setDepart(Department depart) {
	this.depart = depart;
}
   
}
