package in.pwskill.nikhil.bean;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Association_Uni")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;

	@Column(name = "stdname")
	private String sname;

	@Column(name = "stdage")
	private Integer sage;

	@Column(name = "stdaddress")
	private String saddress;

	@ManyToMany
	@JoinTable(name = "ManyToMany",
		joinColumns = @JoinColumn(name = "sFK"),
		inverseJoinColumns = @JoinColumn(name = "cFK"))
	private List<Course> c;

	public Student() {
	}

	public Student(Integer sid, String sname, Integer sage, String saddress, List<Course> c) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.saddress = saddress;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + ", c=" + c + "]";
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

	public List<Course> getC() {
		return c;
	}

	public void setC(List<Course> c) {
		this.c = c;
	}
}
