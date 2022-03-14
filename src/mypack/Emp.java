package mypack;

public abstract class Emp {
	private int empno;
	private String ename;
	private String loc;
	private static int empCount=0;
	
	public Emp() {
		empno=0;
		ename="NA";
		loc="NA";
	}
	
	public static int getEmpcount() {
		return empCount;
	}
	
	public Emp(int empno,String ename,String loc) {
		this.empno = empno;
		this.ename = ename;
		this.loc = loc;
		empCount++;
	}
	
	public String toString() {
		String info = "\nEmpno : "+empno;
		info+= "\nName : "+ename;
		info+= "\nLoc : "+loc;
		return info;
	}
}
