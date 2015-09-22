package study;
import java.util.Scanner;

/*
 * @author James
 * 
 * ===============================
 * 시나리오
 *  - 동물원을 구현하고자 한다.
 *  - 계층적인 상속 구조
 * -------------------------------
 *            동물
 *        
 *       포유류  조류  어류         전부 추상 클래스로 작성
 *             |    \
 *             독수리   베스
 *  
 *    ==================
 *    //모든 동물 조상 클래스 -> class class
 *
 */
public class _09_16_Zoo2{
	
abstract class Animal{
	
	private int age;
	public Animal(){this(1);}
	public Animal(int age){this.age = age;}
	
	public abstract void feeding();
	public abstract void sleeping();
	
}

abstract class Bird extends Animal
{
	public abstract void Fly();
	public void Sleeping(){
		System.out.println("zzzzZZzzzz!");
	}
}

class Egles extends Bird
{

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly~~~~~~~! ^,^");
		
	}

	@Override
	public void feeding() {
		// TODO Auto-generated method stub
		
		System.out.println("묵자~~!");
		
	}

	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Fish extends Animal
{

	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		
		System.out.println("물고기는 눈뜨고 자~~~!");
	}
	public abstract void Swimming();
	private int AirTank;//부레
	
	
}

class Bass extends Fish{

	@Override
	public void Swimming() {
		// TODO Auto-generated method stub
		System.out.println("후진 가능!~");
	}

	@Override
	public void feeding() {
		// TODO Auto-generated method stub
		System.out.println("토종 물고기를 먹는다");
	}
	
}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Animal[] AnimalList = new Animal[10];
	   
	   AnimalList[0] = new Egles();
	   AnimalList[1] = new Bass();
	
	   
	   for(Animal animal: AnimalList){
		   if(animal!= null)
			   animal.feeding();
	   }
	   
	}
}




