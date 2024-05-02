package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ename;
	private long  enumber;
	private String Address;
	private String test;
	private String cname;
	

	
	
	public Employee() {
	}
	

	public Employee(String ename, long enumber, String address, String test, String cname) {
		super();
		this.ename = ename;
		this.enumber = enumber;
		Address = address;
		this.test = test;
		this.cname = cname;
	}


	public Employee(String ename, long enumber, String address, String test) {
		super();
		this.ename = ename;
		this.enumber = enumber;
		Address = address;
		this.test = test;
	}

	public Employee(String ename, long enumber, String address) {
		super();
		this.ename = ename;
		this.enumber = enumber;
		Address = address;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getEnumber() {
		return enumber;
	}

	public void setEnumber(long enumber) {
		this.enumber = enumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}


	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", enumber=" + enumber + ", Address=" + Address + ", test=" + test
				+ ", cname=" + cname + "]";
	}

	
}

