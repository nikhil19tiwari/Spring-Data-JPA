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
@Table(name = "Person_Association_1---1_uni")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
	@Column(name = "personname")
    private String pname;
	@Column(name = "personage")
    private Integer page;
	@Column(name ="personaddress")
    private String paddress;
    
    public Integer getPid() {
		return pid;
	}

	public Person(Integer pid, String pname, Integer page, String paddress, Adharcard aadhar) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.paddress = paddress;
		Aadhar = aadhar;
	}
    Person(){
    	
    }
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", paddress=" + paddress + ", Aadhar="
				+ Aadhar + "]";
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public Adharcard getAadhar() {
		return Aadhar;
	}

	public void setAadhar(Adharcard aadhar) {
		Aadhar = aadhar;
	}
	
    @ManyToOne
    @JoinColumn(name = "PFk",unique = true)
	private Adharcard Aadhar;
}
