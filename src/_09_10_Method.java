/**

* =============
 *    Ŭ����
 * =============
 * - �Ӽ�: �ʵ�, �ν��Ͻ� �ʵ�, Ŭ���� �ʵ�(static)
 * - �ൿ(�޼ҵ�): ����Լ�, �Լ�, �����ƾ, ���ν���, function
 *   1) ��ü�� �����ؾ� �� �ൿ�� �����Ѵ�.
 *   2) �ൿ�� ���ؼ� �ʵ��� ����Ÿ�� �����Ѵ�.
 *   3) ��ü�� �ʱ�ȭ(������)
 *  
 *   . �Լ�(�޼ҵ�)
 *   -> ȣ���ϴ� �����κ��� �Ű������� ���� �޾Ƽ� ������ ����� �����ϰ� �� ����� ȣ���� ������
 *      �ǵ��� �ִ� �ڵ� ��
 *  ==============
 *  �޼ҵ带 �����ϴ� ���
 *  ==============
 *  
 *  ����Ÿ�� �Լ��� �̸�(�Ķ����: �Ű����� ���) <- �Լ��� �����
 *  { 
 *  �����ڵ�
 *  } <--------------- �Լ��� �ٵ�(����) ������
 *  
 *  ex) 2���� ������ �Ű� ������ ���� �޾� �μ��� ���� �����ϴ� �Լ�
 *  
 *
 */

	
	// �����ڴ� ��ü�� ������ �� �ڵ��� ȣ��Ǿ� �ʵ��� �ʱ�ȭ�� �ϴ� Ư�� ������ �Լ�!!



				
		//return : �޼��尡 ȣ���� ������ �ǵ����� ��
		// �Լ��̸�: �ĺ����� ���̹� ��� �����ϴ�.
		// �Ű�����(�Ķ����, �μ�, ���ڰ�): �Լ��� ȣ���� ������ �Լ������� �������ִ� ��!!
		// �ѱ���� ���� �Լ��� ���������� �ѱ��� ���ƶ�~(���뼺�� ��������.)
 	  
		//====================
 	   	// ������ : Ŭ������ �̸� ����
		// ������ ���� Ư���� ����
 	   	// �⺻ �����ڸ� �ڵ� ����
 	   	//====================
		

		// ���� 4���� �ʵ带 ������ �ʱ�ȭ �ڵ带 �ۼ�


class Book 
{
	String BookName; 	// ���� 
	String BookWriter;  // ����
	   int  TotalPages;    // �� ������ 
	   int  CurrentPage = 0 ;  // ���� ���̼� 
	 // ���� 4���� �ʵ带 ������ ������� �ʱ�ȭ !! 
	 //==================================================================
	 // -  Ŭ������ �̸� ���� 
	 // -  ������ ���� Ư���� ����  
	 // -  �⺻�����ڸ� �ڵ� ����  
	 // -  ���� �ε� ���� !! 
	 //==================================================================
	  Book()  // �Ű����� ���� ������ :  �⺻������ !!
	  {
		  System.out.println("Book()");
	  }
	  // �����ڴ� ��ü�� �����ɶ� �ڵ����� ȣ��Ǿ� �ʵ��� �ʱ�ȭ�� �ϴ� Ư�� ������ �Լ� !! 
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
	  int NextPage() // ������ 
	  {
		  if( CurrentPage < TotalPages) 
			  CurrentPage++;
		  return CurrentPage;
	  }
	  int PrevPage() // ���� �� 
	  {
		  if(CurrentPage > 1)
			  CurrentPage--;
		  return CurrentPage;
	  }
}
public class _09_10_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Book b1 =  new Book("�ﱹ��", "�̹���", 1000 ); 
	    System.out.println( b1.CurrentPage );
	    b1.Open( 1 ); 
	    System.out.println( b1.CurrentPage );
	    
	    for (int i = 0; i < b1.TotalPages;  i++) {
	    	System.out.println(  b1.NextPage() );
		}
	    b1.Close(); 
	}

}

