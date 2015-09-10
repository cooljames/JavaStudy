/**

* =============
 *    클래스
 * =============
 * - 속성: 필드, 인스턴스 필드, 클래스 필드(static)
 * - 행동(메소드): 멤버함수, 함수, 서브루틴, 프로시져, function
 *   1) 객체가 수행해야 할 행동을 정의한다.
 *   2) 행동을 통해서 필드의 데이타를 제어한다.
 *   3) 객체의 초기화(생성자)
 *  
 *   . 함수(메소드)
 *   -> 호출하는 곳으로부터 매개변수를 전달 받아서 고유의 기능을 수행하고 그 결과를 호출한 곳으로
 *      되돌로 주는 코드 블럭
 *  ==============
 *  메소드를 선언하는 방법
 *  ==============
 *  
 *  리턴타입 함수의 이름(파라미터: 매개변수 목록) <- 함수의 선언부
 *  { 
 *  실행코드
 *  } <--------------- 함수의 바디(몸통) 구현부
 *  
 *  ex) 2개의 정수를 매개 변수로 전달 받아 두수의 합을 리턴하는 함수
 *  
 *
 */

	
	// 생성자는 객체가 생성될 때 자동을 호출되어 필드의 초기화를 하는 특수 목적의 함수!!



				
		//return : 메서드가 호출한 곳으로 되돌려줄 값
		// 함수이름: 식별자의 네이밍 룰과 동일하다.
		// 매개변수(파라미터, 인수, 인자값): 함수를 호출한 곳에서 함수쪽으로 전달해주는 값!!
		// 한기능을 가진 함수는 한페이지를 넘기지 말아라~(재사용성이 좋아진다.)
 	  
		//====================
 	   	// 생성자 : 클래스와 이름 동일
		// 리턴이 없는 특수한 형태
 	   	// 기본 생성자를 자동 생성
 	   	//====================
		

		// 위의 4개의 필드를 적절한 초기화 코드를 작성


class Book 
{
	String BookName; 	// 제목 
	String BookWriter;  // 저자
	   int  TotalPages;    // 총 페이지 
	   int  CurrentPage = 0 ;  // 현재 페이수 
	 // 위의 4개의 필드를 적절한 방법으로 초기화 !! 
	 //==================================================================
	 // -  클래스와 이름 동일 
	 // -  리턴이 없는 특수한 형태  
	 // -  기본생성자를 자동 생성  
	 // -  오버 로딩 가능 !! 
	 //==================================================================
	  Book()  // 매개변수 없는 생성자 :  기본생성자 !!
	  {
		  System.out.println("Book()");
	  }
	  // 생성자는 객체가 생성될때 자동으로 호출되어 필드의 초기화를 하는 특수 목적의 함수 !! 
	  Book(String name , String writer, int pages )
	  {
		  BookName = name; 
		  BookWriter = writer; 
		  TotalPages = pages;
		  System.out.println("Book(String name , String writer, int pages )" );
	  }
	  //==================================================================
	  int Open( int NewPage ) // openbook
	  {
		  CurrentPage = NewPage;
		  return CurrentPage;
	  }
	  void Close()	// closebook 
	  {
		  CurrentPage = 0;
	  }
	  int NextPage() // 다음장 
	  {
		  if( CurrentPage < TotalPages) 
			  CurrentPage++;
		  return CurrentPage;
	  }
	  int PrevPage() // 이전 장 
	  {
		  if(CurrentPage > 1)
			  CurrentPage--;
		  return CurrentPage;
	  }
}
public class _09_10_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Book b1 =  new Book("삼국지", "이문열", 1000 ); 
	    System.out.println( b1.CurrentPage );
	    b1.Open( 1 ); 
	    System.out.println( b1.CurrentPage );
	    
	    for (int i = 0; i < b1.TotalPages;  i++) {
	    	System.out.println(  b1.NextPage() );
		}
	    b1.Close(); 
	}

}

