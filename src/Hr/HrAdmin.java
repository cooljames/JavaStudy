package Hr;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class HrAdmin {
	public static String EName;

	public static  String Etype; // 파트

	public static  String Ebirthday;

	public  static String EAddress;

	public  static String EPosition;




	public HrAdmin(String eName, String etype, String ebirthday, String eAddress, String ePosition) {

		super();

		EName = eName;

		Etype = etype;

		Ebirthday = ebirthday;

		EAddress = eAddress;

		EPosition = ePosition;




	}

	

	HrAdmin EmpHr = new HrAdmin(EName, Etype, Ebirthday, EAddress, EPosition);







	private static void EmployeeAdd() {

		

		Scanner  hrInput = new Scanner(System.in);

		String EmpHr = hrInput.nextLine();
		
		System.out.println(EmpHr);




		System.out.println("**********************************************");

		System.out.println("* 등록해주세요~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! *");

		System.out.println("**********************************************");

		System.out.println("");




				System.out.println("수고하셨습니다!");

	}




	public static void EmployeeDel() {

	}




	public static void CalcSalary() {

	}

	// 사원추가




	// 사원삭제




	// 월급

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Date now = new Date();

		SimpleDateFormat nowKdate = new SimpleDateFormat("yyyy년 MM월 dd일, E요일, hh시 mm분 ss초");




		System.out.println("지금은 " + nowKdate.format(now));

		System.out.println("----------------------------------------");

		System.out.println("행복한 하루 보내시고, 원하시는 메뉴를 선택해주세요.^^");

		System.out.println("*****************************************");

		System.out.println("*  1.사원등록 2.사원추가 3.급여 4.초기화 0.종료  *");

		System.out.println("*****************************************");

		System.out.println("              Edu 사원관리 프로그램 ver 0.009");

		System.out.println("/");




		Scanner scan = new Scanner(System.in);

		int inputNum = scan.nextInt(); // 입력받음




		switch (inputNum) {




		case 1:

			EmployeeAdd();

			break;

		case 2:

			EmployeeDel();

			break;

		case 3:

			CalcSalary();

			break;

		case 4:

		case 0:

			break;

		}




	}




}
