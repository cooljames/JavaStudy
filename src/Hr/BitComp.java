package Hr;
//시나리오
//사원 관리 프로그램
//직원의 종류!!
// 1.정규직  2.알바

// 정규직: 연봉
// 알바: 시급, 시간

//****************************** 
// 1. 사원 추가  2. 사원 삭제  3. 월급 주기(월급체계가 다른 것) 오버라이딩 처리, 부모 클래스 하나로 전체 사원 관리.
//******************************



//    시나리오 
//=============================================
//  사원관리 프로그램 
//  직원의 종류 !! 
//    1.  정규직   2.  알바 
//     정규직 :  연봉  
//     알바   :  시급 , 시간 
//=============================================
//  1. 사원추가  2. 사원 삭제 3.  월급주기  
//=============================================

class Emp 	//  기본 사원 
{
		private int EmpNo;  // 사원 번호 
		private String EmpName; // 이름 
		
		public int getEmpNo(){ return EmpNo; }
		public String getEmpName(){ return EmpName; }
		
		public Emp() {} 
		public Emp(  int no , String name )
		{
			EmpNo = no; 
			EmpName = name; 
		} 
		
		public  double  GetSalary( ){  return 0; }  // 
		public  void  EmpInsert() {} 				 
}

class GeneralEmp extends Emp 
{

	private double Salary; // 연봉 !! 

	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public GeneralEmp(){} 
	public GeneralEmp( int no,  String name,  double sal  ) 
	{
		super( no , name );
		Salary = sal; 
	}
	@Override
	public double GetSalary() {
		// TODO Auto-generated method stub
		return  Salary/12; // 월급 !! 
	}
}




	






public class BitComp {
	
	private Emp [] EmpList =  new Emp[10]; 
	
	// 추가 
	// 삭제 
	// 월급 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			
		}
	}

}
