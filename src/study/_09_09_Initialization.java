package study;

import java.util.Random;

/**
 * 
 * @author James
 *
 * ======
 *  초기화
 * ======
 * 
 * 1) 선언과 동시에 직접 초기화!!
 *  ex) int CarNo = 0;
 *  	String CarMaker = Benz;
 * 2) 초기화 블럭을 만들어서 사용
 *   {
 *   멤버 변수의 초기화
 *   }
 *   
 * 3) 생성자를 통해서 필드를 초기화 한다.
 *   - static 생성자<//확인 요망....>
 *    instance 생성자
 *    
 *    ================ 생성자의 사용빈도가 가장 높다. 
 *    
 *    // 생성자의 특징
 *     1. 클래스와 이름이 동일
 *     2. 리턴이 없다.
 *     3. 사용자가 작성하지 않으면 java언어에서 아무일도 하지 않는 기본 생성자를 자동으로 내부적으로 생성
 *     4. 생성자는 메서드 오버로딩이 가능하다 ==> 같은 이름의 함수가 여러 버전으로 작성되는 것, 단 매개변수 수나 타입이 달라야 한다.
 */  

// 실행순서
class BenzCar
{
	int CarNo;  // 차랑번호
    String CarMaker; // 차량회사 
  static double CC; // 배기량
   
  { //static 초기화 블럭!!
        CC = 1000;
    	System.out.println("static {     }");
    }
    
    { // 인스턴스 초기화 블럭!!
        Random rnd = new  Random(); 
    	CarNo = (int)rnd.nextInt()%8999+1000;
    	CarMaker = "Ford";
    	System.out.println("{     }");
    }
    
   /** 3) 생성자를 통해서 필드를 초기화 한다.
    *   - static 생성자<//확인 요망....>
    *    instance 생성자
    *    
    *    ================ 생성자의 사용빈도가 가장 높다. 
    *    
    *    // 생성자의 특징
    *     1. 클래스와 이름이 동일
    *     2. 리턴이 없다.
    *     3. 사용자가 작성하지 않으면 java언어에서 아무일도 하지 않는 기본 생성자를 자동으로 내부적으로 생성
    *     4. 생성자는 메서드 오버로딩이 가능하다 ==> 같은 이름의 함수가 여러 버전으로 작성되는 것, 단 매개변수 수나 타입이 달라야 한다.
    */ 
    
    BenzCar(){}
    BenzCar(String Name)
    { // instance 생성자 초기화
    	CarNo = 4885;
    	CarMaker = Name;
    	System.out.println("MiniCar(String Name)");
    }
    
}

public class _09_09_Initialization {
	public static void main(String []args)
	{
		BenzCar car  = new BenzCar("크라이슬러");
		BenzCar car1  = new BenzCar("포드");
		BenzCar car2  = new BenzCar("랜드로버");
		System.out.println(car.CarMaker + " 자동차 회사는? ");
		System.out.println(car.CC + " 배기량은?");
		System.out.println(car.CarNo + "차량 번호는?");
	}
   // final : 변하지 않는 변수 , this(중요~~~~!!!!)
	
}
