/**

Java의 메모리

============
Class Loader
============

Method Area   Heap     Stack    Registers     Constant Pool
===========================================================
| Runtime Data Area|
====================

==============
Execute Engine
==============

code

static 전역변수

stack 지역변수

heap 동적메모리

* 자바는 임베디드 표준 환경을 만들기 위해 만들어진것이다.
=====================================
자바 언어의 자료형
=====================================

* --변수: 필요한 데이터를 저장하고 보관하는 곳 - 메모리, 그 메모리 공간에 대한 이름.
*   -----------------------------------------------------
* # 시작 메모리에서 거리값을 주소값이라 한다.
* # 프로그래머의 역할은 사람이 하는 일을 기계어로 번역해주는 번역가이다.
* # java 언어를 공부하고 C++언어를 해보면 좋다. 자바가 실행되는 원시적인 내용을 다 보여준다.
* # 자바언어가 C언어에 비해 느릴 수 밖에 없는 이유중 하나는 힙메모리를 많이 쓰기 때문이다.
*
*  - 변수의 종류
*    .기본형 타입: int, double, char, String etc
*    .참조형 타입(객체형, 사용자정의 클래스 타입): Class로 만든 사용자 정의 변수
*     - 객체(new를 통해서 만든 변수)는 전부 동적 메모리 영역(Heap)에 있게 된다.
*     
*    메모리에 저장되는 위치에 따라 다르다. 
*    
*    전역
*    지역 str은 지역변수로 저장된다.
*    동적 'AAA' 저장된다.
* =========================================================
*  자바의 기본 자료형
*  
*     .숫자 
*         - 정수: byte 1, short 2, int 4, long 8
*         - 실수: float 4, double 8
*     
*     .문자   
*         - char 2byte, 
*     .문자열
*         - String class 타입, 사이즈는 알 수 없다.     
*     .논리형 
*         - 불리언(Boolean): true, false를 저장하기 위한 타입!
*   
*   타입 캐스팅(형변환)
*     . 크기가 큰 변수를 작은 변수로 변환 ==> 암시적 자동 형변환을 통해 가능, 별도의 처리가 필요없음.
* 
* =====================================================================
*     java 연산자
*     
*     1)산술
*     
*     - 단항 : 혼자(스스로) i++
*     - 이항 : 10 + 10;
*     - 삼항 :  조건? true, false;
*       . 사칙2항 연산자: +, -, *, *, %(나머지 연산자)
*       . 증감연산자: ++, --
*         --> 전치: ++ 변수이름 -> ++를 먼저 실행
*         --> 후치: 변수이름 ++ -> ++를 마지막에 실행
*         
*     2) 비교 연산자: true, false를 판별 ex) if(i>100) 값을 비교하기 위한 목적
*       . >, <, >=, <=, ==(같다)  
*       . instanceof : 객체 판별을 위해서 사용
*       . 논리연산자 
*         - &&(and) 둘 다 참일 경우 판별
*         - ||(or) 둘중 하나가 참인 경우 판별
*         
* ======================================================================
*         
*       // 과제 1) &&, ||, &, | 의 차이. 
*          과제 2) ~10하면, -11이 나오는 이유. 
*          과제 3) >>>, >> 차이점은?  <<<는 왜 에러인가?
*       
* ======================================================================
* 
*     3) 비트 연산자 
*     
*      - 10 << 2
*       00001010 --> 00101000
*       
*      - &, | : 비트 연산
*      - ^ : xor : 비트가 두개가 다를 때만 true. 
*      - >>, >>> (시프트 연산자)
*     
*     4) new 연산자: heap메모리에 개체의 인스턴스를 생성할 때 사용. 
*        - 삭제는 따로 없으며 garbage collection에서 처리함.  
*    
 * @author bit-user
 * 
 */


public class _09_03_JavaMemory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double pointJava = 94.12;
		String javaLanguage = "James가 만들었지만";
		int StudentNo = 15; // 선언과 동시에 초기화
		int Kor = 80, Eng = 90, Math = 100; // 여러개의 변수를 지정할 수 있다.
		// int a, char ch; 형태는 될 수 없다. 형이 다른 변수를 함께 선언할 수 없다.
		System.out.println( javaLanguage + " 자바 수업은 좀 어렵다." + "점수는" + pointJava + " 이다");
		// TODO Auto-generated method stub
		System.out.println(StudentNo);
		String str = new String();
		str = "AAA : 동적메모리에 상주하게 된다.";
		System.out.println(str);
		
		byte b = 32;
		int i = b;
		System.out.println(i);
		
		i = 127;

		// 정수 타입의 형변환
		
		//강제 형변환(casting)을 통해서 가능
		byte c = (byte)i;
		System.out.println("c is:" + c);
		
		// 자바는 기본 리터럴 실수형은 double을 사용한다. 
		float f = 3.14f;
		float f1 = (float)3.14; //형변환.
		
		int i1 = (int) f;
		System.out.println("f=" + f);
		System.out.println("i1=" + i1);
		
		// byte g = d + e; byte + byte = integer가 되므로 에러를 발생한다.
		// 자바는 고급언어로 type에 대한 엄격성이 있다.
		
		byte d = 1;
		byte e = 1;
	
		int g = d + e;
		System.out.println("g = :" + g);
		
		int k = 10;
		System.out.println("k = :" + k++); //10
		System.out.println("k = :" + k++); //11
		System.out.println("k = :" + k++); //12
		
		int j = 10;
		
		System.out.println("k = :" + j++); //12
		System.out.println("k = :" + j--); //12
		System.out.println("k = :" + ++j); //12
		

		if (str instanceof String)
		{
			System.out.println("true");
		}
		
		System.out.println("*######*");
		
		int p = 10;
		int q = 20;
		if(p > 100 && q < 100)
			System.out.println("true");
		else
			System.out.println("false");

		System.out.println("*######*");		
		
		int z = 10;
		System.out.println(z << 2);
		
		System.out.println("10 & 40 :" + (10 & 40));
		System.out.println("10 | 40 :" + (10 | 40));
		System.out.println("10 ^ 40 :" + (10 ^ 40));
		System.out.println("10 >>> 2 :" + (10 >>> 2));
		System.out.println("~10 :" + (~10 ));
		
	}
}
