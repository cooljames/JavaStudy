package Hr;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class HrAdmin {
	public static String EName;

	public static  String Etype; // ��Ʈ

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

		System.out.println("* ������ּ���~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! *");

		System.out.println("**********************************************");

		System.out.println("");




				System.out.println("�����ϼ̽��ϴ�!");

	}




	public static void EmployeeDel() {

	}




	public static void CalcSalary() {

	}

	// ����߰�




	// �������




	// ����

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Date now = new Date();

		SimpleDateFormat nowKdate = new SimpleDateFormat("yyyy�� MM�� dd��, E����, hh�� mm�� ss��");




		System.out.println("������ " + nowKdate.format(now));

		System.out.println("----------------------------------------");

		System.out.println("�ູ�� �Ϸ� �����ð�, ���Ͻô� �޴��� �������ּ���.^^");

		System.out.println("*****************************************");

		System.out.println("*  1.������ 2.����߰� 3.�޿� 4.�ʱ�ȭ 0.����  *");

		System.out.println("*****************************************");

		System.out.println("              Edu ������� ���α׷� ver 0.009");

		System.out.println("/");




		Scanner scan = new Scanner(System.in);

		int inputNum = scan.nextInt(); // �Է¹���




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
