package Hr;
//�ó�����
//��� ���� ���α׷�
//������ ����!!
// 1.������  2.�˹�

// ������: ����
// �˹�: �ñ�, �ð�

//****************************** 
// 1. ��� �߰�  2. ��� ����  3. ���� �ֱ�(����ü�谡 �ٸ� ��) �������̵� ó��, �θ� Ŭ���� �ϳ��� ��ü ��� ����.
//******************************



//    �ó����� 
//=============================================
//  ������� ���α׷� 
//  ������ ���� !! 
//    1.  ������   2.  �˹� 
//     ������ :  ����  
//     �˹�   :  �ñ� , �ð� 
//=============================================
//  1. ����߰�  2. ��� ���� 3.  �����ֱ�  
//=============================================

class Emp 	//  �⺻ ��� 
{
		private int EmpNo;  // ��� ��ȣ 
		private String EmpName; // �̸� 
		
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

	private double Salary; // ���� !! 

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
		return  Salary/12; // ���� !! 
	}
}




	






public class BitComp {
	
	private Emp [] EmpList =  new Emp[10]; 
	
	// �߰� 
	// ���� 
	// ���� 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			
		}
	}

}
