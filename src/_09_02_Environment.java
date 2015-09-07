/** 2015. 09.01
 * 1. Java Development Kit 
 * 	JDK 8.0.
 * 	www.oracle.com 다운로드 함.
 * 2. IDE(통합개발환경) - Eclipse를 사용함.
 *  www.eclipse.org에서 다운로드 함.
 * 3. 환경변수 설정
 *   - JAVA_HOME(변수이름) : 'C:\Program Files\Java\jdk1.8.0_45'(변수값)
 * 4. 시스템 변수 설정(자바 경로 추가)
 *   - path(변수이름)';%JAVA_HOME%\bin' (변수값)을 추가한다.
 *    
 * @author James 2015 .09 .02
 * 
 * 식별자(id): 다른 구분들과 구별하기 위한 이름
 * ==============================
 * - 변수, 클래스, 메서드(함수), 인터페이스 등등의 고유한 이름을 주는 규칙
 * - 특수기호는 넣을 수 없다.(_.$) Student_No(o)
 * - 기존의 키워드를 줄수 없다. int No(o), int interface(x)
 * - 숫자로 시작할 수 없다. 
 * - 일반적으로는 의미있는 두 단어를 연결해서 사용.
 * ===============================
 * 
 * 일반적인 자바의 코딩 규칙
 *  - 클래스(Class)의 이름은 대문자의 명사로 시작
 *  - 메소드(Method)의 이름은 소문자의 동사
 *  - 필드(field)는 소문자명사
 *  - 상수(constant)는 대문자 명사
 *  
 *  ==============================
 *  자바의 기본문법
 *  - 1) 문장의 끝은 ';'로 끝난다.
 *  - 2) 코드의 여백을 무시 : 문장 가독성을 생각해서 작성한다.
 *  - 3) c언의 특징을 그대로 갖는다.
 *  
 *  ==============================
 *  자바의 기본 함수
 *  - 1) 입출력 System.out.println
 *  - 2) out 객체에는 print(개행: 줄바꿈 없음)와 println(개행이 있음)이 있다.
 *  - 3) 매소드 오버로딩 기법으로 여러가지 타입의 매개변수를 인식하는 기능을 가지고 있다.
 */


public class _09_02_Environment {
	public static void main(String args[]) 
	{
	System.out.println ("안녕~ 자바 세상....!");

	// 학번

		int StudentNo; // 파스칼, pascal
		int studentNo; // 카멜(낙타) camel
		int Student_No; // _표기법
		StudentNo = 23;

		// 헝가리안 표기법
		int iStudentNo;
		String szName = "## 찰스시몬은 윈도우즈의 슈퍼개발자이다.##";
		System.out.print(" ");
		
		String javaRule1 = " 일반적인 자바의 코딩 규칙  "
						+ "- 클래스(Class)의 이름은 대문자의 명사로 시작 "
						+ "- 메소드(Method)의 이름은 소문자의 동사"
						+ "- 필드(field)는 소문자명사"
						+ "- 상수(constant)는 대문자 명사";
		int cbByte;

		System.out.println(szName + "자바 명명 규칙" + StudentNo);
		System.out.println(szName + "자바 명명 규칙" + StudentNo);
		System.out.println(szName + "자바 명명 규칙" + StudentNo);
		
		System.out.print(szName + "자바 명명 규칙" + StudentNo);
		System.out.println(szName + "자바 명명 규칙" + StudentNo);
		System.out.print(javaRule1);
	}
}

// 2015 .09 .03 githut 적용 시작~!
