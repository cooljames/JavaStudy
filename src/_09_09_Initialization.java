import java.util.Random;

/**
 * 
 * @author James
 *
 * ======
 *  �ʱ�ȭ
 * ======
 * 
 * 1) ����� ���ÿ� ���� �ʱ�ȭ!!
 *  ex) int CarNo = 0;
 *  	String CarMaker = Benz;
 * 2) �ʱ�ȭ ���� ���� ���
 *   {
 *   ��� ������ �ʱ�ȭ
 *   }
 *   
 * 3) �����ڸ� ���ؼ� �ʵ带 �ʱ�ȭ �Ѵ�.
 *   - static ������<//Ȯ�� ���....>
 *    instance ������
 *    
 *    ================ �������� ���󵵰� ���� ����. 
 *    
 *    // �������� Ư¡
 *     1. Ŭ������ �̸��� ����
 *     2. ������ ����.
 *     3. ����ڰ� �ۼ����� ������ java���� �ƹ��ϵ� ���� �ʴ� �⺻ �����ڸ� �ڵ����� ���������� ����
 *     4. �����ڴ� �޼��� �����ε��� �����ϴ� ==> ���� �̸��� �Լ��� ���� �������� �ۼ��Ǵ� ��, �� �Ű����� ���� Ÿ���� �޶�� �Ѵ�.
 */  

// �������
class BenzCar
{
	int CarNo;  // ������ȣ
    String CarMaker; // ����ȸ�� 
  static double CC; // ��ⷮ
   
  { //static �ʱ�ȭ ��!!
        CC = 1000;
    	System.out.println("static {     }");
    }
    
    { // �ν��Ͻ� �ʱ�ȭ ��!!
        Random rnd = new  Random(); 
    	CarNo = (int)rnd.nextInt()%8999+1000;
    	CarMaker = "Ford";
    	System.out.println("{     }");
    }
    
   /** 3) �����ڸ� ���ؼ� �ʵ带 �ʱ�ȭ �Ѵ�.
    *   - static ������<//Ȯ�� ���....>
    *    instance ������
    *    
    *    ================ �������� ���󵵰� ���� ����. 
    *    
    *    // �������� Ư¡
    *     1. Ŭ������ �̸��� ����
    *     2. ������ ����.
    *     3. ����ڰ� �ۼ����� ������ java���� �ƹ��ϵ� ���� �ʴ� �⺻ �����ڸ� �ڵ����� ���������� ����
    *     4. �����ڴ� �޼��� �����ε��� �����ϴ� ==> ���� �̸��� �Լ��� ���� �������� �ۼ��Ǵ� ��, �� �Ű����� ���� Ÿ���� �޶�� �Ѵ�.
    */ 
    
    BenzCar(){}
    BenzCar(String Name)
    { // instance ������ �ʱ�ȭ
    	CarNo = 4885;
    	CarMaker = Name;
    	System.out.println("MiniCar(String Name)");
    }
    
}

public class _09_09_Initialization {
	public static void main(String []args)
	{
		BenzCar car  = new BenzCar("ũ���̽���");
		BenzCar car1  = new BenzCar("����");
		BenzCar car2  = new BenzCar("����ι�");
		System.out.println(car.CarMaker + " �ڵ��� ȸ���? ");
		System.out.println(car.CC + " ��ⷮ��?");
		System.out.println(car.CarNo + "���� ��ȣ��?");
	}
   // final : ������ �ʴ� ���� , this(�߿�~~~~!!!!)
	
}
