package in.pwskill.nikhil.bean;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Model_Association_1---*_uni")
public class Model implements Serializable {
    Model(){
	
    }
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mid;
	@Column(name = "modelname")
    private String mname;
	@Column(name = "modelversion")
    private Double mversion;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Double getMversion() {
		return mversion;
	}
	public Model(Integer mid, String mname, Double mversion) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mversion = mversion;
	}
	@Override
	public String toString() {
		return "Model [mid=" + mid + ", mname=" + mname + ", mversion=" + mversion + "]";
	}
	public void setMversion(Double mversion) {
		this.mversion = mversion;
	}
	
}
