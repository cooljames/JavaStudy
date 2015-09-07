/**
 * @author James
 * 
 * =====================
 * 가변 배열 // 아래 형태의 배열
 * =====================
 *  [][][]
 *  [][]
 *  [][][][][][]
 *  => 배열의 최대 단점은 메모리를 정해두기 때문에 낭비가 심하다.
 *  
 *  스택에 주소값을 주고, 힙에 비어 있는 3행의 비어 있는 힙주소를 만들어
 *  [3][2][6]의 힙주소를 넣는다.
 *  
 */ 
public class _09_07_Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] Varray = new int [3][]; // 행은 3개, 열은 아직 ?
		
		Varray[0] = new int[4];
		Varray[1] = new int[2];
		Varray[2] = new int[7];
		
		for (int [] arr: Varray) 
		{
			for(int i: arr);
		}
	//	System.out.println("[" + i + "]");
	}

}

// [1][23][17][27][6][42] // 사용자 입력, 랜덤 // 로또 구입 프로그램 // 행에서는 중복된 번호가 나오지 않고,
                          // 열에서는 중복이 될 수 있다.
// [1][2][3][4]
// [5][6][7][8]
// [9][10][11][12]

// 1) 로또 구입 Random
// 2) 중복값 제거
// 3) 선택적 구입 가능