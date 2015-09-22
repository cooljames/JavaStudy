/**
 * @author James
 * ===============================
 *    interface  코드를 고급 스럽게 한다. // 접점. 공통점
 * ===============================
 * - 클래스와 클래스가 만나는 방법
 * - 클래스간 공통의 행동을 통해서 만날 수 있게 접근하는 방식을 구현!
 * - 추상클래스 보다 더 추상화된  클래스: 즉 상속을 위해서만 사용!!
 */

abstract class Sport
{
	public abstract void Run();
	public abstract void Walk();
}

abstract class BasketBall implements Sports
{ // 1.static final 상수 2. public abstract Method
	public void play(){} 	
	public void end(){}
}

public class _09_17_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasketBall bb = new Sport();

	}
}
