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
		System.out.println("키패드를 눌러서 전화를 합니다.");
	} 
	public void Msg( String CallNo,  String msg ) 
	{
		System.out.println("천지인 키패드로 문자를 입력 !! ");
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
	 
	 public void Send( String CallNo   ) {  System.out.println("터치 입력 방식  ");  } 	 
}


public class _09_15_Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp =  new SmartPhone("4885", "Android");
		sp.Send("4885"); // 자식에서 재정의 한 메서드가 호출 !! 
		sp.Msg("4885", "당일대출 500가능 !");
	}

}
