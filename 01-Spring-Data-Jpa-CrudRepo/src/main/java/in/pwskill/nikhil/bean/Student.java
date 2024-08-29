package in.pwskill.nikhil.bean;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "RepoStudent")
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer sid;
	@Column(name = "sname")
private String sname;
	@Column(name = "sage")
private Integer sage;
	@Column(name = "saddress")
private String saddress;
Student(){
	
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
}
public Student(Integer sid, String sname, Integer sage, String saddress) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sage = sage;
	this.saddress = saddress;
}
public Integer getSage() {
	return sage;
}
public void setSage(Integer sage) {
	this.sage = sage;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}

}
