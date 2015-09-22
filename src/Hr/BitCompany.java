package Hr;
import java.util.Scanner;

//    시나리오 
//=============================================
//  사원관리 프로그램 
//  직원의 종류 !! 
//    1.  정규직   2.  알바 
//     정규직 :  연봉  
//     알바 :  시급 , 시간 
//=============================================
//  1. 사원추가  2. 사원 삭제 3.  월급주기  
//=============================================

class Empl 	//  기본 사원 
{
		private int EmplNo;  // 사원 번호 
		private String EmplName; // 이름 
		
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
			System.out.println( "사원번호 : "  ); 
			this.EmplNo =  scan.nextInt(); 
			System.out.println( "이름  : "  );
			this.EmplName =scan.next(); 
		} 				 
}

class GeneralEmpl extends Empl 
{

	private double Salary; // 연봉 !! 

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
		super.EmplInsert(); // 부모의 필드는 부모의 메서드에서 입력 !! 
		Scanner scan =  new Scanner(System.in);
		System.out.println( "연봉 : " );
		this.Salary = scan.nextDouble(); 
	}
}

class PartTimeEmpl extends Empl 
{
	private int count;  // 시간 
	private int pay; 	  // 시급 	
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
		System.out.println( "시급 : " );
		this.pay = scan.nextInt(); 
		System.out.println( "시간 : " );
		this.count = scan.nextInt(); 
	}
}

public class BitCompany {
	private static  Scanner scan =  new Scanner(System.in);
	private static  Empl [] EmplList =  new Empl[10]; 
	
	// 추가 
	public static void Insert() 
	{	
		 int i; 
		 int Select  = 0; 
		 System.out.println("1. 정규직   2. 파트타임 "); 
		 Select = scan.nextInt();
		 for ( i= 0; i < EmplList.length; i++) {
			if( EmplList[i] == null )
				break;
		}
		 if( Select == 1) 
			 EmplList[i] =  new GeneralEmpl();
		 else 
			 EmplList[i] =  new PartTimeEmpl();
		 
		 EmplList[i].EmplInsert(); // 다형성 구현
		 
	}
	// 삭제 
	public static void Delete()
	{
		int no; 
		System.out.println("번호 : ");
		no = scan.nextInt(); 
		for (int i = 0; i < EmplList.length; i++) {
			if(EmplList[i]!= null && EmplList[i].getEmplNo() ==no)
				EmplList[i] = null;
		} 
	}
	// 월급 
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
		while(true)	// 메뉴 !! 
		{
			System.out.println("1. 입사 ");
			System.out.println("2. 퇴사 ");
			System.out.println("3. 급여 "); 
			System.out.println("0. 종료 ");
			Select  = scan.nextInt(); 
			
			switch( Select  )
			{
			case 1: 	Insert(); 	break; 
			case 2:  Delete();  break;
			case 3:  CalcSalary(); break; 
			case 0:  return;
			default :  System.out.println("잘못된 입력입니다."); 
			}
		}
	}

}





