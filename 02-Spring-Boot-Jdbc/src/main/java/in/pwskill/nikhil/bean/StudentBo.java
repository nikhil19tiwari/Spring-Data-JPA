package in.pwskill.nikhil.bean;

public class StudentBo {
private Integer sid;
private String saddress;
private Integer sage;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}
public Integer getSage() {
	return sage;
}
public void setSage(Integer sage) {
	this.sage = sage;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
private String sname;
@Override
public String toString() {
	return "StudentBo [sid=" + sid + ", saddress=" + saddress + ", sage=" + sage + ", sname=" + sname + "]";
}

}
