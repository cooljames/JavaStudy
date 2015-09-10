/**
 * 
 */


/**
 * @author bit-user
 *
 */

//============================================================
//    static 멤버 함수  :  static method  
//  -->  객체없이 호출가능한 클래스의 행동 !! 
//============================================================

class KoreanPerson 
{
	static String Nation = "대한민국";    // 국적 :  
	String name; 
	int age = 1 ; 
	static
	{
		Nation = "한국";
	}
	
	KoreanPerson()
	{
		this("홍길동");	// this() :  다른 생성자를 호출 !! 
	}
	KoreanPerson(String name )
	{	
		this.name = name;  // this 의미  
	}	
	void BirthDay() 
	{
		age++;
	} 	

	static String KOREA() {  return Nation;   }
	
	
	// static 메서드는 static 필드에만 접근 가능 !! 
	// static 메서드는 객체와는 상관이 없다 !! 
	// 클래스를 통해 접근 하는 메서드 !! 
	/*static int getAge()  // 나이를 가져오는 메서드 !! 
	{
		return age; 
	}*/ 
		
}
public class _09_10_StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KoreanPerson p =  new KoreanPerson(); 
		System.out.println( p.KOREA()  ); 	// 객체를 통한 접근 
		System.out.println( p.Nation    );	// 객체 
		System.out.println( KoreanPerson.Nation  ); //??  Nation static  객체 없이 접근 !! 
		System.out.println( KoreanPerson.KOREA());   //  클래스 이름으로 접근 !! 
		
		
	}

}
