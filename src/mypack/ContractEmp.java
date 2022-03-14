package mypack;

public class ContractEmp extends Emp {
	private int contractDur;
	
	public ContractEmp() {
		super();
		contractDur=0;
	}
	public ContractEmp(int empno, String ename, String loc, int contractDur) {
		super(empno, ename, loc);
		this.contractDur=contractDur;
	}
	
	public String toString() {
		String info = super.toString();
		info+="\nContract duration : "+contractDur;
		return info;
	}

}
