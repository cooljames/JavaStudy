package study;

/**
 * 
 * @author James
 *
 * ======
 *  초기화
 * ======
 * 
 * 
 *
 */


class BenzCar
{
	int CarNo;  // 차랑번호
    String CarMaker; // 차량회사 
    double CC; // 배기량
}

public class _09_09_Initialization {
	public static void main(String []args)
	{
		BenzCar car  = new BenzCar();
		System.out.println(car.CarMaker + " 자동차 회사는? ");
		System.out.println(car.CC + " 배기량은?");
		System.out.println(car.CarNo + "차량 번호는?");
	
	}
   
}
