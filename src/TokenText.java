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
		
		String.valueOf(s);
		System.out.println(s);
		
		while( st_br.hasMoreTokens()) 
		{
			System.out.println( st_br.nextToken());
					// System.out.println("");
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
		
		
		String.valueOf(s);
		System.out.println(s);
	}
	

}


/*
�߱� ���� 3

HTML ������ �ҽ��� �о �� ����� �����ִ� ���α׷��� �ۼ��Ͻÿ�.
- HTML�������� <hr>,<br> �±׸� �����Ѵ�.
- ������ ���̰� 30���ڰ� �Ѿ�� �� �ٲ�
- <br> �±׸� �а� �Ǹ� �� �ٲ�
- <hr> �±��� ��� ------------------------------------- (80�� ���� ���)
�Է�

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

 


���

Hallo, dies ist eine ziemlich lange Zeile, die in Html aber nicht umgebrochen

wird.

Zwei


produzieren zwei Newlines. Es gibt auch noch das tag

--------------------------------------------------------------------------------

was einen Trenner darstellt. Zwei

--------------------------------------------------------------------------------

produzieren zwei Horizontal Rulers. Achtung mehrere Leerzeichen irritieren Html

genauso wenig wie mehrere Leerzeilen.

�򰡱���

1. ���ڿ� ���۸� �̿��� �ؽ�Ʈó�� 

2. �κ� ���ڿ� �˻� �� ��� 

3. ���ڿ� �Լ��� ������ Ȱ�� 

*/








 
