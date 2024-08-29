package in.pwskill.nikhil.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
@Entity
@Table(name = "collection_emp")
public class Employee implements Serializable {

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
	private String eddress;
	
	// for List part
	@ElementCollection
	@Column(name = "friends_list")
	@CollectionTable(name = "collection_friends",joinColumns = 
	                 @JoinColumn(name = "eidFk",referencedColumnName = "eid"))
	@OrderColumn(name = "position")
	List<String> friends;
    
	// for set part
	@ElementCollection
	@Column(name = "phoneNumber")
	@CollectionTable(name = "collection_set",joinColumns =
	                @JoinColumn(name = "eidFK",referencedColumnName = "eid"))
	Set<Integer> phoneNumber; 
	
	// for map part
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eddress=" + eddress + ", friends="
				+ friends + ", phoneNumber=" + phoneNumber + ", bankDetails=" + bankDetails + "]";
	}

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

	public String getEddress() {
		return eddress;
	}

	public void setEddress(String eddress) {
		this.eddress = eddress;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Set<Integer> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set<Integer> set) {
		this.phoneNumber = set;
	}

	public Map<String, Integer> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(Map<String, Integer> bankDetails) {
		this.bankDetails = bankDetails;
	}

	@ElementCollection
	@Column(name ="bankDetails")
	@CollectionTable(name = "collection_map",
	                 joinColumns = @JoinColumn(name = "eidFK",referencedColumnName = "eid"))
	@MapKeyColumn(name = "keyColumn")
	Map<String, Integer> bankDetails;
}
