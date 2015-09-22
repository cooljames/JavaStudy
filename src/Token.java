import java.util.StringTokenizer;
public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Text = "<html>"
				
				+ "<head> Bit"
				+ "<head>"
				+ "<br> 비트교육센터"
				+ "</body>"
				+ "</html>";
	    	
				
		
		StringTokenizer st = new StringTokenizer(Text);
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
