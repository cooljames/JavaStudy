/*
 *=======================================================
 *  클래스 디자인 -> 사물, 상황, 사람, 사건, 정황, 자연현상, 순간, 감정 등등

 *=======================================================
 * -> 예약
 * -> 사랑
 * -> 태풍
 * -> 업무(프로세스)를 가장 많이 다루게 된다.
 * 
*/
        // 예약
		class Reserve
		{ 
			//속성(property, field) : 객체의 정량적인 수치로 표현 가능한 데이터 ==> 멤버 변수
		    String Rdate ;// date
		    int People; // 
		    
		    //Create Read Update Delete(CRUD): 데이타에서 가장 기본적인 수행을 할 수 있는 삽입, 삭제, 조회, 수정 기능
		    void CreateReserve(){}
		    void CancelReserve(){}
		    void ModifyReserve(){}
		    void SelectReserve(){}
		    //행동

		}
		
//===========
// 사랑
//===========
		class Love
		{
			String StartDate;
			String Event;
			int Pay;
			
			
			void Start(){}
			void End(){}
		}
			
//==========
// 태풍
//==========
		
		class Typhoon
		{
			int TNo;
			String Name;
			int Size;
			int Speed;
			
			void Move(){}
			void Rain(){}
			void Wind(){}
			void Creat(){}
			void Destroy(){}
		}


/**
 * @author bit-user
 *
 */
public class _09_08_Reserv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
