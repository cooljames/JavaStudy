import java.util.*;

/**
 * @author James 09.07
 */
public class _09_07_BuyLotto {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
//		System.out.println("º¹±ÇÀ¸·Î ¶¼µ· ¹ú ´ç½ÅÀÇ ÀÌ¸§Àº? : " + name);
		
		int [] lottoArray = new int[5];
		lottoArray[0] = 12;
		lottoArray[1] = 2;
		lottoArray[2] = 32;
		lottoArray[3] = 42;
		lottoArray[4] = 22;
		lottoArray[5] = 23;
		
		Random rnd = new Random();
		
		for (int i = 0; i < lottoArray.length; i++) {
			System.out.println(i);
			
		}
		
	}
}

