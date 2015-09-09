/**
 *  java언어의 변수들....
 *   -> 저장소 --> 메모리의 어느 영역에 저장되어지느냐?
 *   main함수는 만들어두면 시스템에 의해서 호출한다.
 *   (만들어두면 시스템이, 운영체제 등이 호출하는 함수를 callback함수라고 한다.)
 *   
 *   스택Memory(먼저 들어오면 먼저 나간다.fifo)
 *  1)지역변수 : 메소드 내에서 선언된 변수(함수의 stack)  
 *  2)멤버변수(필드) : 클래스에 선언되어진 변수들
 *      - 인스턴스 변수(instance) : 객체마다 생성되는 변수
 *      - 클래스 변수(Static Member 변수) : 클래스당 1개만 생성되는 변수
 *      Starcraft Marine은 
 *  3)
 */

/**
 * @author James
 */

class Marine
		{
			//속성
			int kills;          // 변화  - 계속 변하므로 객체마다 생성해야 함. : instance field
			int power;          // 변화 
	
			static	int cost;           // 변화하지 않음 
			//- 세 변수는 모아서 static에 생성함 : static field(클래스변수: 클래스당 1개 생성)
			//	클래스로 부터 생성해서 모두가 공유 
			// 
			static	int attack_power;   // 변화하지 않음
			static	int defense_power;  // 변화하지 않음
			
			
			//행동
			
			void attack(){}
			void move(){System.out.println("gogogo!");}
		}
// =================
// 비트 대학교 관리 프로그램
// =================
class BitSchool
{
	int Student_No; // 학번
	static String EstablishDay;
}

public class _09_09_Variable_Field {

	/**
	 * @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 마린이 없는 상태에서 마린의 공격력 업그레이드가 가능한가?
		// 객체가 없는 상태에서도 클래스를 통해서 접근 사용 가능
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		System.out.println(++Marine.attack_power);
		
		m1.attack();
		m2.move();

	}

}
