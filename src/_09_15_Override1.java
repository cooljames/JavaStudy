/**   =========
 *   * 오버라이딩
 *   ===========
 *   
 *   --> 부모 클래스에서 정의동 행동을 자식 클래스에서 새롭게 다시 정의 하는 것!
 *   오버로딩: 같은 이름의 함수가 매개 변수의 갯수와 타입에 따라 서로 다르게 인식되는 것
 *    / 1개의 클래스에 같은 이름의 메소드가 여러개 존재!
 *    
 *   --> 상속관계에서 부모의 메소드(행동)을 그대로 상속받아 사용하는 것이 아니라
 *   자식클래스에서 새로운 행동을 정의하는 것! -> 재정의!(오버라이딩)
 *    
 */

/**
 * @author James 09-15
 *
 */

class animal
{
	public void Crying(){
		System.out.println("동물");
	}
	public void Sleep(){
		System.out.println("잔다~~~!");
	}
	public String Name(){
		System.out.println(this + "이다");
		return null;
	}
}


class Cat extends animal
{
	public void Crying() {System.out.println("야옹");}
}

class Dog extends animal
{
	public void Crying() {System.out.println("멍멍");}
}




public class _09_15_Override1 {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.Crying();
		Dog dog = new Dog();
		dog.Crying();
		dog.Sleep();
		cat.Name();
		cat.Sleep();
	}

}
