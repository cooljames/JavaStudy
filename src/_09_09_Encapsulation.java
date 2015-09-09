/**
 * ==========
 * 객체와 참조 변수
 * ==========
 * 참조변수(참조자, Reference): 함수 Stack에 선언되어지는 지역변수로 Heap에 할당된 객체를 참조
 *  ==> c언어에서 포인터의 역할을 한다.
 */

/**
 * @author James
 *
 */

class Book
{
	String BTitle;     //제목
	String BWriter;    //저자
	int Pages;		   //페이지 수
//	c언어에서의 구조체...변수는 있지만 메소드는 없는.
}

/** encapsulate(incapsulation)     
 * 미국·영국 [ɪn|kӕpsjuleɪt] 발음듣기 영국식 발음듣기 예문보기  (몇 마디 말이나 하나의 글 속에) 요약하다
 */ 

public class _09_09_Encapsulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Book book1; //참조변수(Reference) 
	// local 변수로 스택에 일단 저장된다
	// 하나의 레퍼런스는 여러개의 객체 참조가 가능하다? y/n  아니다.
	// 하나의 객체는 여러개의 레퍼런스가 참조 가능하다? y/n  맞다. 그 목적으로 참조를 생성.
    book1 = new Book(); // Book 객체를 생성하고 참조하게 한다.
    
    book1.BTitle = "밥먹고 놀자";
    book1.BWriter = "식객";
    book1.Pages = 609;
    
    Book book2;
    book2 = new Book();
    
    book2.BTitle = "장발장";
    book2.BWriter = "빅토르위고";
    book2.Pages = 610;
    
//    book1.Pages = book2.Pages; // 변수에 변수의 값을 대입
    book1 = book2; // book1의 스택 book2의 객체를 참조
    
    System.out.println(book1.BTitle + ":" + book2.BTitle);
    book2.BTitle = "Positive Thinking";
    System.out.println(book1.BTitle + ":" + book2.BTitle);
    
    System.out.println(book1);
    System.out.println(book2);
    
//   book1에 대응하던 밥먹고 놀자에 관계되는 내용은 전부 Reference counter가 0이 돼서 garbage collection에 의해 정리된다.
      
    
	}

}









