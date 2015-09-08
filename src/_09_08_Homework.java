import java.util.Scanner;

/**
 * @author James
 * @parameter : 매개변수
 * 
 * 1) 메뉴체계
 * =================================
 * -> 2차원 배열을 이용한 주차타워
 * -> 1~3층 
 *    [][][][][]
 *    [][][]
 *    [][][][][][]
 *    
 *  -> 차량번호로 관리
 * ===============
 * 1)입차  2)출차  3)출력  4)주차공간 설정
 *    
 */
public class _09_08_Homework {
	
	public static void InsertCar(int [][] Parking){ //입차
	}
	//사용자에게 주차 할 위치와 차량  번호를 입력 받아 삽입!!
	
	public static void ParkSetting(int[][] Parking) { //파킹공간 세팅
		Scanner scan = new Scanner(System.in);
		int size = 0;
		int j = scan.nextInt(); // 객체 생성 
		
		for(int i=0; i<4; i++){
			for(j=0; j<4; j++)
			{
			System.out.print("주차공간: ");
		   }
		}
	}
	public static void Print(int[][] Parking) //출력 
	{
		for(int[] is: Parking){
			for(int i: is){
				if(i==0)
					System.out.print("[주차가능]");
				else
					System.out.println("");
			}
		}
	}
	public static void DeleteCar(int[][] Parking) {//출차
		
		// 사용자에게 차량번호를 입력 받아서 해당하는 차량의 번호를 삭제
	}
	
	   
	public static void main(String[] args) {
		int[][] Parking = new int[3][]; // 사용자에게 층별 주차 공간 확보!
		int Select = 0;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("1)입차  2)출차  3)출력  4)주차공간 설정 0)종료");
			Select = scan.nextInt();
		
		switch (Select) {
		case 1: InsertCar(Parking); break;
		case 2: DeleteCar(Parking); break;
		case 3: Print(Parking); break;
		case 4: ParkSetting(Parking); break;
	    case 0: return; // End

		}
	  }
	}
}
	
	


