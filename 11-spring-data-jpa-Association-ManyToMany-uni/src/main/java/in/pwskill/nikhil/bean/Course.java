package in.pwskill.nikhil.bean;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Course_Association_*---*_Uni")
public class Course implements Serializable {
	Course(){
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
	@Column(name = "coursename")
    private String  cname;
	@Column(name = "courseprice")
    private Integer cprice;
	@Column(name = "coursedate")
    private String date;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getCprice() {
		return cprice;
	}
	public void setCprice(Integer cprice) {
		this.cprice = cprice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + ", date=" + date + "]";
	}
	public Course(Integer cid, String cname, Integer cprice, String date) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
		this.date = date;
	}
	
}
