package mypack;

public class Launcher {

	public static void main(String args[]) {
		SalEmp e1 = new SalEmp(1001,"Anil","Delhi",5200);
		e1.salIncr(800);
		ContractEmp e2 = new ContractEmp(1002,"Anita","BLR",100);
		SalEmp e3 = new SalEmp(1003,"Anu","KOL",3200);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("No. of Employee "+Emp.getEmpcount());
	}
}
