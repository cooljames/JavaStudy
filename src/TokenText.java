import java.util.StringTokenizer;

public class TokenText {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Text =  "Hallo, dies ist eine "
				+ "ziemlich lange Zeile, die in Html"
				+ "aber nicht umgebrochen wird.<br>"
				+ "Zwei <br> <br> produzieren zwei Newlines."
				+ "Es gibt auch noch das tag <hr> was einen Trenner darstellt."
				+ "Zwei <hr> produzieren zwei Horizontal Rulers."
				+ "Achtung       mehrere Leerzeichen irritieren"
				+ "Html genauso wenig wie mehrere Leerzeilen";
		
		
		
		String Text_hr_change = (Text.replaceAll("<hr>", "------------------------------"));
		StringTokenizer st_br = new StringTokenizer(Text_hr_change , "<br>"); 
		String s = "-";
		int index_of_hr = Text.indexOf("-");
		while( st_br.hasMoreTokens()) 
		{
			System.out.println( st_br.nextToken());
			if (index_of_hr== -1) 
					System.out.println("");
			if (st_br.nextToken().length() >= 30)
				System.out.println("");
			
		}
/*		
		System.out.println(str.concat(s1));
		System.out.println(str.charAt(3));
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(str.length()));
		System.out.println(str.indexOf("<hr>"));
		System.out.println(str.replaceAll("Bit", ""));
		*/
	
	}

}


/*
중급 문제 3

HTML 문서의 소스를 읽어서 그 결과를 보여주는 프로그램을 작성하시오.
- HTML문서에는 <hr>,<br> 태그만 존재한다.
- 문장의 길이가 30글자가 넘어가면 줄 바꿈
- <br> 태그를 읽게 되면 줄 바꿈
- <hr> 태그일 경우 ------------------------------------- (80개 문자 출력)
입력

Hallo, dies ist eine 
ziemlich lange Zeile, die in Html
aber nicht umgebrochen wird.
<br>
Zwei <br> <br> produzieren zwei Newlines. 
Es gibt auch noch das tag <hr> was einen Trenner darstellt.
Zwei <hr> produzieren zwei Horizontal Rulers.
Achtung       mehrere Leerzeichen irritieren

Html genauso wenig wie
mehrere Leerzeilen.

 


출력

Hallo, dies ist eine ziemlich lange Zeile, die in Html aber nicht umgebrochen

wird.

Zwei


produzieren zwei Newlines. Es gibt auch noch das tag

--------------------------------------------------------------------------------

was einen Trenner darstellt. Zwei

--------------------------------------------------------------------------------

produzieren zwei Horizontal Rulers. Achtung mehrere Leerzeichen irritieren Html

genauso wenig wie mehrere Leerzeilen.

평가기준

1. 문자열 버퍼를 이용한 텍스트처리 

2. 부분 문자열 검색 및 사용 

3. 문자열 함수의 적절한 활용 

*/








 
