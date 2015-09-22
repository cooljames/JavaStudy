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
 *    ==================
 *    //��� ���� ���� Ŭ���� -> class class
 *
 */
abstract class _Animal{
	
	private int Ages;
	public _Animal(){}; 
	private String Color;
	
	public int getAges() {
		return Ages;
	}
	public void setAges(int ages) {
		Ages = ages;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public _Animal(int ages, String color, int height, int weight) {
		super();
		Ages = ages;
		Color = color;
		Height = height;
		Weight = weight;
	}
	private int Height;
	private int Weight;
	
	public abstract void Alive();
	public abstract void Die();
	
	
}

abstract class Mammal extends _Animal{
	
	public Mammal(int ages, String color, int height, int weight) {
		super(ages, color, height, weight);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void Run();


	private int AmountOfLeg;
	public int getAmountOfLeg() {
		return AmountOfLeg;
	}


	public void setAmountOfLeg(int amountOfLeg) {
		AmountOfLeg = amountOfLeg;
	}


	public String getColorOfEye() {
		return ColorOfEye;
	}


	public void setColorOfEye(String colorOfEye) {
		ColorOfEye = colorOfEye;
	}


	private String ColorOfEye;

	
	class Rabbit extends Mammal{
		

		public Rabbit(int ages, String color, int height, int weight) {
			super(ages, color, height, weight);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void Alive() {System.out.println("�߻�� �ִٿ�~!");}
		@Override
		public void Die() {System.out.println("����߽��ϴ�!~");}
		@Override
		public void Run() {	System.out.println("�ų��� �޷���~");}
		
		
		Rabbit redrabbit = new Rabbit(2, "red", 50, 6);
		
		
	}
		
}

abstract class Bird extends _Animal{

	public Bird(int ages, String color, int height, int weight) {
		super(ages, color, height, weight);
		// TODO Auto-generated constructor stub
		
	}

}

abstract class Fish extends _Animal{

	public Fish(int ages, String color, int height, int weight) {
		super(ages, color, height, weight);
		// TODO Auto-generated constructor stub
	}
	
	
}



public class _09_16_Zoo {
	
	private static  Scanner scan =  new Scanner(System.in);
	private static  _Animal [] _AnimalList =  new _Animal[100]; 
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
