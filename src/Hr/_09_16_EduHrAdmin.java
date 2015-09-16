package Hr;
import java.util.Scanner;

/**
 * @author James
 *
 */
public class _09_16_EduHrAdmin {
	
	private Emp[] EmpList = new Emp[10];
	
	public String EmpType;
	public String EmpName;
	public int Salary;
	public String Parttimer;
	public String RegularEmp;
	public static int InputNo;
	
	
	public static void EmpAdd(){}
	public static void EmpDel(){}
	public static void SendSalary(){}
	// 사원추가
	
	// 사원삭제
	
	// 월급
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("//*****************************************//");
		System.out.println("    사원관리 프로그램  ver 0.001   1.추가  2.삭제  3.급여");
		System.out.println("//*****************************************//");
		Scanner scan = new Scanner(System.in);
		
		while(null != null);
		switch (InputNo)
		{
		case 1:  EmpAdd(); break;
		case 2:  EmpDel(); break;
		case 3:  SendSalary(); break;
		case 0:  break;

		}

	}

}
