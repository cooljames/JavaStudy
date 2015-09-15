//시나리오
//사원 관리 프로그램
//직원의 종류!!
// 1.정규직  2.알바

// 정규직: 연봉
// 알바: 시급, 시간

//****************************** 
// 1. 사원 추가  2. 사원 삭제  3. 월급 주기(월급체계가 다른 것) 오버라이딩 처리, 부모 클래스 하나로 전체 사원 관리.
//******************************



class Emp
{
	private int EmpNo;
	public void getEmpNo(){
		
	}
	public void setEmpNo(int empNo){
		
	}
		public Emp(int EmpNo) { this.EmpNo = EmpNo;}
		public void Work(){}
	
		
	class CEO extends Emp
	{
		private String ComCar;
		
		public CEO(int Empno, String Car)
		{
			super(Empno);
			ComCar  = Car;
		}
		public void Work(){System.out.println("Sign");}
	}
	
	class PartTimeEmp extends Emp
	{
		public String WorkTime;
		public PartTimeEmp(int no, String time)
		{
			super(no);
			this.WorkTime = time;
		}
		public void Work(){System.out.println("하루에 세시간 일해요.");
	}


public class _09_15_Upcast {
	 public void main(String[] args){
		 Emp[] EmpList = new Emp[5]; // 부모 클래스의 참조 배열을 만들면 자식 객체의 어떤 타입이든 들어갈 수 있다.
		     // 어떤 함수를 실행할 것인가를 실행하는 중에 결정하게 된다.(다형성)
		 
		 EmpList[0] = new CEO(2, "제네시스");
		 EmpList[1] = new CEO(1, "제네시스");
		 EmpList[2] = new CEO(1, "제네시스");
		 EmpList[3] = new CEO(1, "제네시스");
		 EmpList[4] = new CEO(1, "제네시스");
		 
		 Emp e1 = new PartTimeEmp(2, "3");
		 Emp e2 = new CEO(1, "제네시스");
		 e2.Work(); // Dynamic Binding
		 
		 
		 for(Emp e:EmpList)
			 e.Work();
	  }
	 }
	}
}
