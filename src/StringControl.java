import java.util.*;

import java.io.*;

public class StringControl {

	private static String line;

	public static void main(String[] james) throws NullPointerException {

		Scanner scan = new Scanner(System.in);
		System.out.println("읽을 파일 이름을 입력하세요!");
		String FileName = scan.nextLine();
		System.out.println(FileName);

		String path = StringControl.class.getResource("").getPath(); // 현재 클래스의  절대 경로를  가져온다.
		String pathLast = path.replace("bin/", "src/");
		System.out.println(pathLast); // --> 절대 경로가 출력됨

		File realFile = new File(pathLast + FileName); // path 폴더 내의 파일 이름을 가리킨다.

		try {

			FileReader fileReader = new FileReader(realFile);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				String trimLine = line.trim();
				String lineToRemove = "pakage";

				/*
				 * if(line.contains(lineToRemove)) continue;
				 * 
				 * line = null;
				 */

				System.out.println(line);
			}
			bufferedReader.close();
		}

		catch (FileNotFoundException e) {
			System.out.println(FileName + " 파일을 찾을 수 없습니다.");
		}

		catch (IOException e) {
			System.out.println(FileName + " 파일을 읽을 수 없습니다.");
		}

		// int lengthS = line.length();
		
		
		String saveFile = scan.nextLine();
		System.out.println("쓸 파일 이름을 입력하세요!");
		
		try {
			FileWriter fileWiter = new FileWriter(saveFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
