
public class _09_14_Inheritance {
	
	/**
	* =============
	* 상속
	* 
	*  --> 부모의 것을 그대로 물려 받는것 !!
	*  --> 부모에서 작성한 코드를 자식에서 그대로 물려 받아 사용 --> 구현 상속
	*   - 구현 상속: 부모의 구현(코드)를 그대로 상속받아 사용
	*   - 인터페이스 상속: 행동의 가능을 공통첨을 상속 받는것 --> interface
	* =============
	* is - 관계!!
	* 
	*  --> ~~은 ~~이다. --> ex) 사자는 동물이다? 
	*/

	class Animal // 부모, 기ㅏㄴ, 기본, super, 상위, class
	{
	}
	
	class Lion extends Animal // 자식, 파생, 하위
	{
		
	}
	
	// ex) Smart 폰!
	// 전화, 카메라, mp3, 인터넷 - 
	
	/**
	 * 전화, 카메라, mp3, 인터넷
	 * - 다중 상속: 여러개의 부모로 부터 상속!! ==> C++
	 *  (다중 상속의 경우 모호성이 발생하게 된다. 따라서 다중상속을 포기하는 클래스도 생기게 되었다. 
	 *  C++의 경우 Mfc가 그렇다)
	 * - 자바는 하나의 부모로부터만 상속하게 된다. 
	 * is a 관계: ~~은 ~~이다. 중 가장 명확한 것으로 부터 상속받는다.
	 * 
	 * ===================================
	 * java언ㅇㅓ에서 C++의 다중 상속을 구현하는 방법
	 * ===================================
	 * is a 관계: ~~은 ~~을 갖고 있다.
	 * 
	 * ===================================
	 * interface를 구현해서 implements하는 방법
	 * ===================================
	 * 
	 */
	
	// class SmartPhone extends Phone, Camera, mp3, internet 이렇게 하지 않는다.
    class Phone
    {
    	private String PhoneNo;
    	public void Send(String SendNo){}
    }
	class Camera {}
	class Mp3{}
	class Internet{}
	
    class SmartPhone extends Phone // 상속은 무조건 하나만 된다.
	{
    	// 포함관계 : 멤버 필드로 다른 클래스의 참조를 갖는다.(인스턴스 객체)
	}
}
