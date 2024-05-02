package serialization;

import java.io.Serializable;

public class Product implements Serializable{
	
	// private static final long serialVersionUID = 1009998888L;
	private long pid;
	private String pname;
	private double pcast;
	private String test;
	public Product(long pid, String pname, double pcast, String test) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcast = pcast;
		this.test = test;
	}

	public Product() {
		
	}

	public Product(long pid, String pname, double pcast) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcast = pcast;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPcast() {
		return pcast;
	}

	public void setPcast(double pcast) {
		this.pcast = pcast;
	}
	

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcast=" + pcast + ", test=" + test + "]";
	}

	
		
	
	
		
	}


