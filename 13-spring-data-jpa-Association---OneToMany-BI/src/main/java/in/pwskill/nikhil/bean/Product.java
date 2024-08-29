package in.pwskill.nikhil.bean;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Product_Association_1---*_uni")
public class Product implements Serializable {
   Product()
   {
	 
   }
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	@Column(name = "productname")
	private String pname;
	@Column(name = "productrate")
	private Integer prate;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "pFK")
    private	List<Model>model;

	public Integer getPid() {
		return pid;
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

	public Integer getPrate() {
		return prate;
	}

	public void setPrate(Integer prate) {
		this.prate = prate;
	}

	public List<Model> getModel() {
		return model;
	}

	public void setModel(List<Model> model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", prate=" + prate + ", model=" + model + "]";
	}

	public Product(Integer pid, String pname, Integer prate, List<Model> model) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prate = prate;
		this.model = model;
	}

}
