//�ó�����
//��� ���� ���α׷�
//������ ����!!
// 1.������  2.�˹�

// ������: ����
// �˹�: �ñ�, �ð�

//****************************** 
// 1. ��� �߰�  2. ��� ����  3. ���� �ֱ�(����ü�谡 �ٸ� ��) �������̵� ó��, �θ� Ŭ���� �ϳ��� ��ü ��� ����.
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
		public void Work(){System.out.println("�Ϸ翡 ���ð� ���ؿ�.");
	}


public class _09_15_Upcast {
	 public void main(String[] args){
		 Emp[] EmpList = new Emp[5]; // �θ� Ŭ������ ���� �迭�� ����� �ڽ� ��ü�� � Ÿ���̵� �� �� �ִ�.
		     // � �Լ��� ������ ���ΰ��� �����ϴ� �߿� �����ϰ� �ȴ�.(������)
		 
		 EmpList[0] = new CEO(2, "���׽ý�");
		 EmpList[1] = new CEO(1, "���׽ý�");
		 EmpList[2] = new CEO(1, "���׽ý�");
		 EmpList[3] = new CEO(1, "���׽ý�");
		 EmpList[4] = new CEO(1, "���׽ý�");
		 
		 Emp e1 = new PartTimeEmp(2, "3");
		 Emp e2 = new CEO(1, "���׽ý�");
		 e2.Work(); // Dynamic Binding
		 
		 
		 for(Emp e:EmpList)
			 e.Work();
	  }
	 }
	}
}
