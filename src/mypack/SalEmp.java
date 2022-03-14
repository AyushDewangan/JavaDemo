package mypack;

public class SalEmp extends Emp {
	
	int sal;
	public SalEmp(){
		super();
		sal = 0;
	}
	
	public SalEmp(int empno, String ename, String loc, int sal) {
		super(empno, ename, loc);
		this.sal= sal; 
	}

	public void salIncr(int x) {
		this.sal+=x;
	}
	public String toString() {
		String info="\nSalary : "+sal;
		return info;
	}
	
}