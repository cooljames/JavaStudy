package Hr;
import java.util.Scanner;

//    �ó����� 
//=============================================
//  ������� ���α׷� 
//  ������ ���� !! 
//    1.  ������   2.  �˹� 
//     ������ :  ����  
//     �˹� :  �ñ� , �ð� 
//=============================================
//  1. ����߰�  2. ��� ���� 3.  �����ֱ�  
//=============================================

class Empl 	//  �⺻ ��� 
{
		private int EmplNo;  // ��� ��ȣ 
		private String EmplName; // �̸� 
		
		public int getEmplNo(){ return EmplNo; }
		public String getEmplName(){ return EmplName; }
		
		public Empl() {} 
		public Empl(  int no , String name )
		{
			EmplNo = no; 
			EmplName = name; 
		} 
		
		public  double  GetSalary( ){  return 0; }  // 
		public  void  EmplInsert()
		{
			Scanner scan =  new Scanner(System.in);
			System.out.println( "�����ȣ : "  ); 
			this.EmplNo =  scan.nextInt(); 
			System.out.println( "�̸�  : "  );
			this.EmplName =scan.next(); 
		} 				 
}

class GeneralEmpl extends Empl 
{

	private double Salary; // ���� !! 

	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public GeneralEmpl(){} 
	public GeneralEmpl( int no,  String name,  double sal  ) 
	{
		super( no , name );
		Salary = sal; 
	}
	@Override
	public double GetSalary() {
		// TODO Auto-generated method stub
		return  Salary/12;
	}
	@Override
	public void EmplInsert() {
		// TODO Auto-generated method stub
		super.EmplInsert(); // �θ��� �ʵ�� �θ��� �޼��忡�� �Է� !! 
		Scanner scan =  new Scanner(System.in);
		System.out.println( "���� : " );
		this.Salary = scan.nextDouble(); 
	}
}

class PartTimeEmpl extends Empl 
{
	private int count;  // �ð� 
	private int pay; 	  // �ñ� 	
	public PartTimeEmpl(){} 
	public PartTimeEmpl(int  no, String name, int count, int pay) {
		super(no , name) ; 
		this.count = count;
		this.pay = pay;
	}
	
    public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public double GetSalary() {   return count * pay;     }
	public void EmplInsert()
	{
		super.EmplInsert();
		Scanner scan =  new Scanner(System.in);
		System.out.println( "�ñ� : " );
		this.pay = scan.nextInt(); 
		System.out.println( "�ð� : " );
		this.count = scan.nextInt(); 
	}
}

public class BitCompany {
	private static  Scanner scan =  new Scanner(System.in);
	private static  Empl [] EmplList =  new Empl[10]; 
	
	// �߰� 
	public static void Insert() 
	{	
		 int i; 
		 int Select  = 0; 
		 System.out.println("1. ������   2. ��ƮŸ�� "); 
		 Select = scan.nextInt();
		 for ( i= 0; i < EmplList.length; i++) {
			if( EmplList[i] == null )
				break;
		}
		 if( Select == 1) 
			 EmplList[i] =  new GeneralEmpl();
		 else 
			 EmplList[i] =  new PartTimeEmpl();
		 
		 EmplList[i].EmplInsert(); // ������ ����
		 
	}
	// ���� 
	public static void Delete()
	{
		int no; 
		System.out.println("��ȣ : ");
		no = scan.nextInt(); 
		for (int i = 0; i < EmplList.length; i++) {
			if(EmplList[i]!= null && EmplList[i].getEmplNo() ==no)
				EmplList[i] = null;
		} 
	}
	// ���� 
	public static void CalcSalary() 
	{
		for (Empl Empl : EmplList) {
			if(Empl != null )
			   System.out.println( Empl.GetSalary() ) ;
		}
	}

	public static void main(String[] args) {
		
	
		int Select  = 0; 
		// TODO Auto-generated method stub
		while(true)	// �޴� !! 
		{
			System.out.println("1. �Ի� ");
			System.out.println("2. ��� ");
			System.out.println("3. �޿� "); 
			System.out.println("0. ���� ");
			Select  = scan.nextInt(); 
			
			switch( Select  )
			{
			case 1: 	Insert(); 	break; 
			case 2:  Delete();  break;
			case 3:  CalcSalary(); break; 
			case 0:  return;
			default :  System.out.println("�߸��� �Է��Դϴ�."); 
			}
		}
	}

}





