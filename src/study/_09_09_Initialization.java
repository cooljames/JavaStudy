package study;

/**
 * 
 * @author James
 *
 * ======
 *  �ʱ�ȭ
 * ======
 * 
 * 
 *
 */


class BenzCar
{
	int CarNo;  // ������ȣ
    String CarMaker; // ����ȸ�� 
    double CC; // ��ⷮ
}

public class _09_09_Initialization {
	public static void main(String []args)
	{
		BenzCar car  = new BenzCar();
		System.out.println(car.CarMaker + " �ڵ��� ȸ���? ");
		System.out.println(car.CC + " ��ⷮ��?");
		System.out.println(car.CarNo + "���� ��ȣ��?");
	
	}
   
}
