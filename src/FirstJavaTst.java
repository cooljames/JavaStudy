
public class FirstJavaTst {
	public static void main(String args[]) {
		System.out.println("Hello java...!, 자바는 객체다.");
	}
}
/*
* I. Java Langauge의 특성
* 
* 1. Simple
* 
* 2. Object Oriented Program
*  - 객체: 행동과 고유한 속성을 가짐
*  - 자연 현상도 객체화(태풍: 기압, 이름, 속도 등  행동: 바람, 비, 번개)  
* 
* 3. Distribution 
* 
*  - 프로그램의 규모가 너무 커짐으로서 잘게 쪼개서 처리해야 할 필요가 있게 됨.
*    (프로그램을 레고 형태로 만들게 된다.)
*    
*  - 유지보수가 편리, 협업하기가 편리.
*  - 대형 작업에서 asp가 jsp에 시장을 내주게 된 이유(분산처리가 약함: Jsp는 80port를 사용, 반면에 rpc를 사용한 asp는 곤란)
*  
* 
* II. Java Language의 특성
* 
*  1. 2단계의 컴파일 단계를 거친다.
*    .전기 컴파일: 개발자의 컴퓨터 개발환경에서 -javac가 컴파일, 후기 컴파일은 실행환경에서 JVM이.class를 실행파일(Binary code)로 만든다.
*    
*  2. Java Runtime Environment 환경에서 실행 됨. 
*  3. 시스템 환경에 최적화된 프로그래밍을 할 수 있다.(Jvm이 설치되어 있으므로 하드웨어 상황에 대한 고려를 할 필요가 적다.)  
*  
*  III. Java Language의 특성
*  
*  Runtime
*  
*   Class loader
*   
*   byte code verifier
*   
*   자바플랫폼.
*   
*  IV. Garbage Collection
*   
*   자바는 메모리 관리를 JVM에서 자동으로 처리해주게 된다.
*   힙메모리를 관리해주게 된다.(Malloc)
*   Free함수는 없다.- 자동으로 메모리 처리. 따라서 유연하고 강력한 유지보수성(편의성)을 가지고 있지만 성능상 느려지는 것을 피하기 어렵다.
*   
*  V. 응용: 서버페이지, EJB(Spring)등의 분산 프레임워크 기능으로 발전. 모바일(Android)
*  
*  식별자
*   
*/