class  Phone 
{
	private String PhoneNo;

	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}  
	
	public Phone(String No) 
	{
		PhoneNo = No;
	}
	public void Send( String CallNo ) 
	{
		System.out.println("Ű�е带 ������ ��ȭ�� �մϴ�.");
	} 
	public void Msg( String CallNo,  String msg ) 
	{
		System.out.println("õ���� Ű�е�� ���ڸ� �Է� !! ");
	}
}

class SmartPhone extends Phone
{
	 private String OS; 
	 
	 public String getOS() {
		return OS;
	}

	 public SmartPhone(  String No, String Os )
	 {
		 super( No );
		 Os = Os;
	 }
	 
	 public void Send( String CallNo   ) {  System.out.println("��ġ �Է� ���  ");  } 	 
}


public class _09_15_Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp =  new SmartPhone("4885", "Android");
		sp.Send("4885"); // �ڽĿ��� ������ �� �޼��尡 ȣ�� !! 
		sp.Msg("4885", "���ϴ��� 500���� !");
	}

}
