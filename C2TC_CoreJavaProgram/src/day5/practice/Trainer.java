package day5.practice;

public class Trainer extends Person{
	private String session;
	private String desing;
	private String batchNo;
public String getSession() {

	

}
public String getDesing() {
	return desing;
}
public void setDesing(String desing) {
	this.desing = desing;
}
public String getBatchNo() {
	return batchNo;
}
public void setBatchNo(String batchNo) {
	this.batchNo = batchNo;
}
public void setSession(String session) {
	this.session = session;
}
@Override
public String toString() {
	return "Trainer [session=" + session + ", desing=" + desing + ", batchNo=" + batchNo + ", getSession()="
			+ getSession() + ", getDesing()=" + getDesing() + ", getBatchNo()=" + getBatchNo() + ", getPid()="
			+ getPid() + ", getPname()=" + getPname() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
