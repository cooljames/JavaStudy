package study;
import java.util.Scanner;

/*
 * @author James
 * 
 * ===============================
 * �ó�����
 *  - �������� �����ϰ��� �Ѵ�.
 *  - �������� ��� ����
 * -------------------------------
 *            ����
 *        
 *       ������  ����  ���         ���� �߻� Ŭ������ �ۼ�
 *             |    \
 *             ������   ����
 *  
 *    ==================
 *    //��� ���� ���� Ŭ���� -> class class
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
		
		System.out.println("����~~!");
		
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
		
		System.out.println("������ ���߰� ��~~~!");
	}
	public abstract void Swimming();
	private int AirTank;//�η�
	
	
}

class Bass extends Fish{

	@Override
	public void Swimming() {
		// TODO Auto-generated method stub
		System.out.println("���� ����!~");
	}

	@Override
	public void feeding() {
		// TODO Auto-generated method stub
		System.out.println("���� ����⸦ �Դ´�");
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




