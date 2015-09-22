/**
 * @author James
 * 
 * ========================================
 * >> 추상 클래스 <<
 * - 실제 객체화는 하지 않지만 상속만을 위해서 작성되어진 클래스
 * - 1개 이상의 추상 메서드를 포함!(필드와 메서드도 들어감)
 * 추상메서드란 
 * -> 실제 (행동)은 존재하지 않지만 자식 클래스의 구현을 기대하는 매서드!
 * ========================================
 * 
*/

abstract class Car  // 자식 클래스에 상속을 위해 의도적으로 만든다.
{
	private int Fuel; // 연료
	
	// 추상 메서드: 부모에서든 구현은 하지 않지만 자식에서 반드시 오버라이드 해서 구현 한다.
	public abstract void Go(); // {}가 필요없다. => 추상 메서드
	public void Stop(){
		
		System.out.println("브레이크 밟았어요.");
	}; 
	
}

class E_Car extends Car
{

	@Override
	public void Go() {
		// TODO Auto-generated method stub
		System.out.println("Motor 구동 ~~!");
		
	}

	
}

class BUS extends Car{

	@Override
	public void Go() {
		// TODO Auto-generated method stub
		System.out.println("갑니다~~!");
	}

}

public class _09_16_Abstraction {
	
	public static void main(String[] args){
		
 }
	
}
